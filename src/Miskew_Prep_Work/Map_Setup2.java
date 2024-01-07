package Miskew_Prep_Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

/**
 * This code was developed by Mr. Bush and modified by Mr. Miskew
 */
public class Map_Setup2 {

    //public enum tileType {water, beach, grassland, forest, hills, mountain, dunes};
    // 0 is water
    // 1 is sand
    // 2 is grassland
    // 3 is forest
    // 4 is hills
    // 5 is mountains
    // 6 is dunes
    
    //the coords of each of the four orthogonal neightbours. Feel free to change this to check others!
    public static int[][] orthogonalNeighbours = 
    {new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1}};

    public static void main(String[] args) {

    }
    
    public static ArrayList<Integer> getNeighbouringTileTypes(int x, int y, int[][] map){
        
        ArrayList<Integer> neighbours = new ArrayList<Integer>(); //list of the tile types (ints)
        
        int newX;;
        int newY;
        //loop through each Neighbour to check bounds
        for(int i = 0; i< orthogonalNeighbours.length; i++){

            newX = x + orthogonalNeighbours[i][0]; //add the offset
            newY = y + orthogonalNeighbours[i][1]; //each offset is for each neighbouring direction

            if( newX > 0 && //if x bigger than zero
                newY > 0 && //if y bigger than zero
                newX < map.length &&//and x less than bounds
                newY < map[0].length //and y less than bounds
            ){  
                neighbours.add(map[newX][newY]); //valid neighbour
            }
        }

        return neighbours;
    }

    public static int[][] generateMap(int width, int height){
    	
        //start by defining our variables and setting their initial values
        int[][] map = new int[width][height];

        ArrayList<Integer> neighbouringTiles = new ArrayList<Integer>();

        for (int[] row: map){ //for each row, fill that row with -1s
            Arrays.fill(row, -1);
        }

        for(int x = 0; x < width; x++){


            for(int y = 0; y< height; y++){
                
                //get the tile types of our neighbours around that tile
                neighbouringTiles = getNeighbouringTileTypes(x,y,map);
                System.out.println(neighbouringTiles.toString());;
                //get a list of what possible tiles could be there, based on the neighbours
                ArrayList<Integer> possibilities = getTilePossibilities(neighbouringTiles);
                //choose one of the possibilities at random
                map[x][y] = Collapse(possibilities);

            }

        }
        /*
        System.out.println("Generated Map");
        for(int i = 0; i < width; i++){
            for(int j = 0; j< height; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        */
        return map;

    }

    public static ArrayList<Integer>  getTilePossibilities(ArrayList<Integer> neighbouringTileTypes){
        //initialize a list of the remaining possibilities
        ArrayList<Integer> remainingPossibilities = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6));
        // 0 is water
        // 1 is sand
        // 2 is grassland
        // 3 is forest
        // 4 is hills
        // 5 is mountains
        // 6 is dunes
        while (neighbouringTileTypes.size() > 0){
            //grab the first of our neighbouring tile types
            switch(neighbouringTileTypes.remove(0)){
                case -1: //ignore unitialized tiles
                    break;
                case 0://water
                    //can't be next to anything other than water or sand
                    remainingPossibilities.remove(Integer.valueOf(2));
                    remainingPossibilities.remove(Integer.valueOf(3));
                    remainingPossibilities.remove(Integer.valueOf(4));
                    remainingPossibilities.remove(Integer.valueOf(5));
                    remainingPossibilities.remove(Integer.valueOf(6));
                    break;    
                case 1: //sand
                //can't be next to mountains or forest
                    remainingPossibilities.remove(Integer.valueOf(3));
                    remainingPossibilities.remove(Integer.valueOf(5));
                    break;    
                case 2://grassland
                //can't be next to mountains, dunes, water
                    remainingPossibilities.remove(Integer.valueOf(0));
                    remainingPossibilities.remove(Integer.valueOf(5));
                    remainingPossibilities.remove(Integer.valueOf(6));
                    break;
                case 3://forest
                //can only be next to forest, grassland or hills
                    remainingPossibilities.remove(Integer.valueOf(0));
                    remainingPossibilities.remove(Integer.valueOf(1));
                    remainingPossibilities.remove(Integer.valueOf(5));
                    remainingPossibilities.remove(Integer.valueOf(6));
                    break;
                case 4://hills
                //can't be next to water
                    remainingPossibilities.remove(Integer.valueOf(0));
                    break;
                case 5://mountains
                //can only be next to hills
                    remainingPossibilities.remove(Integer.valueOf(0));
                    remainingPossibilities.remove(Integer.valueOf(1));
                    remainingPossibilities.remove(Integer.valueOf(2));
                    remainingPossibilities.remove(Integer.valueOf(3));   
                    remainingPossibilities.remove(Integer.valueOf(6));  
                    break;
                case 6://dunes
                //can only be next to hills, sand
                    remainingPossibilities.remove(Integer.valueOf(0));   
                    remainingPossibilities.remove(Integer.valueOf(2));   
                    remainingPossibilities.remove(Integer.valueOf(3));   
                    remainingPossibilities.remove(Integer.valueOf(5));   
                    break;
                }
        }
        if (remainingPossibilities.size() == 0){
            return new ArrayList<Integer>(Arrays.asList(0));//return water as a failsafe
        }
        return remainingPossibilities; //otherwise return the possibilities



    
    }


    public static int Collapse(ArrayList<Integer> possibilities){
        Random random = new Random();
        //here we select our random option. We also have the power to bias results
        //map each tile onto a probability
        Map<Integer,Double> weights = Map.of(
            0, 0.4,//water
            1,0.1,//sand
            2,0.5,//grassland
            3,0.1,//forest
            4,0.1,//hills
            5,0.1,//mountains
            6,0.1//dunes
        ); 
        Double totalWeight = 0.0;
        for(int i = 0; i < possibilities.size(); i++){
            //add each of our weights to our total
            totalWeight += weights.get(possibilities.get(i));
        }
        //generate a random number from 0 to 1 and scale by total weight
        Double randomWeight = random.nextDouble() * totalWeight;
        Double runningWeight = 0.0;
        for(int i = 0; i < possibilities.size(); i++){
            runningWeight += weights.get(possibilities.get(i));//add our weight
            if(runningWeight > randomWeight){//if we're over, that's our choice!
                return possibilities.get(i);//here's our choice!
            }
        }

        return possibilities.get(0);//failsafe
    }
}

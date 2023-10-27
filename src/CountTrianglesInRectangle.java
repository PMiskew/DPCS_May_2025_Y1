import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountTrianglesInRectangle {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("FILE3.txt"));
            FileWriter writer = new FileWriter("OUT3.txt");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int A = Integer.parseInt(parts[0]);
                int B = Integer.parseInt(parts[1]);
                int X = Integer.parseInt(parts[2]);
                int Y = Integer.parseInt(parts[3]);

                int count = countTrianglesInRectangle(A, B, X, Y);
                writer.write(count + "\n");
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean isRightTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        int max = Math.max(Math.max(a, b), c);
        int sum = a + b + c - max;
        return (max * max == (sides[0] * sides[0] + sides[1] * sides[1] - sum * sum));
    }

    static int countTrianglesInRectangle(int A, int B, int X, int Y) {
        int count = 0;
        for (int x1 = A; x1 <= X; x1++) {
            for (int y1 = B; y1 <= Y; y1++) {
                for (int x2 = x1; x2 <= X; x2++) {
                    for (int y2 = y1; y2 <= Y; y2++) {
                        int a = Math.abs(x1 - x2);
                        int b = Math.abs(y1 - y2);
                        int c = (int) Math.sqrt(a * a + b * b);

                        if (a != 0 && b != 0 && c != 0 && isRightTriangle(a, b, c)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
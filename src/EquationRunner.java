import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first Coordinate Point: ");
        String first = s.nextLine();
        System.out.print("Enter your second Coordinate Point: ");
        String second = s.nextLine();

        // Separate x's and y's from the coordinate point form
        String updatedFirst = first.substring(1, first.length() - 1);
        String updatedSecond = second.substring(1, second.length() - 1);
        String tempx1 = updatedFirst.substring(0, updatedFirst.indexOf(","));
        String tempy1 = updatedFirst.substring(updatedFirst.indexOf(",") + 1, updatedFirst.length());
        String tempx2 = updatedSecond.substring(0, updatedSecond.indexOf(","));
        String tempy2 = updatedSecond.substring(updatedSecond.indexOf(",") + 1, updatedSecond.length());
        int x1 = Integer.parseInt(tempx1);
        int y1 = Integer.parseInt(tempy1);
        int x2 = Integer.parseInt(tempx2);
        int y2 = Integer.parseInt(tempy2);
        LinearEquation done = new LinearEquation(x1, y1, x2, y2);
        System.out.print(done.toString());
        System.out.print("\nEnter a third x-value: ");
        String third = s.nextLine();
        double tempthird = Double.parseDouble(third);
        double y3 = done.solve(tempthird);
        System.out.println("Solved coordinate point is: (" + tempthird + "," + y3 + ")");
    }
}

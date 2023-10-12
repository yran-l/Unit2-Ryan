import java.lang.Math;
public class LinearEquation {


    // instance variables
    private int x1;
    private int x2;
    private int y1;
    private int y2;


    // constructor
   public LinearEquation(int x1, int y1, int x2, int y2){
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;
    }


    // methods
    public String firstPair(){
       return "(" + x1 + ", " + y1 + ")";
    }


    public String secondPair(){
       return "(" + x2 + ", " + y2 + ")";
    }


    public double slope(){
       return ((double)y2 - (double)y1) / ((double)x2 - (double)x1);
    }


    public double distanceBetweenPoints(){
       return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public double yIntercept(){
       return y1 - slope() * x1;
    }


    public String slopeInterceptForm(){
       return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + String.format("%.2f", yIntercept());
    }


    public double solve(double x){
       return (slope() * x + yIntercept());
    }


    public String toString(){
        return "First pair: " + firstPair() + "\nSecond pair: " + secondPair() + "\nSlope of line: " + String.format("%.2f", slope()) + "\nY-intercept: " + String.format("%.2f", yIntercept()) + "\nSlope Intercept form: " + slopeInterceptForm() + "\nDistance between points: " + String.format("%.2f", distanceBetweenPoints());
    }


}

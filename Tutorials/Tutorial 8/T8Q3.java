// Create  a  class  that  used  to  represent  the  2  dimension  coordinate  system.
// The  class consists  of  constructors,  instance  variables,  accessor  and  mutator  method  and  an 
// output method that display the x-coordinate and y-coordinate. 

class Coordinate {
    
    private double x;
    private double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void setCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void displayCoordinate() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

}

public class T8Q3 {

    public static void main(String[] args) {
        
        Coordinate p1 = new Coordinate(5.5, -2.1);

        System.out.print("Point 1 is at: ");
        p1.displayCoordinate(); 
        
        System.out.println("The x-coordinate is: " + p1.getX());

        System.out.println("Moving the point to (10, 20)");
        p1.setX(10);
        p1.setY(20);

        System.out.println("Point 1 is now at: " + p1);
    }
}
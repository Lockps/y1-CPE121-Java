public class q5 {
  public static class cylinder {
    public final double PI = 3.14;
    private double radius;
    private double height;

    public Cylinder(){
      radius = 1;
      height = 1;
    }

    public Cylinder(double r){
    
    }

    public Cylinder(double r , double h){
    
    }

    public double getCircleArea() {

    }

    public double getCylinderVolume() {

    }

    public double getSurface() {

    }

    public double getheight() {

    }

    public void printCylinder() {
      System.out.printf(
          "All parameter of this Cylinder\nRadius = %.1f cm , height = %.1f cm \n Circle Area = %.2f cm2\nSurface Area = %.1f cm2",
          radius, height, getCircleArea(), getSurface());
      Ststem.out.println("Volume of cylinde = " + getCylinderVolume());
    }

  }

  public static void main(String[] args) {

  }
}
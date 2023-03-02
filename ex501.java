public class ex501 {
    public static class Circle {
        public static final double CirclePi = 3.14;
        private double r;

        public Circle(double radius) {
            this.r = radius;
        }

        public double getArea() {
            return CirclePi * Math.pow(r, 2);
        }

        public double getVolume() {
            return (float) 4 / 3 * CirclePi * Math.pow(r, 3);
        }

        public double getcircumference() {
            return (2 * CirclePi * r);
        }

        public void display() {
            System.out.println("Circle area " + getArea());
            System.out.println("Circle getVolume " + getVolume());
            System.out.println("Circle ference " + getcircumference());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Circle ci1 = new Circle(4);
        Circle ci2 = new Circle(3);
        System.out.println("First Circle(C1)");
        System.out.println("=====================");
        ci1.display();

        System.out.println("Second Circle(C2)");
        System.out.println("=====================");
        ci2.display();
    }
}

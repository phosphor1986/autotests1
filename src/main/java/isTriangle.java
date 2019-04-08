public class isTriangle {

    public boolean isTriangleDouble(double a, double b, double c) {
        return ((Math.abs(a) + Math.abs(b)) > Math.abs(c)) && ((Math.abs(a) + Math.abs(c)) > Math.abs(b)) && ((Math.abs(c) + Math.abs(b)) > Math.abs(a));
    }
    public boolean isTriangleInt(int a, int b, int c) {
        return ((Math.abs(a) + Math.abs(b)) > Math.abs(c)) && ((Math.abs(a) + Math.abs(c)) > Math.abs(b)) && ((Math.abs(c) + Math.abs(b)) > Math.abs(a));
    }
}

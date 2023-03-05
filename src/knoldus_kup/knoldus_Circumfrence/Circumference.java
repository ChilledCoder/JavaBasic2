package knoldus_kup.knoldus_Circumfrence;

public class Circumference {
    public static void main(String[] args) {
        int radius = 3;
        final double pi = 3.14;

        double area = radius * radius * pi;
        double circumfrence = 2 * pi * radius;

        System.out.println("area of the circle " + area);
        System.out.println("circmfrence of circele " + circumfrence);
    }
}

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("In put radius: ");
        a= scanner.nextDouble();

        double S= Math.pow(a,2) * Math.PI;
        System.out.println("Circle area= " + S);

        double C= 2*a*Math.PI;
        System.out.println("Diametter of circle= " + C);
    }
}

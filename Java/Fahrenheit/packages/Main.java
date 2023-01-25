package packages;
import java.util.Scanner;

class Main {

  static void conversion(double celcius) {
    double fahrenheit = (1.8 * celcius) + 32;
    System.out.println(fahrenheit + " Fahrenheit");
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a degree in Celcius to be converted to Fahrenheit: ");
    conversion(scan.nextDouble());
  }
}
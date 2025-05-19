import java.util.Scanner;

public class Program1{
  static class Calculator{
    double a,b;
    Calculator(double a,double b){
      this.a=a;
      this.b=b;
    }

    double operate(String operation){
      switch (operation) {
        case "add" : return a+b;
        case "subtract" : return a-b;
        case "multiply" : return a*b;
        case "divide" : return b != 0 ? a / b : Double.NaN;
       default: return Double.NaN;
      }
    }
  }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b);
        System.out.println("Result: " + calc.operate(operation));
    }
}

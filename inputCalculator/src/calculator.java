import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        int number1 = input.nextInt();
        System.out.println("Please enter your second number");
        int number2 = input.nextInt();
        System.out.println("Please select your operation");
        System.out.println("1)Sum");
        System.out.println("2)Sub");
        System.out.println("3)Multi");
        System.out.println("4)Div");
        System.out.println("5)Power");
        int operations = input.nextInt();
        switch(operations) {
            case 1:
                System.out.println("Addition of "+ number1 + " and " + number2 +" is " + add(number1,number2));
                break;
            case 2:
                System.out.println("Subtraction of "+ number1 + " and " + number2 +" is " + sub(number1,number2));
                break;
            case 3:
                System.out.println("Multiplication of "+ number1 + " and " + number2 +" is " + mul(number1,number2));
                break;
            case 4:
                System.out.println("Division of "+ number1 + " and " + number2 +" is "+ div(number1,number2));
                System.out.println("With " + (number1%number2) + " remainders");
                break;
            case 5:
                System.out.println(number1 + " raises by power of " + number2 +" is " + pow(number1,number2));
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }public static int add(int num1, int num2) {
        return num1+num2;
    }
    public static int sub(int num1, int num2) {
        return num1-num2;
    }
    public static int mul(int num1, int num2) {
        return num1*num2;
    }
    public static int div(int num1, int num2) {
        return num1/ num2;
    }
    public static int pow(int num1, int num2) {
        int num = num1;
        for(int i= 1; i< num2; i++) {
            num1*= num;
            System.out.println(num1);
        }return  num1;
    }

}

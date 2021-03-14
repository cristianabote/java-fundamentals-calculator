import java.util.Scanner;

public class Calculator
{
    public static void main ( String[] args)
    {
        //Java Fundamentals - Calculator
        //Given a character representing the basic operations (+, -, *, /, %) write a program that displays
        // the value of the operation between x and y.
        //Input:
        //x,y - the numbers to operate on
        // char c
        //Output:
        //depending on the operation selected, the result of the operation between x and y
        //Example
        //x = 4, y = 3, c ='+' --> output: 7
        //x = 4, y = 3, c ='-' --> output: 1
        Scanner scan=new Scanner(System.in);
        int x,y;
        System.out.println("Introduceti cele doua numere: ");
        x=scan.nextInt();
        y=scan.nextInt();
        System.out.println("Introduceti caracterul in functie de operatia care doriti sa fie intre cele doua numere: ");
        String c=scan.next();

        switch(c)
        {
            case "+": System.out.println("x+y="+(x+y));
                break;
            case "-": System.out.println("x-y="+(x-y));
                break;
            case "*": System.out.println("x*y="+ (x*y));
                break;
            case "/": System.out.println("x/y="+(x/y));
                break;
            case "%": System.out.println("x%y="+(x%y));
                break;
            default: System.out.println(c+" operator invalid");
        }
    }
}
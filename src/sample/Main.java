package sample;

import java.util.Scanner;

public class Main {

    public static int calculateSum(int numberOne, int numberTwo){
      return numberOne+numberTwo;
    }
    public static int multiple(int numberOne, int numberTwo){
        return numberOne*numberTwo;
    }
    public static int division(int numberOne, int numberTwo){
        if(numberOne!=0&&numberTwo!=0)
        return numberOne/numberTwo;
        else
        {System.out.print("Dati numere diferite de zero");
        return numberOne/numberTwo;}
    }
    public static int down(int numberOne, int numberTwo){
        if(numberOne>numberTwo)
            return numberOne-numberTwo;
        else
            return numberTwo-numberOne;
    }
    public static int sum_down(int numberOne, int numberTwo){
        return calculateSum(numberOne,numberTwo)-down(numberOne,numberTwo);
    }
    public static int multiple_division(int numberOne,int numberTwo){
        return multiple(numberOne, numberTwo)-division(numberOne,numberTwo);
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);//aici se introduce nr de la tastatura;

        System.out.print("Primul numar: ");//aici se introduce nr de la tastatura;
        int firstNumber = scanner.nextInt();//aici se introduce nr de la tastatura;
        System.out.print("Al doilea: ");//aici se introduce nr de la tastatura;
        int secondNumber = scanner.nextInt();//aici se introduce nr de la tastatura;

        System.out.print("Inmultire:");
        System.out.println(multiple(firstNumber, secondNumber));
        System.out.print("Scadere:");
        System.out.println(down(firstNumber,secondNumber));
        System.out.print("Impartire:");
        System.out.println(division(firstNumber,secondNumber));
        System.out.print("Suma:");
        System.out.println(calculateSum(firstNumber, secondNumber));
        System.out.println("Suma si scadere:");
        System.out.println(sum_down(firstNumber, secondNumber));
        System.out.println("Diferenta intre inmultire si impartire:");
        System.out.println(multiple_division(firstNumber, secondNumber));
    }
}

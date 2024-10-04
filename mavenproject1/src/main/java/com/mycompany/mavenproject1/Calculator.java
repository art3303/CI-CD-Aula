package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String choise;
        ModelCalculator calc = new ModelCalculator();
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Digite um número entre:");
        System.out.println(" [1] soma \n [2] subtração \n [3] multiplicação \n [4] divisão");
        int op = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite um número: ");
            double num1 = sc.nextDouble();
            sc.nextLine();
        System.out.println("Digite outro número: ");
            double num2 = sc.nextDouble();
            sc.nextLine();
        switch (op) {
            case 1 ->                 {
                    double res = calc.soma(num1, num2);
                    System.out.println("o Resultado = " + res);
                }
            case 2 ->                 {
                    double res = calc.sub(num1, num2);
                    System.out.println("o Resultado = " + res);
                }
            case 3 ->                 {
                    double res = calc.multi(num1, num2);
                    System.out.println("o Resultado = " + res);
                }
            case 4 ->                 {
                    double res = calc.div(num1, num2);
                    System.out.println("O resultado = " + res);
                }
            default -> throw new RuntimeException("Digite um número valido");
       }
            System.out.println("Você deseja continuar? S/N");
            choise = sc.nextLine();
    }while(choise.equalsIgnoreCase("S"));    
  }
}
package com.joaovitor.calculadora.view;

import com.joaovitor.calculadora.service.CalculadoraService;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleView {
  private CalculadoraService calc;

  public ConsoleView(CalculadoraService calc) {
    this.calc = calc;
  }

  //methods
  public void exibirMenu() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = 0;
    do{
      System.out.println("Escolha uma opção: ");
      System.out.println("___________________");
      System.out.println("1 - somar");
      System.out.println("2 - subtrair");
      System.out.println("3 - dividir");
      System.out.println("4 - multiplicar");
      System.out.println("0 - sair");
      System.out.println("___________________");
      n = sc.nextInt();

      if(n == 0) {
        System.out.println("Encerrando programa...");
        System.out.println("Encerrado");
        break;
      } else if (n < 0 || n > 4) {
        System.out.println("Opção inválida");
        continue;
      }

      System.out.println("Escolha dois números para a operação: ");
      System.out.print("Número 1: ");
      double number1 = sc.nextDouble();
      System.out.print("Número 2: ");
      double number2 = sc.nextDouble();

      try {
        switch (n) {
          case 1:
            System.out.println(calc.addition(number1, number2));
            break;
          case 2:
            System.out.println(calc.subtraction(number1, number2));
            break;
          case 3:
            System.out.println(calc.division(number1, number2));
            break;
          case 4:
            System.out.println(calc.multiplication(number1, number2));
            break;
        }
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }


      System.out.println("");
    } while(n != 0);

    sc.close();
  }
}

package com.joaovitor.calculadora;

import com.joaovitor.calculadora.service.CalculadoraService;
import com.joaovitor.calculadora.view.ConsoleView;

public class Main {
  public static void main(String[] args) {
    CalculadoraService calc = new CalculadoraService();
    ConsoleView view = new ConsoleView(calc);

    view.exibirMenu();
  }
}

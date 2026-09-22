package com.joaovitor.calculadora.service;

public class CalculadoraService {
  //methods
  public double addition(double firstNumber, double secondNumber) {
    return firstNumber + secondNumber;
  }

  public double subtraction(double firstNumber, double secondNumber) {
    return firstNumber - secondNumber;
  }

  public double division(double firstNumber, double secondNumber) {
    if (secondNumber == 0) {
      throw new IllegalArgumentException("Impossível dividir por zero !!");
    }
    return firstNumber / secondNumber;
  }

  public double multiplication(double firstNumber, double secondNumber) {
    return firstNumber * secondNumber;
  }
}

# 🧮 Calculadora CLI - Java Core & Orientação a Objetos

> **Status do Projeto:** Concluído 🎯 (Nível 1 da Trilha de Engenharia de Software Java)

Aplicação interativa via linha de comando (CLI) desenvolvida em Java 21 para execução de operações matemáticas fundamentais, estruturada sob princípios corporativos de Orientação a Objetos, Separação de Responsabilidades (SRP) e Resiliência.

---

## 🛠️ Tecnologias & Conceitos Aplicados

* **Java 21 (Corretto / OpenJDK)**
* **Orientação a Objetos (OOP):** Encapsulamento, Associação de Objetos e Serviços Sem Estado (*Stateless*).
* **SOLID & Clean Code:** Princípio da Responsabilidade Única (SRP) e Nomenclatura Semântica.
* **Injeção de Dependência:** Injeção via Construtor (*Constructor Injection*) sem o uso de frameworks.
* **Resiliência:** Tratamento de erros com Exceções Explícitas (`IllegalArgumentException`) e captura na camada de apresentação via `try-catch`.
* **Git Flow & Versionamento:** Commits atômicos e semânticos (Conventional Commits) e trabalho em branches (`feature/`).

---

## 🏗️ Arquitetura do Sistema

A aplicação foi organizada em camadas bem definidas dentro da estrutura de pacotes:

```text
src/com/joaovitor/calculadora/
│
├── Main.java                 # Ponto de entrada (Bootstrapper)
├── service/
│   └── CalculadoraService.java # Camada de Negócio (Lógica matemática pura)
└── view/
    └── ConsoleView.java        # Camada de Apresentação (Interface CLI e Scanner)
```

### 🧩 Divisão de Responsabilidades

* **`CalculadoraService`**: Classe *stateless* responsável por executar os cálculos. Não possui dependência de I/O (sem `Scanner` ou `System.out.println`). Caso ocorra uma operação inválida (como divisão por zero), lança uma exceção de argumento inválido.
* **`ConsoleView`**: Gerencia a interação com o usuário, exibição de menus, captura de teclado e tratamento de exceções lançadas pela camada de serviço. Recebe o serviço via injeção de dependência.
* **`Main`**: Instancia os componentes e inicia a aplicação.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Git configurado.

### Passo a Passo

1. Clone o repositório:
```bash
git clone [https://github.com/joao-wess/calculadora-cli-java.git](https://github.com/joao-wess/calculadora-cli-java.git)
```

2. Navegue até a pasta do projeto:
```bash
cd calculadora-cli-java
```

3. Compile as classes:
```bash
javac -d bin src/com/joaovitor/calculadora/*.java src/com/joaovitor/calculadora/*/*.java
```

4. Execute a aplicação:
```bash
java -cp bin com.joaovitor.calculadora.Main
```

---

## 📌 Exemplo de Uso

```text
Escolha uma opção:
___________________
1 - somar
2 - subtrair
3 - dividir
4 - multiplicar
0 - sair
___________________
3
Escolha dois números para a operação:
Número 1: 10
Número 2: 0
[ERRO]: Divisão por zero não é permitida.
```

---
*Desenvolvido por João Vitor durante a jornada de transição para Engenharia de Software Backend Java.*
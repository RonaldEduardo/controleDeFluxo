# Desafio Controle de Fluxo

## Introdução

Este projeto implementa um programa Java que recebe dois números inteiros do usuário e realiza a contagem entre eles, imprimindo os números incrementados no console. Além disso, implementa uma exceção customizada para tratar o caso em que o primeiro parâmetro é maior que o segundo.

## Funcionalidades

- **Leitura de dois números inteiros do usuário via console.**
- **Validação dos parâmetros:**
  - Se o primeiro parâmetro for maior que o segundo, a exceção `ParametrosInvalidosException` é lançada.
- **Contagem e impressão dos números incrementados no console.**
- **Tratamento de exceções:**
  - `NumberFormatException`: Erro na conversão de parâmetros para inteiros.
  - `ParametrosInvalidosException`: Parâmetros inválidos (primeiro parâmetro maior que o segundo).
  - Exceções genéricas.

## Instruções de Execução

1. Compile as classes `Contador.java` e `ParametrosInvalidosException.java` utilizando o seguinte comando:
2. Execute o programa no terminal:
3. Siga as instruções na tela para digitar os dois números inteiros.

## Exemplo de Execução

Digite o primeiro parâmetro: 10
Digite o segundo parâmetro: 20
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
Imprimindo o número 6
Imprimindo o número 7
Imprimindo o número 8
Imprimindo o número 9
Imprimindo o número 10

## Considerações Adicionais

- A validação de entrada básica é realizada, mas validações mais robustas podem ser implementadas, como verificação de valores nulos ou vazios.
- O tratamento de exceções pode ser expandido para incluir outras exceções relevantes.
- O código pode ser refatorado para melhor legibilidade e organização.

## Tecnologias Utilizadas

- Java
- Scanner
- Exceções customizadas

## Conclusão

Este desafio oferece uma oportunidade prática para aplicar os conceitos de controle de fluxo e exceções customizadas em Java. A solução completa demonstra como codificar um programa que lida com diferentes cenários de entrada e erros, utilizando recursos adequados da linguagem.

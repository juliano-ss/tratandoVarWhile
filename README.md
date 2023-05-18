# TratandoVarWhile:

Este é um programa em Java que soma dois valores inteiros digitados pelo usuário. Ele usa um loop `while` para tratar exceções no caso de um usuário inserir um valor inválido.

## Pré-requisitos:

- Java Development Kit (JDK) 8 ou superior instalado em seu sistema.

## Como executar o programa:

1. Clone o repositório para o seu computador.
2. Abra um terminal ou prompt de comando e navegue até a pasta onde o arquivo `TratandoVarWhile.java` está localizado.
3. Compile o programa digitando o seguinte comando: `javac TratandoVarWhile.java`
4. Execute o programa digitando o seguinte comando: `java TratandoVarWhile`
5. Siga as instruções apresentadas na tela para inserir os valores que você deseja somar.

## Como funciona o programa:

O programa começa pedindo ao usuário que insira o primeiro valor. Se o usuário inserir um valor inválido, o programa exibirá uma mensagem de erro e pedirá ao usuário que insira novamente.

O mesmo processo é repetido para o segundo valor. Quando ambos os valores são inseridos corretamente, eles são somados e o resultado é exibido na tela.

O loop `while` é usado para tratar exceções. Ele repete o processo de leitura do valor até que o usuário insira um valor válido. O método `nextLine()` é usado para limpar o buffer do scanner após cada leitura mal-sucedida, permitindo que o usuário tente novamente.

Se tudo ocorrer bem, o programa será encerrado normalmente. Se ocorrer algum erro, como um valor inválido inserido pelo usuário, o programa exibirá uma mensagem de erro e pedirá ao usuário que insira novamente...

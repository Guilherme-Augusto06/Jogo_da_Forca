# Jogo da Forca em Java

Este projeto consiste em um simples jogo da forca implementado em Java. O projeto é composto por duas classes principais: `Main` e `Sorteio_palavra`.

## Classe Main

A classe `Main` é a classe principal do programa. Ela contém o método `main`, que é o ponto de entrada do programa. No método `main`, um menu é apresentado ao usuário com duas opções: jogar o jogo da forca ou sair do programa.

Se o usuário escolher jogar o jogo, uma palavra é sorteada através da classe `Sorteio_palavra` e o usuário deve tentar adivinhá-la, digitando uma letra por vez. O usuário tem 10 tentativas para adivinhar a palavra.

Se a palavra for adivinhada corretamente dentro do número de tentativas, uma mensagem de parabéns é exibida. Se o número de tentativas se esgotar antes que a palavra seja adivinhada, uma mensagem informando que o usuário perdeu é exibida.

## Classe Sorteio_palavra

A classe `Sorteio_palavra` é responsável por sortear uma palavra aleatória de um array predefinido de palavras. A palavra sorteada é então retornada para ser usada no jogo.

# Como executar

Para executar este programa, você precisa ter o Java instalado em seu computador. Depois de instalado, você pode compilar e executar o programa usando os comandos `javac` e `java`, respectivamente.

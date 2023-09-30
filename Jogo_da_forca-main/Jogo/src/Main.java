import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int y = 0;
        while (y == 0){
        Sorteio_palavra valor = new Sorteio_palavra();
        String menu = JOptionPane.showInputDialog(null, "Menu inicial\n[1]- Jogo da forca\n[2]- Sair");
        int menus = Integer.parseInt(menu);
        
        switch (menus){
            case 1:
                String palavraSorteada = valor.palavra_aleatória(); // Sorteia a palavra
                int tamanhoPalavra = palavraSorteada.length();  // Tamanho da palavra
                String[] palavra = new String[tamanhoPalavra];  // Vetor que vai receber a palavra
                int tentativas = 0; // Número de tentativas

                while (tentativas < 10){    // Enquanto o número de tentativas for menor que 10
                    String letra = JOptionPane.showInputDialog(null, "Digite uma letra " + "\nNúmero de tentativas: " + tentativas );   // Digitar uma letra
                    char letraChar = letra.charAt(0);   // Transforma a letra em char

                    for (int j = 0; j < tamanhoPalavra; j++){   // Percorre a palavra sorteada
                        if (letraChar == palavraSorteada.charAt(j)){    // Se a letra digitada for igual a letra da palavra sorteada
                            palavra[j] = letra; // A posição do vetor recebe a letra
                            //Falar a tentativa
                            
                        }
                    }
                    tentativas++;   // Incrementa o número de tentativas

                    String palavra_final = "";  // String que vai receber a palavra
                    for (int k = 0; k < palavra.length; k++){   // Percorre o vetor
                        if (palavra[k] == null){            // Se a posição do vetor for nula
                            palavra_final += " _ ";     // A string recebe um espaço
                        }else{
                            palavra_final += palavra[k];    // Se não, a string recebe a letra
                        }
                    }

                    JOptionPane.showMessageDialog(null, palavra_final); // Mostra a palavra

                    if (palavra_final.equals(palavraSorteada)){ // Se a palavra final for igual a palavra sorteada
                        JOptionPane.showMessageDialog(null, "Parabéns, você acertou a palavra: " + palavraSorteada + "\nNúmero de tentativas: " + tentativas);
                        break;
                    }
                    else if (tentativas == 10){ // Se o número de tentativas for igual a 10
                        JOptionPane.showMessageDialog(null, "Você perdeu, o número de tentativas acabou");
                        break;
                    }
                
                }
                break;
            case 2:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
    }
}   

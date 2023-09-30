import java.util.Random;

public class Sorteio_palavra {

    public Sorteio_palavra() {

    }

    public String palavra_aleatória() {
        Random Num_aleatorio = new Random();
        String palavra[] = {"casa", "carro", "moto", "bicicleta", "computador", "notebook", "celular", "tablet"};
        int indice = Num_aleatorio.nextInt(palavra.length);
        return palavra[indice];
    }
}
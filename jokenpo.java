
import java.util.*;

public class jokenpo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("escolha entre pedra, papel ou tesoura: ");
        String jogada = ler.next();

        String n1 = "pedra";
        String n2 = "papel";
        String n3 = "tesoura";

        Random rand = new Random();
        int maquinaInt = rand.nextInt(1, 3);

        String maquina;
        if (maquinaInt == 1) {
            maquina = n1;
        } else if (maquinaInt == 2) {
            maquina = n2;
        } else {
            maquina = n3;
        }

        System.out.println("Joo kenn poo!");

        if (jogada.equals("pedra") && maquina.equals("tesoura")) {
            System.out.println("jogador " + jogada + " x " + maquina + " maquina");
            System.out.println("jogador venceu!");
        } else if (jogada.equals("papel") && maquina.equals("pedra")) {
            System.out.println("jogador " + jogada + " x " + maquina + " maquina");
            System.out.println("jogador venceu!");
        } else if (jogada.equals("tesoura") && maquina.equals("papel")) {
            System.out.println("jogador " + jogada + " x " + maquina + " maquina");
            System.out.println("jogador venceu!");
        } else if (jogada.equals(maquina)) {
            System.out.println("jogador " + jogada + " x " + maquina + " maquina");
            System.out.println("empate!");
        } else {
            System.out.println("jogador " + jogada + " x " + maquina + " maquina");
            System.out.println("maquina venceu!");
        }

    }
}

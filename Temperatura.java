import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a sua temperatura em graus? ");
        double valor = ler.nextDouble();

        if (valor >= 41){
            System.out.println("A situação para a sua temperatura é Hipotermia ");
        }
        else if (valor >= 39.6 && valor <= 41){
            System.out.println("A situação para a sua temperatura é Febre alta");
        }
        else if (valor >= 37.6 && valor <= 37.6){
            System.out.println("A situação para a sua temperatura é Febre");
        }
        else if (valor == 36 && valor < 37.6){
            System.out.println("A situação para a sua temperatura é Normal");
        }
        else if (valor < 36){
            System.out.println("A siteação para a sua temperatura é Hipotermia");
        }

    }

}

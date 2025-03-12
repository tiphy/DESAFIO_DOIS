import java.util.*;

class Sorveteria{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a quantidade em gramas?");
        double gramas = ler.nextDouble();

        double valor = 3.50;

        if (gramas >= 1000){
            System.out.println("O total a pagar é:" + (valor - 0.50) * gramas);
        }
        else if (gramas <= 1000){
            System.out.println("Ototal a pagar é:" + valor * gramas);
        }
        else{
            System.out.println("Peso invalido");
        }

    }
}
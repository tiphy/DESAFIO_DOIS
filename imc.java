import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = ler.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = ler.nextDouble();

        double imc = (altura * altura) / peso;
        
        if (imc >= 40){
            System.out.println("Seu IMC é " + imc + ("Sua classificação é Obesidade Grau III"));
        }
        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Seu IMC é " + imc + ("Sua classificação é Obesidade Grau II"));
        }
        else if (imc >= 30 && imc <= 34.9){
            System.out.println("Seu IMC é " + imc + ("Sua classificação é Obesidade Grau I"));
        }
        else if (imc >= 25 && imc <= 29.9){
            System.out.println("Seu IMC é " + imc + ("Sua classificação é Sobrepeso"));
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu IMC é " + imc + ("Sua classificação é Peso Normal"));
        }
        else if (imc <= 18.5){
           System.out.println( "Seu IMC é " + imc + ("Sua classificação é Abaixo do Peso"));
        }

    }
    
}

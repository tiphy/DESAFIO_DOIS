import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe as notas");
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 8){
            System.out.println("A media do aluno é " + media + (" Situação: Aprovado com Sucesso"));
        }
        else if (media >= 6 && media < 8){
            System.out.println("A media do aluno é " + media + (" Situação: Aprovado"));
        }
        else if (media >= 3 && media < 6){
            System.out.println("A media do aluno é " + media + (" Situação: Recuperação"));
        }
        else if (media < 3){
            System.out.println("A media do aluno é " + media + ("Situação: Reprovado "));
        }
        else if (media == 0){
            System.out.println("Desistente");
        }


    }
    
}

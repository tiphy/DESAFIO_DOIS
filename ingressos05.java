import java.util.*;
public class ingressos05{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);


        System.out.println("informe a quantidade de ingressos");

        System.out.println("inteira: ");
        int inteira = ler.nextInt();
        System.out.println("meia: ");
        int meia = ler.nextInt();

        double ingressos = inteira + meia;

        
        System.out.println("qual o dia da semana: ");
        String diaSemana = ler.next();


        System.out.println("o filme é nacional? ");
        boolean filmeNacional = ler.nextBoolean();


        if (diaSemana.equals("quarta") && filmeNacional == true){
            double total = ingressos * 5.00;
            System.out.println("o total a se pagar é  " + total);
        }
     else if (diaSemana.equals("quarta")){
         double total = ingressos * 14.25;
         System.out.println("o total a se pagar é  " + total);
    }
    else if (filmeNacional == true){
        double total = ingressos * 5.00;
        System.out.println("o total a se pagar é  " + total);
    }
    else if (filmeNacional == false){
        double total = (inteira * 28.50) + (meia * 14.25);
        System.out.println("o total a se pagar é  " + total);
    }

    }

}

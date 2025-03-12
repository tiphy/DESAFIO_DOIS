import java.util.*;
 
 public class envio {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);

         System.out.println("informe o dia:");
         int dia1 = ler.nextInt();
 
         System.out.println("informe o dia da semana em numeros (sendo domingo o numero 0):");
            int dia = ler.nextInt();

        System.out.println("informe o mes em numeros:");
            int mes = ler.nextInt();

        System.out.println("informe o ano:");
            int ano = ler.nextInt();

            String diaSemana = "";
            String mesAno = "";

            if (dia == 0){
                diaSemana = "Domingo";
            }
            else if (dia == 1){
                diaSemana = "Segunda";
            }
            else if (dia == 2){
                diaSemana = "Terça";
            }
            else if (dia == 3){
                diaSemana = "Quarta";
            }
            else if (dia == 4){
                diaSemana = "Quinta";
            }
            else if (dia == 5){
                diaSemana = "Sexta";
            }
            else if (dia == 6){
                diaSemana = "Sabado";
            }
            

            if (mes == 1){
                mesAno = "Janeiro";
            }
            else if (mes == 2){
                mesAno = "Fevereiro";
            }
            else if (mes == 3){
                mesAno = "Março";
            }
            else if (mes == 4){
                mesAno = "Abril";
            }
            else if (mes == 5){
                mesAno = "Maio";
            }
            else if (mes == 6){
                mesAno = "Junho";
            }
            else if (mes == 7){
                mesAno = "Julho";
            }
            else if (mes == 8){
                mesAno = "Agosto";
            }
            else if (mes == 9){
                mesAno = "Setembro";
            }
            else if (mes == 10){
                mesAno = "Outubro";
            }
            else if (mes == 11){
                mesAno = "Novembro";
            }
            else if (mes == 12){
                mesAno = "Dezembro";
            }

            System.out.println("Enviado " + diaSemana + ", " + dia1 + " de " + mesAno + " de " + ano);

     }
 }

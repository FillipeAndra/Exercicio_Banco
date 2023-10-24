import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Fillipe Andrade";
        String tipoConta= "Corrente";
        int opcoes;
        float conta = 2500;
        float receber;
        float pagar;
        for (int i=0;i<=39;i++){
            System.out.print("*");
            if (i==39){
                System.out.print("*");
                System.out.print("\n");
            }
        }
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:            "+nome);
        System.out.println("Tipo conta:      "+tipoConta);
        System.out.println("Saldo inicial:   R$ "+conta);
        for (int i=0;i<=39;i++){
            System.out.print("*");
            if (i==39) {
                System.out.print("*");
                System.out.print("\n");
            }
        }
        while (true){
            System.out.println("Operações\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair");
            opcoes = leitor.nextInt();
            if (opcoes == 1){
                System.out.printf("Seu saudo é de R$ %.2f\n\n", conta);
            }
            if (opcoes == 2){
                System.out.println("Qual o valor a ser depositado? \n");
                receber = leitor.nextFloat();
                conta = conta + receber;
            }

            if (opcoes == 3){
                System.out.println("Qual o valor a ser transferido? \n");
                pagar = leitor.nextFloat();
                if (pagar >= conta){
                    System.out.println("Você não pode transfeir um valor maior que seu saldo \n");
                }else{
                    conta= conta - pagar;
                    System.out.println("valor transferido\n");
                }
            }
            if (opcoes == 4){
                System.out.println("Fechando o sistema\nE saindo\n");
                break;
            }
        }
    }
}
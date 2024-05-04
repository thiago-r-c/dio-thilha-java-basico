package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       //Atributos
       int Numero;
       String Agencia;
       String NomeCliente;
       float Saldo;
       
       System.out.println("****** Programa Iniciado! *********");
       
       Scanner ler_teclado = new Scanner(System.in); //Instanciando objeto ler teclado (Criando
       
       System.out.print("Digite a Agência: ");
       Agencia = ler_teclado.next();
       
       System.out.print("Digite o Número da Conta: ");
       Numero = ler_teclado.nextInt();
       ler_teclado.nextLine(); // Consumir a nova linha pendente
       
       System.out.print("Digite seu nome completo: ");
       NomeCliente = ler_teclado.nextLine();
       
       System.out.print("Digite o Saldo: ");
       Saldo = ler_teclado.nextFloat();
       
       System.out.println("\"Olá "+ NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Integer.toString(Numero)+" e seu saldo "+Float.toString(Saldo)+" já está disponível para saque\".");
       ler_teclado.close(); 
        
        
    }
    
}

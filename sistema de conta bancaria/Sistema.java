
package sistema;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args){
        ListaContaBancaria lista = new ListaContaBancaria();
        Scanner sc = new Scanner(System.in);
        int opcao, loop = 0, nro_conta;
        double quantia;
        
        while(loop == 0){
            
        System.out.println("");
        System.out.println("__________Escolha uma das opcoes a seguir__________");
        System.out.println("Opcao 1-> Criar uma conta nova");
        System.out.println("Opcao 2-> Excluir uma conta");
        System.out.println("Opcao 3-> Checar as informacoes de uma conta existente");
        System.out.println("Opcao 4-> Alterar as informacoes de uma conta existente");
        System.out.println("Opcao 5-> Depositar");
        System.out.println("Opcao 6-> Sacar");
        System.out.println("Opcao 7-> Checar seu saldo atual");
        System.out.println("Opcao 8-> Sair");
        System.out.printf("__________Digite sua opcao: ");
        opcao = sc.nextInt();
        
        System.out.println("");
        
        switch(opcao){
            
            case 1:
                lista.criarConta();
                break;
            
            case 2:
                lista.excluirConta();
                break;
                
            case 3:
                lista.getInfo();
                break;
                
            case 4:
                lista.alterarConta();
                break;
                
            case 5:
                System.out.printf("Insira o numero da conta que deseja depositar dinheiro: ");
                nro_conta = sc.nextInt();
                
                System.out.println("");
                
                System.out.printf("Insira um valor para o seu deposito: ");
                quantia = sc.nextDouble();
                lista.conta[nro_conta].depositar(quantia);
                break;
            
            case 6:
                System.out.printf("Insira o numero da conta que deseja sacar dinheiro: ");
                nro_conta = sc.nextInt();
                
                System.out.println("");
                
                System.out.printf("Insira um valor para o seu saque: ");
                quantia = sc.nextDouble();
                lista.conta[nro_conta].sacar(quantia);
                break;
            
            case 7:
                System.out.printf("Insira o numero da conta que deseja verificar o saldo: ");
                nro_conta = sc.nextInt();
                
                System.out.println("");
                
                System.out.println("Seu saldo atual: " +lista.conta[nro_conta].getSaldo());
                break;
                
            case 8:
                System.out.println("Fim do programa!");
                loop++;
                break;
        }
     }
        
        
        
    }
    
}

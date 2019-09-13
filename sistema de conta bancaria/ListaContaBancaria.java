
package sistema;

public class ListaContaBancaria extends ContaBancaria {
    int MAX = 10;
    int i = 0, nro_conta, Fim = 0;
    int aux = 0;
    ContaBancaria[] conta = new ContaBancaria[MAX];
    
    public void criarConta(){       
        try{
            if(Fim == 9 )
                throw new OverflowException();
        
        conta[i] = new ContaBancaria();
        
        System.out.printf("Insira o limite para a conta: ");
        conta[i].limite = sc.nextDouble();
                
        System.out.printf("Insira o nome do proprietario da conta: ");
        conta[i].proprietario = sc.next();
        
        System.out.println("Conta criada com sucesso!");
        
        i++;
        Fim++;
        }
        catch (OverflowException exception){
            System.out.println("A lista de contas bancarias esta cheia!");
        }
    }
    
    public void excluirConta(){
        System.out.printf("Insira a conta que voce deseja excluir: ");
        nro_conta = sc.nextInt();
        
        try{
            if(Fim == 0)
                throw new UnderflowException();
            
            if(nro_conta >= Fim)
                throw new NotFoundException();
                            
            if(nro_conta < Fim || nro_conta > 0){
                for(int j = nro_conta; j < Fim; j++){
                    conta[nro_conta] = conta[nro_conta+1];
                    Fim--;
                }
        }
        
            System.out.println("Conta excluida com sucesso!");
        
        
        }
        
        catch(UnderflowException exception){
            System.out.println("Lista de contas bancarias vazias!");
        }
        
        catch(NotFoundException exception){
            System.out.println("Conta bancaria nao encontrada!");
        }
}
    
    public void alterarConta(){
        try{
            if(nro_conta >= Fim || Fim == 0)
                throw new NotFoundException();
        
        System.out.printf("Insira a conta que voce deseja alterar: ");
        nro_conta = sc.nextInt();
        conta[nro_conta] = new ContaBancaria();
        }
        
        catch(NotFoundException exception){
            System.out.println("Conta bancaria nao encontrada!");
        }
    }
    
    public void getInfo(){
        try{
            if(nro_conta >= Fim || Fim == 0)
                throw new NotFoundException();
            
        System.out.printf("Insira a conta que voce deseja checar as informacoes: ");
        nro_conta = sc.nextInt();
        
        System.out.println("");
        
        System.out.println("__________Informacoes da conta__________");
        System.out.println("Proprietario da conta: "+conta[nro_conta].proprietario);
        System.out.println("Saldo da conta: " +conta[nro_conta].saldo);
        System.out.println("Limite da conta: "+conta[nro_conta].limite);        
    }
        
        catch(NotFoundException exception){
            System.out.println("Conta bancaria nao encontrada!");
        }
        
    }
    
}


package sistema;
import java.util.Scanner;

public class ContaBancaria {
    Scanner sc =  new Scanner(System.in);
    double saldo;
    double limite;
    String proprietario;
    
    
    
    public double getSaldo(){
        return saldo;
    }
    
    public double getLimite(){
        return limite;
    }
    
    public String getProprietario(){
        return proprietario;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public void sacar(double saque){
       try{
           
            if(saque < 0)
                throw new IllegalArgumentException();
        
            if(saque > limite)
                throw new EstouroDeLimiteException();
                                                                                // O SAQUE NAO PODE SER MAIOR DO QUE O LIMITE, NEM O SAQUE PODE SER NEGATIVO 
            saldo = saldo - saque;
            System.out.println("Saque feito com sucesso!");
       }
       
       catch(IllegalArgumentException exception){
           System.out.println("O saque nao pode ser negativo!");
       }
       
       catch(EstouroDeLimiteException exception){
           System.out.println("O saque nao pode ser maior que seu limite!");
       }
       
       
    }
       
    
    public void depositar(double deposito){       
        try{
                                                                                // O DEPOSITO NAO PODE SER NEGATIVO, NEM O SALDO PODE ESTOURAR O LIMITE DA CONTA
            if(deposito < 0)
                throw new IllegalArgumentException();
            
            saldo = saldo + deposito;
            System.out.println("Deposito feito com sucesso!");                  
    }
        
        catch (IllegalArgumentException exception){
            System.out.println("O deposito nao pode ser negativo!");
    }
        
    }
    
}

package loja_trab2;

public class Vendedores extends Funcionarios{
    public float comissao;
    public float salario_ttl;
    public float total_vendas = 0;
    
    
    public Vendedores(String nome, int rg, int salario_base){
        this.nome = nome;
        this.rg = rg;
        this.salario_base = salario_base;
    }
    
    public void venda(float preco){
        total_vendas = total_vendas + preco;
        comissao = (float) (total_vendas * 0.05);
    }
    
    public float getTotalVendas(){
        return total_vendas;
    }
    
    public float salario_total(){
        salario_ttl = (float)( (salario_base) + comissao);
        return  salario_ttl;
    }
    
    public float getComissao() {
        return comissao;
    }
    
}

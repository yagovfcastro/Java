package loja_trab2;

        
public class Administradores extends Funcionarios{
    public int horas_por_mes;
    public int hora_extra;
    public float salario_ttl;
    
    public Administradores(String nome, int rg, int salario_base, int horas_por_mes){
        this.nome = nome;
        this.rg = rg;
        this.salario_base = salario_base;
        this.horas_por_mes = horas_por_mes;
    }

    
    public void horas_extra(int hora){
       hora_extra = hora_extra + hora;
   }
    
    public int getHora_extra() {
        return hora_extra;
    }
    
    public float salario_total(){
        salario_ttl = (float) (salario_base + hora_extra*(0.01 * salario_base));
        return salario_ttl;
    }

}


package loja_trab2;
        
public class Loja_trab2 {

    public static void main(String[] args) {
        int i;
        Vendedores[] v = new Vendedores[5];
        Administradores[] a = new Administradores[5];
        
        a[0] = new Administradores("Gabriel", 579629419, 1000, 160);
        a[1] = new Administradores("Yago", 579629418, 10000, 140);
        a[2] = new Administradores("Victor", 579629417, 1500, 150);
        a[3] = new Administradores("Hugo", 579629416, 2000, 160);
        a[4] = new Administradores("Aristoteles", 579629415, 5000, 116);
        
        v[0] = new Vendedores("Joao", 579629439, 2000);
        v[1] = new Vendedores("Jorge", 579629438, 1000);
        v[2] = new Vendedores("Joana", 579629437, 1500);
        v[3] = new Vendedores("Joaquim", 579629436, 3000);
        v[4] = new Vendedores("Bruno", 579629435, 5000);
        
        v[0].venda(555);
        v[2].venda(500);
        v[1].venda(300);
        v[3].venda(900);
        v[4].venda(755);
        
        a[0].horas_extra(20);
        a[1].horas_extra(10);
        a[2].horas_extra(5);
        a[3].horas_extra(30);
        a[4].horas_extra(12);
        
        for(i = 0; i < 5; i++){
            System.out.println("Salario total do vendedor " + (i+1) +"= " +v[i].salario_total());
        }
        
        System.out.println("\n");
        
         for(i = 0; i < 5; i++){
            System.out.println("Salario total do administrador " + (i+1) +"= " +a[i].salario_total());
        }
                  
    }    
}

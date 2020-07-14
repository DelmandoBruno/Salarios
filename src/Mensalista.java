public class Mensalista extends Funcionario {
    protected double salMensal;
    protected int diasFaltados;
    
    Mensalista(double salMensal, int diasFaltados, String nome, String sobrenome, int numFunc){
        super(nome, sobrenome, numFunc);
        this.salMensal = salMensal;
        this.diasFaltados = diasFaltados;
    }
    
    double calcularSalario(){
        if(diasFaltados > 0){
            salMensal = salMensal - ((salMensal * 0.02) * diasFaltados);
        }
        return salMensal;
    }
    
    void exibirDados(){
        System.out.println("Dados do funcionário Mensalista");
        System.out.println("\nNome: "+sobrenome.toUpperCase()+", "+nome.toUpperCase());
        System.out.println("Número: "+numFunc);
        if(diasFaltados > 0){
            System.out.println("Salário inicial: R$ "+salMensal);
            System.out.println("Dias faltados no trabalho: "+diasFaltados);
            System.out.println("Salário final com desconto por cada dia faltado: R$ "+calcularSalario());
        }
        else{
            System.out.println("Dias faltados no trabalho: "+diasFaltados);
            System.out.println("Salário: R$ "+salMensal);
        }
    }
}

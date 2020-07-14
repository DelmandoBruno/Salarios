public class Horista extends Funcionario {
    protected double salarioPorHora;
    protected int numeroHoras;
    
    Horista(double salarioPorHora, int numeroHoras, String nome, String sobrenome, int numFunc){
        super(nome, sobrenome, numFunc);
        this.salarioPorHora = salarioPorHora;
        this.numeroHoras = numeroHoras;
    }
    
    double calcularSalario(){
        return numeroHoras * salarioPorHora;
    }
    
    void exibirDados(){
        System.out.println("Dados do funcionário Horista");
        System.out.println("\nNome: "+sobrenome.toUpperCase()+", "+nome.toUpperCase());
        System.out.println("Número: "+numFunc);
        System.out.println("Salário por hora trabalhada: R$ "+salarioPorHora);
        System.out.println("Número de horas trabalhadas por mês: "+numeroHoras);
        System.out.println("Salário: R$ "+calcularSalario());
    }
}

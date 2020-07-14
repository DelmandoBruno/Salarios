public class Teste {

    public static void main(String[] args) {
        
        Horista ayano = new Horista(15, 200, "Ayano", "Sugiura", 1234);
        ayano.exibirDados();
        System.out.println("\n-----------------------------\n");
        
        Horista kyouko = new Horista (2000, 5, "Kyouko", "Toshinou", 5678);
        kyouko.exibirDados();
        System.out.println("\n-----------------------------\n");
        
        Mensalista akari = new Mensalista(4000, 0, "Akari", "Akaza", 9101);
        akari.exibirDados();
    }
}

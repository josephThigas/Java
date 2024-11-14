public class Main {
    public static void main(String[] args) {
        Aluno a01 = new Aluno("Ines", "17-04", "086", "Av. Pref", "F");
        a01.apresentar();
        a01.setEndereco("rua avc");
        a01.exibirIdentificacao();

        Instrutor i01 = new Instrutor("Joao", "17-04", "086", "Av. Pref", "M");
        i01.apresentar();
        i01.exibirIdentificacao();
    }
}
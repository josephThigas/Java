public class Pessoa {
    private String nome;
    private int data;
    private String CPF;
    private String endereco;
    private String genero;

    // Construtor com regras
    public Pessoa(String nome, int data, String CPF, String endereco, String genero) {
        this.nome = nome;
        this.data = data;
        this.CPF = CPF;
        this.endereco = endereco;
        this.genero = genero;
    }

    // Construtor vazio
    public Pessoa() {
    }

    //Get-Set
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setData(int novodata) {
        this.data = novodata;
    }
    public int getData() {
        return this.data;
    }

    public void setCPF(String novoCPF) {
        this.CPF = novoCPF;
    }
    public String getCPF() {
        return this.CPF;
    }

    public void setEndereco(String novoendereco) {
        this.endereco = novoendereco;
    }
    public String getEndereco() {
        return this.endereco;
    }

    public void setGenero(String novogenero) {
        this.genero = novogenero;
    }

    public String getGenero() {
        return this.genero;
    }
}

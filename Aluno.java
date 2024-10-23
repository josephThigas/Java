public class Aluno extends Pessoa {
    private Pessoa pessoa;
    private String horarioEntrada;
    private String horarioSaida;
    private String numeroMatricula;
    private String email;
    private Boolean statusPagamento;


    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getHorarioEntrada() {
        return this.horarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida() {
        return this.horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getNumeroMatricula() {
        return this.numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean isStatusPagamento() {
        return this.statusPagamento;
    }

    public Boolean getStatusPagamento() {
        return this.statusPagamento;
    }

    public void setStatusPagamento(Boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    
    public Aluno(Pessoa pessoa, String horarioEntrada, String horarioSaida, String numeroMatricula, String email,
            Boolean statusPagamento) {
        this.pessoa = pessoa;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.numeroMatricula = numeroMatricula;
        this.email = email;
        this.statusPagamento = statusPagamento;
    }
    
    
    public Aluno() {
    }
}

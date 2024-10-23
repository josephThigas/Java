public class Instrutor extends Pessoa {
    private Pessoa pessoa;
    private double salario;
    private String CRM;
    private String cargoHorario;
    private String matriculaProfessor;
    private String especializacao;


    public Instrutor(Pessoa pessoa, double salario, String CRM, String cargoHorario, String matriculaProfessor, String especializacao) {
        this.pessoa = pessoa;
        this.salario = salario;
        this.CRM = CRM;
        this.cargoHorario = cargoHorario;
        this.matriculaProfessor = matriculaProfessor;
        this.especializacao = especializacao;
    }

    public Instrutor() {
    }


    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCRM() {
        return this.CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getCargoHorario() {
        return this.cargoHorario;
    }

    public void setCargoHorario(String cargoHorario) {
        this.cargoHorario = cargoHorario;
    }

    public String getMatriculaProfessor() {
        return this.matriculaProfessor;
    }

    public void setMatriculaProfessor(String matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getEspecializacao() {
        return this.especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }




}

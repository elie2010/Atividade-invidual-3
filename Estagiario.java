package colaboradores;

public class Estagiario extends Funcionario implements FolhadePagamento {

    private String supervisor;

    public Estagiario (){
    }

    public Estagiario(String nome, int matricula, float valorHora, float horasTrab, String supervisor){
        super(nome, matricula, valorHora, horasTrab);
        this.supervisor = supervisor;
    }
    
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalário:R$" + calcularSalario() + 
                "\nSupervisor:" + supervisor;
    }

    @Override
    public float calcularSalario() {
        return getHorasTrab() * getValorHora();
    }

}

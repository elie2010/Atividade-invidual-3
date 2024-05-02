package colaboradores;

public class Gerente extends Funcionario implements FolhadePagamento {

    private float bonusAnual;
    private String projetoAtual;

    public Gerente (){
    }

    public Gerente (String nome, int matricula, float valorHora, float horasTrab, float bonusAnual, String projetoAtual){
        super(nome, matricula, valorHora, horasTrab);
        this.bonusAnual = bonusAnual;
        this.projetoAtual = projetoAtual;
    }
    
    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getProjetoAtual() {
        return projetoAtual;
    }

    public void setProjetoAtual(String projetoAtual) {
        this.projetoAtual = projetoAtual;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
                "\nProjeto atual:" + projetoAtual +
                "\nBônus anual:" + bonusAnual + 
                "\nSalário:" + calcularSalario();
    }

    @Override
    public float calcularSalario () {
        return getHorasTrab() * getValorHora() + bonusAnual;
    }

}

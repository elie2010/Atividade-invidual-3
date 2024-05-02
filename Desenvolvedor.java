package colaboradores;

public class Desenvolvedor extends Funcionario implements FolhadePagamento {

    private String especialidade;

    public Desenvolvedor (){
    }

    public Desenvolvedor (String nome, int matricula, float valorHora, float horasTrab, String especialidade) {
        super(nome, matricula, valorHora, horasTrab);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
                "\nEspécialidae:" + especialidade +
                "\nSalário:R$" + calcularSalario();
    }

    @Override
    public float calcularSalario () {
        return getHorasTrab() * getValorHora();
    }


    




    
}

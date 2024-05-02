package colaboradores;

public abstract class Funcionario {

    private String nome;
    private int matricula;
    private float valorHora;
    private float horasTrab;

    public Funcionario (){
    }   
    
    public Funcionario (String nome, int matricula, float valorHora, float horasTrab){
        this.nome = nome;
        this.matricula = matricula;
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valoHora) {
        this.valorHora = valoHora;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    @Override
    public String toString() {
        
        return "\nNome:" + nome +
                "\nMatrícula:" + matricula +
                "\nValor hora:R$" + valorHora +
                "\nHoras trabalhadas:" + horasTrab;
    }

    








}

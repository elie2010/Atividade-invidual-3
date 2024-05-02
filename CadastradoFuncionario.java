package colaboradores;

import java.util.ArrayList;
import java.util.List;

public class CadastradoFuncionario {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastra (Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getlistaFuncionarios (){
        return listaFuncionarios;
    }

    public static boolean localizar (int matricula){
        for(Funcionario tempFuncionario : listaFuncionarios){
            if (tempFuncionario.getMatricula() == matricula){
                return true; 
                
            }
        }
        return false;
    }

    public static boolean excluir (int matricula){

        for(Funcionario tempFuncionario : listaFuncionarios){
            if(tempFuncionario.getMatricula() == matricula){
                listaFuncionarios.remove(tempFuncionario);
                return true;
            }
        }
        return true;
    }

    public static boolean excluirLista (){
        listaFuncionarios.clear();
        return true;
    }

	

    



}

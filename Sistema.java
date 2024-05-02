package colaboradores;



public class Sistema extends Funcionario{

    private static void exibirMenu(){
        System.out.println("\nEmpresa:");
        System.out.println("1)Cadastrar estagiário:");
        System.out.println("2)Cadastrar desenvolvedor:");
        System.out.println("3)Cadastrar gerente:");
        System.out.println("4)Listar funcionários:");
        System.out.println("5)Encontrar funcionário:");
        System.out.println("6)Excluir funcionário:");
        System.out.println("7)Excluir lista");
        System.out.println("0)Finalizar programa");
        System.out.print("Informe opção:");
    }

    private static void verificarOP(int op){
        String nome;
        int matricula;

        switch (op) {
            case 1:

                System.out.println("\nCadastro estagiário:");
                System.out.print("Nome:");
                nome = Console.lerString();
                System.out.print("Matrícula:");
                matricula = Console.lerInt();
                System.out.print("Supervisor:");
                String supervisor = Console.lerString();
                System.out.print("Horas trabalhadas:");
                int horasTrab = Console.lerInt();
                System.out.print("Valor hora:R$");
                float valorHora = Console.lerInt();
                
                Estagiario estagiario = new Estagiario(nome, matricula, valorHora, horasTrab, supervisor);
                CadastradoFuncionario.cadastra(estagiario);

                System.out.println("\nEstágiario cadastrado com sucesso...");
                        break;
                

            case 2:

                System.out.println("\nCadastro desenvolvedor:");
                System.out.print("Nome:");
                nome = Console.lerString();
                System.out.print("Matrícula:");
                matricula = Console.lerInt();
                System.out.print("Especialidade:");
                String especialidade = Console.lerString();
                System.out.print("Horas trabalhadas:");
                horasTrab = Console.lerInt();
                System.out.print("Valor hora:R$");
                valorHora = Console.lerInt();

                Desenvolvedor desenvolvedor = new Desenvolvedor(nome, matricula, valorHora, horasTrab, especialidade);
                CadastradoFuncionario.cadastra(desenvolvedor);

                System.out.println("\nDesenvolvedor cadastrado com sucesso...");
                break;

            case 3:

                System.out.println("\nCadastro gerente:");
                System.out.print("Nome:");
                nome = Console.lerString();
                System.out.print("Matrícula:");
                matricula = Console.lerInt();
                System.out.print("Projeto atual:");
                String projetoAtual = Console.lerString();
                System.out.print("Bônus anual:R$");
                float bonusAnual = Console.lerInt();
                System.out.print("Horas trabalhadas:");
                horasTrab = Console.lerInt();
                System.out.print("Valor hora:R$");
                valorHora = Console.lerInt();

                Gerente gerente = new Gerente(nome, matricula, valorHora, horasTrab, bonusAnual, projetoAtual);
                CadastradoFuncionario.cadastra(gerente);

                System.out.println("\nGerente cadastrado com sucesso...");

                break;
            
            case 4:

                if (CadastradoFuncionario.getlistaFuncionarios().size() == 0){
                    System.out.println("Não há funcionários cadastrados...");
                    break;
                }
                System.out.println("Funcionários cadastrados:");
                for (Funcionario tempfuncionario : CadastradoFuncionario.getlistaFuncionarios()){
                    System.out.println(tempfuncionario);
                }
                
                break;

            case 5:

                System.out.println("\nEncontrar funcionário:");
                System.out.print("Informe matrícula:");
                matricula = Console.lerInt();

                if (CadastradoFuncionario.localizar(matricula)){
                    System.out.println("\nFuncionário encontado com sucesso...");
                    System.out.println("Matrícula:" + matricula);
                } else {
                    System.out.println("\nFuncionário " + matricula + " não localizado");
                }
                
                break;
            
            case 6:

                System.out.println("\nExcluir funcionário:");
                System.out.print("Informe matrícula:");
                matricula = Console.lerInt();

                if (CadastradoFuncionario.excluir(matricula)){
                    System.out.println("\nFuncionário excluído com sucesso...");
                } else {
                    System.out.println("\nFuncionário " + matricula + " não localizado");
                }

                break;

            
            case 7:
            
                System.out.println("\nApagar lista:");
                if (CadastradoFuncionario.excluirLista()){
                    System.out.println("Lista excluída com sucesso...");
                }

                break;

            case 0:
                System.out.println("Programa finalizado...");

                break;

            default:

                System.out.println("Opção invalída digite novamente:");
                break;
        }

    }

    public static void executar (){
        int op;

        do{exibirMenu();
        op = Console.lerInt();
        verificarOP(op);
        } while (op != 0);
        
    }

}

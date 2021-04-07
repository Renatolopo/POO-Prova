package questao_19.apresentacao;

import questao_19.controle.ControleArtigo;
import questao_19.controle.ControleEdicao;
import questao_19.controle.ControleRevistaCientifica;
import questao_19.modelo.Artigo;
import questao_19.modelo.Edicao;
import questao_19.modelo.RevistaCientifica;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int opc = -1;
        do {
            System.out.println("--------------------------------");
            System.out.println("\t\t Menu");
            System.out.println("--------------------------------");
            System.out.print("Escolha uma opção\n" +
                    "1 - Cadastra Artigo\n" +
                    "2 - Cadastrar Revista Cientifica\n" +
                    "3 - Cadastrar Edição\n" +
                    "4 - Listar Artigos\n" +
                    "5 - Listar Revistas cientificas\n" +
                    "6 - Listar Edições\n" +
                    "0 - Sair\n" +
                    ": ");

            opc = Integer.parseInt(scan.nextLine());
            System.out.println("--------------------------------");
            if(opc == 1){
                cadastrarArtigo(scan);
            }else if(opc == 2){
                cadastrarRevista(scan);
            }else if(opc == 3) {
                cadastrarEdicao(scan);
            }else if(opc == 4){
                listArtigos();
            }else if(opc == 5){
                listRevistas();
            }else if(opc == 6){
                listEdicoes();
            }

        }while(opc != 0);

    }

    private static void listArtigos() {
        ControleArtigo controleArtigo = new ControleArtigo();
        controleArtigo.listArtigos();
    }

    private static void listEdicoes() {
        ControleEdicao controleEdicao = new ControleEdicao();
        controleEdicao.listEdicoes();
    }

    private static void cadastrarEdicao(Scanner scan) {
        System.out.print("Numero da edição: ");
        int numEdicao = Integer.parseInt(scan.nextLine());
        System.out.print("Volume: ");
        int volume = Integer.parseInt(scan.nextLine());
        System.out.print("Data: ");
        String data = scan.nextLine();
        listRevistas();
        System.out.print("Informe o Titulo da Revista: ");
        String tituloRevista = scan.nextLine();
        ControleRevistaCientifica controleRevista = new ControleRevistaCientifica();
        RevistaCientifica revista = controleRevista.buscarRevista(tituloRevista);

        try{
            Edicao edicao = new Edicao(numEdicao,volume,data,revista);
            ControleEdicao controleEdicao = new ControleEdicao();
            controleEdicao.addEdicao(edicao);
            System.out.println("Edição adicionada com Sucesso!");
        }catch (Exception e){
            System.out.println("Ocorreu algum erro na riação da Edicção");
        }
    }

    private static void listRevistas() {
        ControleRevistaCientifica controleRevistaCientifica = new ControleRevistaCientifica();
        controleRevistaCientifica.listRevistas();
    }

    private static void cadastrarRevista(Scanner scan) {
        System.out.print("Titulo: ");
        String titulo = scan.nextLine();
        System.out.print("Issn: ");
        int issn = Integer.parseInt(scan.nextLine());
        System.out.print("Periodicidade: ");
        String  periodicidade = scan.nextLine();

        RevistaCientifica revistaCientifica = new RevistaCientifica(titulo, issn, periodicidade);
        ControleRevistaCientifica controleRevistaCientifica = new ControleRevistaCientifica();
        try {
            controleRevistaCientifica.addRevista(revistaCientifica);
            System.out.println("Revista cadastrada com sucesso!");
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public static void cadastrarArtigo(Scanner scan){
        System.out.printf("Titulo: ");
        String titulo = scan.nextLine();
        System.out.printf("Nome do Autor: ");
        String nomeAutor = scan.nextLine();

        ControleEdicao controleEdicao = new ControleEdicao();
        controleEdicao.listEdicoes();
        System.out.print("Informe o numero da edição que o artigo pertence: ");
        int numEdicao = Integer.parseInt(scan.nextLine());
        Edicao edicao = controleEdicao.buscarEdicao(numEdicao);

        try{
            Artigo artigo = new Artigo(titulo, nomeAutor, edicao);
            ControleArtigo  controleArtigo = new ControleArtigo();
            controleArtigo.addArtigo(artigo);
            System.out.println("Artigo adicionado com sucesso");
        }catch (Exception e ){
            System.out.println("Erro durante o cadastro do artigo!");
        }

    }
}

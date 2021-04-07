package questao_20.apresentacao;

import questao_20.controle.ControleCorrida;
import questao_20.controle.ControleMotoboy;
import questao_20.modelo.Corrida;
import questao_20.modelo.Motoboy;
import questao_20.modelo.Relatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc = -1;
        do {
            System.out.println("-----------------------------");
            System.out.println("\t\t Menu");
            System.out.println("-----------------------------");
            System.out.print("1 - Cadastrar Motoboy\n" +
                    "2 - Cadastrar corrida\n" +
                    "3 - Listar entregas\n" +
                    "4 - Relatório\n" +
                    "0 - Sair\n" +
                    ": ");
            opc = Integer.parseInt(scan.nextLine());
            if(opc == 1){
                cadastarMotoboy(scan);
            }else if(opc == 2){
                cadastrarCorrida(scan);
            }else if(opc == 3){
                listEntregas();
            }else if(opc == 4){
                getRelatorio();
            }

            System.out.println("-----------------------------");

        }while(opc != 0);
    }

    private static void getRelatorio() {
        System.out.println("---------------------------------");
        System.out.println("\t\t Relatório");
        System.out.println("---------------------------------");
        Relatorio relatorio = new Relatorio();
        ControleCorrida controleCorrida = new ControleCorrida();
        ArrayList<Corrida> corridas = controleCorrida.getCorridas();

        Collections.sort(corridas, (corrida1, corrida2) ->
                corrida1.getData().compareToIgnoreCase(corrida2.getData()));
        for(Corrida corrida : corridas){
            relatorio.addPizza(corrida.getQuantidadePizza());
            relatorio.addRefrigerante(corrida.getQuantidadeRefrigerante());
            relatorio.addPagamentoMotoboy();
            System.out.println("---");
            System.out.printf("Data: %s\n" +
                            "Hora: %s\n" +
                            "Quantidade de Pizza: %d\n" +
                            "Quantidade de Refrigerante: %d\n", corrida.getData(),
                    corrida.getHora(), corrida.getQuantidadePizza(),
                    corrida.getQuantidadeRefrigerante());
            if(corrida.getMotoboy() != null){
                System.out.printf("Nome do motoboy: %s\n" +
                                "Placa do Motoboy: %s\n", corrida.getMotoboy().getNome(),
                        corrida.getMotoboy().getPlaca());
            }else {
                System.out.println("Motoboy não encontrado");
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Total de pizzas entregues: %d\n" +
                "Total de refrigerantes entregues: %d\n" +
                "Total pago aos Motoboys: %.2f\n", relatorio.getTotalPizza(),
                relatorio.getTotalRefrigerante(), relatorio.getTotalPagamentoMotoboy());

    }

    private static void listEntregas() {
        ControleCorrida controleCorrida = new ControleCorrida();
        controleCorrida.listCorrida();
    }

    private static void cadastrarCorrida(Scanner scan) {
        int quantidadePizza = 0;
        int quantidadeRefrigerante = 0;
        while(true) {
            System.out.print("Quantidade de Pizza: ");
            quantidadePizza = Integer.parseInt(scan.nextLine());
            System.out.print("Quantidade de Refrigerante: ");
            quantidadeRefrigerante = Integer.parseInt(scan.nextLine());
            if(validaCorrida(quantidadePizza, quantidadeRefrigerante)){
                break;
            }else{
                System.out.println("A quantidade de Pizza e(ou) Refrigerante é invalida para essa corrida\n" +
                        "Max: 6 pizza, 5 refrigerante\n" +
                        "Min: 1 pizza");
            }
        }
        System.out.print("Data: ");
        String data = scan.nextLine();
        System.out.print("Hora: ");
        String hora = scan.nextLine();
        ControleMotoboy controleMotoboy = new ControleMotoboy();
        controleMotoboy.listMotoboy();
        System.out.print("Informe o nome do Motoboy: ");
        String nomeMotoboy = scan.nextLine();
        Motoboy motoboy = controleMotoboy.buscarMotoboy(nomeMotoboy);

        try{
            Corrida corrida = new Corrida(quantidadePizza, quantidadeRefrigerante, data, hora, motoboy);
            ControleCorrida controleCorrida = new ControleCorrida();
            controleCorrida.addCorrida(corrida);
            System.out.println("Corrida cadastrada com sucesso!");
        }catch (Exception e){
            System.out.println("Ocorreu um erro durante o cadastro da corrida!");
        }

    }

    private static boolean validaCorrida(int quantidadePizza, int quantidadeRefrigerante) {
        if(quantidadePizza > 0 && quantidadePizza <= 6 && quantidadeRefrigerante <= 5){
            return true;
        }else{
            return false;
        }
    }

    private static void cadastarMotoboy(Scanner scan) {
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        String placa = null;
        while(true){
            System.out.print("Informe a Placa (formato AAA-9999): ");
            placa = scan.nextLine();
            if(validaPlaca(placa)){
                break;
            }else{
                System.out.println("Placa invalida, verifique se esta no formato AAA-9999 " +
                        "e as letras devem ser Maiusculas.");
            }
        }

        try{
            Motoboy motoboy = new Motoboy(nome, placa);
            ControleMotoboy controleMotoboy = new ControleMotoboy();
            controleMotoboy.addMotoboy(motoboy);
            System.out.println("Motoboy adicionado com Sucesso!");
        }catch (Exception e){
            System.out.println("Ocorreu um erro durante o cadastro do Motoboy!");
        }
    }

    private static boolean validaPlaca(String placa) {
        Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");
        Matcher matcher = pattern.matcher(placa);
        return matcher.matches();
    }
}

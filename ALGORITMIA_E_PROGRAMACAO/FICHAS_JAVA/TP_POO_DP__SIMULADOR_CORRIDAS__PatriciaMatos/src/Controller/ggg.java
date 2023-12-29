package Controller;

import Domain.Enum.TipoCarro;
import Domain.ItemsCorrida.ItemsCorrida.Habilidade;
import Domain.ItemsCorrida.ItemsCorrida.ItemCorrida;
import Domain.ItemsCorrida.ItemsCorrida.Modificacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVModificacoesHabilidades {
    private String filePath;

    public CSVModificacoesHabilidades(String filePath) {

        this.filePath = filePath;
    }

    public ArrayList<ItemCorrida> readCSVToRepository() throws FileNotFoundException {
        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        ArrayList<ItemCorrida> arrayItemCorrida = new ArrayList<>();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipo = linhaDividida[0];
            String nome = linhaDividida[1];
            int precoEmFichasCorrida = Integer.parseInt(linhaDividida[2]);
            int aumentoPotencia = Integer.parseInt(linhaDividida[3]);
            int diminuicaoDesgaste = Integer.parseInt(linhaDividida[4]);
            double diminuicaoPeso = Double.parseDouble(linhaDividida[5]);
            String carrosPermitidos = linhaDividida[6];
            carrosPermitidos = carrosPermitidos.replace("[", "");
            carrosPermitidos = carrosPermitidos.replace("]", "");


            //estamos a declarar o objeto itemcorridaatual que é uma instancia da classe itemcorrida
            ItemCorrida itemCorridaAtual = null;

            switch (tipo) {
                case "Modificacao":


                    String[] carrosPermitidosArray = carrosPermitidos.split(",");

                    for(String carroPermitidoAtual : carrosPermitidosArray){
                        switch (carroPermitidoAtual){
                            case "GT":
                                //porque é que está em parenteses -perguntar ao durval
                                ((Modificacao) itemCorridaAtual).addTipoPermitido(TipoCarro.GT);
                                break;

                            case "F1":
                                ((Modificacao) itemCorridaAtual).addTipoPermitido(TipoCarro.F1);
                                break;

                            case "RALLY":
                                ((Modificacao) itemCorridaAtual).addTipoPermitido(TipoCarro.RALLY);
                                break;
                        }
                    }
                    itemCorridaAtual=new Modificacao(nome,precoEmFichasCorrida,diminuicaoDesgaste,diminuicaoPeso);
                    break;

                case "Habilidade":
                    itemCorridaAtual= new Habilidade(nome,precoEmFichasCorrida,aumentoPotencia);
                    break;
            }

            arrayItemCorrida.add(itemCorridaAtual);

        }
        return arrayItemCorrida;
    }
}
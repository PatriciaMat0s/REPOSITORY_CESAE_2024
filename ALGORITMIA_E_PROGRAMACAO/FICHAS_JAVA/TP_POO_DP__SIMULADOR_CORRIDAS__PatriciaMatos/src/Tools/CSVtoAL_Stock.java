package Tools;
import Domain.ItemsCorrida.ItemsCorrida;

import Domain.Veiculo.Carro;
import Domain.Enums.TipoCarro;
import Domain.Veiculo.Mota;
import Domain.Veiculo.Veiculo;

import Domain.ItemsCorrida.Habilidade;
import Domain.ItemsCorrida.ItemsCorrida;
import Domain.ItemsCorrida.Modificacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVtoAL_Stock {
        private String filePath;
        ItemsCorrida stock;

        //método construtor da classe:
        public CSVtoAL_Stock(String filePath) {
            this.filePath = filePath;
        }


    /**
     * Funçao que cria um arraylist de objectos da classe ItemsCorrida a partir de dados de um ficheiro csv.
     * Lê o ficheiro csv, converte cada linha em atributos ora da classe Modificacao ora da classe Habilidade (ie, subclasses da ItemsCorrida), e usa-os para criar um objeto. Instancia pois uma classe por cada linha.
     * @return ArrayList<ItemsCorrida>
     */
    public ArrayList<ItemsCorrida> readCSVtoAL_Stock() throws FileNotFoundException {

            File file = new File(this.filePath);
            Scanner myScanner = new Scanner(file);

            String linha = myScanner.nextLine();

            ArrayList<ItemsCorrida> stock = new ArrayList<>();

//            MODIFICACAO) tipo,nome,precoFichasCorrida,diminuicaoDesgaste,diminuicaoPeso,tipoCarropermitido
//            HABILIDADE) tipo,nome,precoFichasCorrida,aumentoPotencia
//            ITEMS) tipo,nome,precoFichasCorrida,diminuicaoDesgaste,diminuicaoPeso,aumentoPotencia,tipoCarroPermitido

        //Ao criar este ficheiro, coloquei todos os atributos destas classes nas colunas, e coloquei a 0 (zero) caso a classe correspondente nao os tenha
        //conveniencia em colocar o tipocarro na ultima coluna

            while (myScanner.hasNextLine()) {
                linha = myScanner.nextLine();

                String[] linhaDividida = linha.split(",");

                String tipoItemCorrida= linhaDividida[0];
                String nome = linhaDividida[1];
                int precoFichasCorrida = Integer.parseInt(linhaDividida[2]);
                double diminuicaoDesgaste = Double.parseDouble(linhaDividida[3]);
                double diminuicaoPeso = Double.parseDouble(linhaDividida[4]);
                double aumentoPotencia = Double.parseDouble(linhaDividida[5]);



                ItemsCorrida itemCorridaAtual = null;

                if (tipoItemCorrida.equals("Modificacao")){
                    String tipoCarroStr = linhaDividida[6];
                    tipoCarroStr.replace("[","");
                    tipoCarroStr.replace("]","");
                    String[] tipoCarroArray = tipoCarroStr.split(",");



                    for (String tipoCarroPermitidoAtual : tipoCarroArray) {

                        switch (tipoCarroPermitidoAtual) {
                            case "F1":
                                ((Modificacao) itemCorridaAtual).addTipoCarroPermitido(TipoCarro.F1);
//                                NOME_ARRAYLIST.add(ELEMENTOAADICIONAR)
//                                cars.add("Volvo");
                                break;
                            case "RALLY":
                                ((Modificacao) itemCorridaAtual).addTipoCarroPermitido(TipoCarro.RALLY);
                                break;
                            case "GT":
                                ((Modificacao) itemCorridaAtual).addTipoCarroPermitido(TipoCarro.GT);
                                break;
                            case "CARROCA":
                                ((Modificacao) itemCorridaAtual).addTipoCarroPermitido(TipoCarro.CARROCA);
                                break;
                        }
                    } //fecho do for:each

//                    MODIFICACAO) tipo,nome,precoFichasCorrida,diminuicaoDesgaste,diminuicaoPeso,tipoCarropermitido
                    //Vou criar um objecto da classe Modificaçao:
                    itemCorridaAtual = new Modificacao(nome,precoFichasCorrida,diminuicaoDesgaste,diminuicaoPeso);
                }

                if (tipoItemCorrida.equals("Habilidade")){
//                    Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco)
                      itemCorridaAtual = new Habilidade(nome, precoFichasCorrida, aumentoPotencia);
                }


                stock.add(itemCorridaAtual);

            }

            return stock;

        }
    }
package Tools;
import Domain.ItemCorrida;

import Domain.Carro;
import Domain.Enums.TipoCarro;
import Domain.Mota;
import Domain.Veiculo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVtoAL_Stock {
        private String filePath;
        ItemCorrida stock;


        //método construtor da classe:
        public CSVtoAL_Stock(String filePath) {
            this.filePath = filePath;
        }

        //Funçao para ler o Ficheiro ItemsCorrida, sendo cada linha convertida para parâmetros da classe Veiculo, criando um objeto por linha:

    public ArrayList<Veiculo> readCSVtoAL_Garagem() throws FileNotFoundException {

            File file = new File(this.filePath);
            Scanner myScanner = new Scanner(file);

            String linha1 = myScanner.nextLine();
            String linha = myScanner.nextLine();

            ArrayList<ItemCorrida> stock = new ArrayList<>();

//            MODIFICACAO) tipo,nome,precoFichasCorrida,diminuicaoDesgaste,diminuicaoPeso,tipoCarro
//            HABILIDADE) tipo,nome,precoFichasCorrida,aumentoPotencia,0,0

            while (myScanner.hasNextLine()) {
                linha = myScanner.nextLine();

                String[] linhaDividida = linha.split(",");

                String tipoItemCorrida= linhaDividida[0];

                String nome = linhaDividida[1];
                int precoFichasCorrida = Integer.parseInt(linhaDividida[2]);
                double diminuicaoDesgaste = Double.parseDouble(linhaDividida[3]);
                double diminuicaoPeso = Double.parseDouble(linhaDividida[4]);


                if (tipoItemCorrida =="Modificacao"){
                    String tipoCarroStr = linhaDividida[6];
                    TipoCarro tipoCarro = null; // A enumeração precisou nao só de ser declarada, mas tambem inicializada a null!

                    switch (tipoCarroStr) {
                        case "F1":
                            tipoCarro = TipoCarro.F1;
                            break;
                        case "RALLY":
                            tipoCarro = TipoCarro.RALLY;
                            break;
                        case "GT":
                            tipoCarro = TipoCarro.GT;
                            break;
                        case "CARROCA":
                            tipoCarro = TipoCarro.CARROCA;
                            break;
                    }

//                     Carro(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
                       Veiculo veiculoAtual = new Carro(marca, modelo, potencia, peso, 0, preco, tipoCarro);
                }

                if (tipoVeiculo =="Mota"){
//                    Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco)
                      Veiculo veiculoAtual = new Mota(marca, modelo, potencia, peso, 0, preco);
                }

                garagem.add(veiculoAtual);

            }

            return garagem;

        }
    }
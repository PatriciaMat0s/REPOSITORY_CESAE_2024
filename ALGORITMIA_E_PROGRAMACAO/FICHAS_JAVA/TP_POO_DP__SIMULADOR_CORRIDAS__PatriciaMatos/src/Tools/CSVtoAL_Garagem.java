package Tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Enums.TipoCarro;
import Domain.ItemCorrida;
import Domain.Veiculo;
import Domain.Carro;
import Domain.Mota;

public class CSVtoAL_Garagem {
        private String filePath;
        ItemCorrida itemCorrida;


        //método construtor da classe:
        public CSVtoAL_Garagem(String filePath) {
            this.filePath = filePath;
        }

        //Funçao para ler o Ficheiro ItensCorrida, sendo cada linha convertida para parâmetros da classe ItemCorrida, criando um objeto por linha:


    public ArrayList<Veiculo> readCSVtoAL_Garagem() throws FileNotFoundException {

            File file = new File(this.filePath);
            Scanner myScanner = new Scanner(file);

            String linha = myScanner.nextLine();

            ArrayList<ItemCorrida> garagem = new ArrayList<>();

            while (myScanner.hasNextLine()) {
                linha = myScanner.nextLine();
                String[] linhaDividida = linha.split(";");

                String tipoVeiculo =linhaDividida[0];
                String marca = linhaDividida[1];
                String modelo = linhaDividida[2];
                int potencia = Integer.parseInt(linhaDividida[3]);
                double peso = Double.parseDouble(linhaDividida[4]);
                int preco = Integer.parseInt(linhaDividida[5]);


                //Veiculo(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco)
                //"'Veiculo' is abstract; cannot be instantiated" - por isso é necessário

                if (tipoVeiculo =="Carro"){
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
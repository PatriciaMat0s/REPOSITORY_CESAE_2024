package Tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Enums.TipoCarro;

import Domain.ItemsCorrida.ItemsCorrida;
import Domain.Veiculo.Veiculo;
import Domain.Veiculo.Carro;
import Domain.Veiculo.Mota;

public class CSVtoAL_Garagem {
        private String filePath;
        private ItemsCorrida stock;


        //método construtor da classe:
        public CSVtoAL_Garagem(String filePath) {
            this.filePath = filePath;
        }

        //Funçao para ler o Ficheiro veiculosCorrida, sendo cada linha convertida para parâmetros da classe ItemCorrida, criando um objeto por linha:


    public ArrayList<Veiculo> readCSVtoAL_Garagem() throws FileNotFoundException {

            File file = new File(this.filePath);
            Scanner myScanner = new Scanner(file);

            String linha = myScanner.nextLine();

            ArrayList<Veiculo> garagem = new ArrayList<>();

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

                Veiculo veiculoAtual = null; /////

                if (tipoVeiculo.equals("Carro")){
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
                       veiculoAtual = new Carro(marca, modelo, potencia, peso, 0, preco, tipoCarro);
                }


                if (tipoVeiculo.equals("Mota")){
//                    Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco)
                      veiculoAtual = new Mota(marca, modelo, potencia, peso, 0, preco);
                }

                garagem.add(veiculoAtual);

            }

            return garagem;

        }
    }
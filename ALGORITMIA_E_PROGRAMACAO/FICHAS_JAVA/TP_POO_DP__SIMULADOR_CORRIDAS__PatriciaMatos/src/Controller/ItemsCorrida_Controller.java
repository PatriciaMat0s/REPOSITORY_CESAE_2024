package Controller;

import Domain.ItemsCorrida.Habilidade;
import Domain.ItemsCorrida.ItemsCorrida;
import Domain.ItemsCorrida.Modificacao;
import Domain.Piloto;
import Domain.Veiculo.Veiculo;
import Domain.Veiculo.Carro;
import Domain.Veiculo.Mota;
import Inventario.ItemsCorrida_Inventario;
import Inventario.Veiculos_Inventario;
import Domain.Enums.TipoCarro;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


import java.io.IOException;
import java.util.Random;


public class ItemsCorrida_Controller {

    private ArrayList<ItemsCorrida> listaItems;

    //método construtor:
    public ItemsCorrida_Controller() throws FileNotFoundException {
        ItemsCorrida_Inventario inventarioItems = new ItemsCorrida_Inventario("Ficheiros/ItemsCorrida.csv");
        this.listaItems = inventarioItems.getStock();
    }


    //Vamos escrever os métodos relativos ao array dos ItemsCorrida aqui:

    /**
     * //     * Método que imprime aleatoriamente 6 itens em stock e as suas especificaçoes.
     * //
     */
    public void imprimirStockItems() {

        //Accionar a funcionalidade da escolha aleatoria (ie, instanciar objeto Random):
        Random rand = new Random();

        // Criar um arrayList cujos elementos sao numeros inteiros, que vao representar os indices do arraylist stock cujos elementos (ie, objectos da classe ItemsCorrida) vao ser (aleatoriamente) acedidos:
        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();

        // Fixar o tamanho do array de indices aleatorios em 6 pois queremos extrair 6 elementos do arraylist stock
        // Aqui usamos um ciclo while pois nao sabemos quantas vezes temos de aferir indices DISTINTOS UNS DOS OUTROS; se fizesse sentido apresentar items repetidos podíamos ter usado um for - aliás, até nem seria necessário criar um arraylist auxiliar (arrayIndexAleatorio)
        while (arrayIndexAleatorio.size() < 6) {
            int indexAleatorio = rand.nextInt(0, listaItems.size());

            // Garantir que os numeros obtidos aleatoriamente não se repetem
            if (!arrayIndexAleatorio.contains(indexAleatorio)) { //Atenção ao ! a marcar a negaçao expressa no metodo contains!
                arrayIndexAleatorio.add(indexAleatorio);
            }
        }

        // Agora que temos um arraylist com seis numeros inteiros DISTINTOS, vamos iterar todos eles e usá-los como índices a extrair do arraylist stock, através da função get.
        // Imprimimos os elementos do stock acedidos através do get com os índices de interesse:

        ItemsCorrida itemCorridaAtual;
        int contador = 1;
        System.out.println("**-**-* LIST OF ITEMS CURRENTLY IN STOCK: *-**-**");
        for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
            itemCorridaAtual = listaItems.get(arrayIndexAleatorio.get(i));
            System.out.print("ITEM #" + contador++ + ": ");
            //Simplifiquei, nao apresentando a especificade referente às subclasses (habilidade e modificaçao):
            itemCorridaAtual.mostrarDetalhes();
        }
    } //fecho funçao imprimirStockItens


    /**
     * Método que recebe o piloto como parâmetro, e faz a verificação de a compra poder ser efetuada. Caso afirmativo, deve alterar o Veiculo do Piloto, bem como decrementar as suas fichas de corrida.
     *
     * @param piloto           objeto classe Piloto
     * @param numItemEscolhido é o numero inteiro da escolha do utilizador face à lista de items apresentada na consola
     */

    public void comprarItemCorrida(Piloto piloto, int numItemEscolhido) {

        Veiculo veiculoAtual = piloto.getVeiculoAtual(); //redundante haver a igualdades, mas assim dá mais confiança e reafirma-se a engrenagem de pensar
        ItemsCorrida itemDesejado;

        //Obter o objecto item escolhido do array dos Items (obtido por leitura do ficheiro, ver nas TOOLS)
        //O índice que corresponde ao item escolhido será o número com que foi listado na funçao imprimirStockItems menos um pois ao numero#1 da lista impressa corresponde o índice 0 do array:
        itemDesejado = listaItems.get(numItemEscolhido - 1);

        //Vamos comparar o crédito do Piloto com o preço do item que quer adquirir

        //Caso o piloto possa comprar o item:
        if (piloto.getFichasCorrida() >= itemDesejado.getPreco()) {
            System.out.println("PROCEEDING TO ITEM ACQUISITION:");

            //Descontar o preço do item ao crédito do jogador (guardado na variável fichasCorrida):
            piloto.setFichasCorrida(piloto.getFichasCorrida() - itemDesejado.getPreco());


            //Adicionar o itemcomprado/desejado ao arraylist kitcorrida ou habildade, parametros da classe Carro e Mota respectivamente
//
            //(veiculoAtual.getModificacoesCarro).add(itemDesejado); >>> Nao vai funcionar...
            // Por isso vamos fazer um CAST! Como que uma herança em sentido reverso. Muito engenhoso e útil.
            // Nao podemos adicionar um elemento ao array pois o carro ou a mota estao guardados num objecto da Classe Veiculo, que nao tem arrays como atributo.
            if (veiculoAtual instanceof Mota) {
                ((Mota) veiculoAtual).getHabilidadesMota().add((Habilidade) itemDesejado);
            }

            if (veiculoAtual instanceof Carro) {
                ((Carro) veiculoAtual).getModificacoesCarro().add((Modificacao) itemDesejado);
            }


        } else {   //Caso o piloto nao possa comprar o item:
            System.out.println("BOOHOO, YOU DON'T HAVE ENOUGH COINS TO ACQUIRE THE ITEM!");
            System.out.println("TT__TT");
        }
    }


    /**
     * Método que imprime o inventário de itens do VeiculoAtual e pergunta qual quer usar, sendo que seguidamente aplica os efeitos do item a usar no Veiculo do Piloto.
     *
     * @param piloto //* @param numItemEscolhido é o numero da opçao introduzida pelo jogador, lida da consola
     */
    public void usarItemCorrida(Piloto piloto) {   //}, int numItemEscolhido) {

        Veiculo veiculoAtual = piloto.getVeiculoAtual();
        ItemsCorrida itemCorridaAtual;
        Scanner input = new Scanner(System.in);

//IMPRIMIR INVENTÁRIOS DE ITEMS:
        int contador = 1;
        if (veiculoAtual instanceof Mota) { //CASO O VEICULOATUAL SEJA MOTA:
            System.out.println("**-**-* LIST OF THE ITEMS (MOTORBIKE HABILITIES) YOU BOUGHT: *-**-**");
            for (int i = 0; i < ((Mota) veiculoAtual).getHabilidadesMota().size(); i++) {
                itemCorridaAtual = (((Mota) veiculoAtual).getHabilidadesMota()).get(i);
                System.out.print("ITEM #" + contador++ + ": ");
                itemCorridaAtual.mostrarDetalhes();
            }

            // Perguntar qual item quer usar, ir buscá-lo, e aplicar os efeitos do item escolhido no Veiculo do Piloto:

            System.out.println("WHICH #ITEM DO YOU WANT TO USE?");
            int numItemAUsar = input.nextInt();

            Habilidade habilidadeAUsar;
            habilidadeAUsar = (((Mota) veiculoAtual).getHabilidadesMota()).get(numItemAUsar - 1);


            //Reinstanciar a classe veiculo com os upgrades derivados de aplicar o item, ou seja, reinstanciar a Mota:

            //1. Alguns dos atributos do veiculoAtual devem ser conservados visto que nao vao ser influenciados pela aplicaçao do item adquirido:
            String marca = ((Mota) veiculoAtual).getMarca();
            String modelo = ((Mota) veiculoAtual).getModelo();
            double preco = ((Mota) veiculoAtual).getPreco();

            //2. Por outro lado, os atributos que vao beneficiar da aplicaçao do item vao ser editados
            // >>> a potencia vai aumentar:
            double potencia = ((Mota) veiculoAtual).getPotenciaCV() + habilidadeAUsar.getAumentoPotencia(); //WTF tenho tudo a int

            // >>> o peso mantem-se, pois as habilidades nao o diminuem (as modifics dimiuem o peso):
            double peso = ((Mota) veiculoAtual).getPesoKg();

            // >>> o peso mantem-se, pois as habilidades nao o diminuem (as modifics, sim, vao diminuir o peso):
            int desgaste = ((Mota) veiculoAtual).getDesgaste();

            //Finalmente:
            veiculoAtual = new Mota(marca, modelo, (int) potencia, peso, desgaste, (int) preco);
        }

        if (veiculoAtual instanceof Carro) { //CASO O VEICULOATUAL SEJA CARRO:

            TipoCarro tipoCarro;
            tipoCarro = ((Carro) veiculoAtual).getTipoCarro();
            ArrayList<Modificacao> arrayTiposCarro = new ArrayList<Modificacao>();

            switch (tipoCarro) {

                case F1:
//                    System.out.println("**-**-* LIST OF THE ITEMS (CAR MODIFICATIONS) YOU BOUGHT: *-**-**");
//                    for (int i = 0; i < ((Carro) veiculoAtual).getModificacoesCarro().size(); i++) {
//                        itemCorridaAtual = (((Carro) veiculoAtual).getModificacoesCarro()).get(i);
//                        System.out.print("ITEM #" + contador++ + ": ");
//                        itemCorridaAtual.mostrarDetalhes();
//                        arrayTiposCarro.add((Modificacao) itemCorridaAtual);
//                    }

                    System.out.println("**-**-* LIST OF THE ITEMS (CAR MODIFICATIONS) YOU BOUGHT: *-**-**");
                    //for (int i = 0; i < ((Modificacao) itemCorridaAtual).getCarrosPermitidos().size(); i++) {
                        for (TipoCarro tipoCarraoAtual: ((Modificacao) itemCorridaAtual).getCarrosPermitidos()) {
                                                                                //[G1, RALLY, F1]
                            if (tipoCarro == tipoCarraoAtual){
                                System.out.print("ITEM #" + contador++ + ": "+itemCorridaAtual);

                            }
                        }

                        tipoCarro = (((Modificacao) itemCorridaAtual).getCarrosPermitidos()).get(i);
                        if (tipoCarro == ((Modificacao) itemCorridaAtual).getCarr {
                            System.out.print("ITEM #" + contador++ + ": ");
                            itemCorridaAtual.mostrarDetalhes();
                            arrayTiposCarro.add((Modificacao) itemCorridaAtual);
                        }


                        // Perguntar qual item quer usar, ir buscá-lo, e aplicar os efeitos do item escolhido no Veiculo do Piloto:

                        System.out.println("WHICH #ITEM DO YOU WANT TO USE?");
                        int numItemAUsar = input.nextInt();

                        Modificacao modificacaoAAUsar;
                        modificacaoAAUsar = (((Carro) veiculoAtual).getModificacoesCarro()).get(numItemAUsar - 1);


                        //Reinstanciar a classe veiculo com os upgrades derivados de aplicar o item, ou seja, reinstanciar a o Carro:
                        // Carro(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro)

                        //1. Atributos a conservar:
                        String marca = ((Carro) veiculoAtual).getMarca();
                        String modelo = ((Carro) veiculoAtual).getModelo();
                        double preco = ((Carro) veiculoAtual).getPreco();

                        //2. Por outro lado, quero alterar os atributos que vao beneficiar da aplicaçao do item:
                        // >>> o desgaste vai diminuir:
                        double potencia = ((Carro) veiculoAtual).getDesgaste() - modificacaoAAUsar.getDiminuicaoDesgaste();

                        // >>> o peso diminui:
                        double peso = ((Carro) veiculoAtual).getPesoKg() - modificacaoAAUsar.getDiminuicaoPeso();

                        // >>> o peso mantem-se, pois as habilidades nao o diminuem (as modifics, sim, vao diminuir o peso):
                        int desgaste = ((Mota) veiculoAtual).getDesgaste();

                        //Finalmente:
                        veiculoAtual = new Carro(marca, modelo, (int) potencia, peso, desgaste, (int) preco, tipoCarro);
                        break;


                        case GT:
                            System.out.println("**-**-* LIST OF THE ITEMS (CAR MODIFICATIONS) YOU BOUGHT: *-**-**");
                            for (int i = 0; i < ((Carro) veiculoAtual).getModificacoesCarro().size(); i++) {
                                itemCorridaAtual = (((Carro) veiculoAtual).getModificacoesCarro()).get(i);
                                System.out.print("ITEM #" + contador++ + ": ");
                                itemCorridaAtual.mostrarDetalhes();
                                arrayTiposCarro.add((Modificacao) itemCorridaAtual);
                            }

                            // Perguntar qual item quer usar, ir buscá-lo, e aplicar os efeitos do item escolhido no Veiculo do Piloto:

                            System.out.println("WHICH #ITEM DO YOU WANT TO USE?");
                            int numItemAUsar = input.nextInt();

                            Modificacao modificacaoAAUsar;
                            modificacaoAAUsar = (((Carro) veiculoAtual).getModificacoesCarro()).get(numItemAUsar - 1);


                            //Reinstanciar a classe veiculo com os upgrades derivados de aplicar o item, ou seja, reinstanciar a o Carro:
                            // Carro(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro)

                            //1. Atributos a conservar:
                            String marca = ((Carro) veiculoAtual).getMarca();
                            String modelo = ((Carro) veiculoAtual).getModelo();
                            double preco = ((Carro) veiculoAtual).getPreco();

                            //2. Por outro lado, quero alterar os atributos que vao beneficiar da aplicaçao do item:
                            // >>> o desgaste vai diminuir:
                            double potencia = ((Carro) veiculoAtual).getDesgaste() - modificacaoAAUsar.getDiminuicaoDesgaste();

                            // >>> o peso diminui:
                            double peso = ((Carro) veiculoAtual).getPesoKg() - modificacaoAAUsar.getDiminuicaoPeso();

                            // >>> o peso mantem-se, pois as habilidades nao o diminuem (as modifics, sim, vao diminuir o peso):
                            int desgaste = ((Mota) veiculoAtual).getDesgaste();

                            //Finalmente:
                            veiculoAtual = new Carro(marca, modelo, (int) potencia, peso, desgaste, (int) preco, tipoCarro);
                            break;


                    } //fecho switch tipos carro

            } //fecho da funçao usarItem()


            //Re-instanciar a classe Veiculo e actualiza o objeto veiculoAtual com os efeitos do item de corrida - os atributos potencia, peso e desgaste sao actualizados)


        }

    }

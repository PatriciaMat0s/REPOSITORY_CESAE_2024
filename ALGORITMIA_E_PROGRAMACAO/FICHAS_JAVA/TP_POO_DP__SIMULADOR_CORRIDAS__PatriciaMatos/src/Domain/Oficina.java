package Domain;

import Domain.ItemsCorrida.ItemsCorrida; import Domain.ItemsCorrida.Modificacao; import Domain.ItemsCorrida.Habilidade;
import Domain.Veiculo.Veiculo; import Domain.Veiculo.Carro; import Domain.Veiculo.Mota;

import Inventario.ItemsCorrida_Inventario; import Inventario.Veiculos_Inventario;

import java.util.ArrayList;
import java.util.Random;

public class Oficina {
    protected ArrayList<Veiculo> garagem; //representa os veículos que o Piloto poderá comprar durante o seu jogo. Sejam carros ou motas.
    protected ArrayList<ItemsCorrida> stock; //representa os itens que o Piloto poderá comprar durante o seu jogo. Sejam Modificações ou Habilidades

    public Oficina() {
        this.garagem = new ArrayList<>();
        this.stock = new ArrayList<>();
    }

//    /**
//     * Método que imprime aleatoriamente 6 itens em stock e as suas especificaçoes.
//     */
//    public void imprimirStock() {
//
//        //Accionar a funcionalidade da escolha aleatoria (ie, instanciar objeto Random):
//        Random rand = new Random();
//
//        // Criar um arrayList cujos elementos sao numeros inteiros, que vao representar os indices do arraylist stock cujos elementos (ie, objectos da classe ItemsCorrida) vao ser (aleatoriamente) acedidos:
//        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();
//
//        // Fixar o tamanho do array de indices aleatorios em 6 pois queremos extrair 6 elementos do arraylist stock
//        // Aqui usamos um ciclo while pois nao sabemos quantas vezes temos de aferir indices DISTINTOS UNS DOS OUTROS; se fizesse sentido apresentar items repetidos podíamos ter usado um for - aliás, até nem seria necessário criar um arraylist auxiliar (arrayIndexAleatorio)
//        while (arrayIndexAleatorio.size() < 6) {
//            int indexAleatorio = rand.nextInt(0, stock.size());
//
//            // Garantir que os numeros obtidos aleatoriamente não se repetem
//            if (!arrayIndexAleatorio.contains(indexAleatorio)) { //Atenção ao ! a marcar a negaçao expressa no metodo contains!
//                arrayIndexAleatorio.add(indexAleatorio);
//            }
//        }
//
//        // Agora que temos um arraylist com seis numeros inteiros DISTINTOS, vamos iterar todos eles e usá-los como índices a extrair do arraylist stock, através da função get.
//        // Imprimimos os elementos do stock acedidos através do get com os índices de interesse:
//
//        ItemsCorrida itemCorridaAtual;
//        int contador = 1;
//        System.out.println("**-**-* LIST OF ITEMS CURRENTLY IN STOCK: *-**-**");
//        for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
//            itemCorridaAtual = stock.get(arrayIndexAleatorio.get(i));
//            System.out.print("ITEM #" + contador++ + ": ");
//            //Simplifiquei, nao apresentando a especificade referente às subclasses (habilidade e modificaçao):
//            itemCorridaAtual.mostrarDetalhes();
//        }
//    } //fecho funçao imprimirstock


    /**
     * FUNÇÃO QUE imprime aleatoriamente 12 veiculos em stock, assim como as suas especificações. Mesmo que a oficina tenha uma garagem maior, apenas 12 devem ser mostrados de forma aleatória.
     */
//    public void imprimirGaragem() {
//
//        Random rand = new Random();
//
//        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();
//
//        while (arrayIndexAleatorio.size() < 12) {
//            int indexAleatorio = rand.nextInt(0, garagem.size());
//
//            if (!arrayIndexAleatorio.contains(indexAleatorio)) {
//                arrayIndexAleatorio.add(indexAleatorio);
//            }
//        }
//
//        Veiculo veiculoAtual;
//        int contador = 1;
//        System.out.println("**-**-* LIST OF VEHICLES CURRENTLY AVAILABLE: *-**-**");
//        for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
//            veiculoAtual = garagem.get(arrayIndexAleatorio.get(i));
//            System.out.print("VEHICLE #" + contador++ + ": ");
//            //Simplifiquei, nao apresentando a especificade referente às subclasses (habilidade e modificaçao):
//            veiculoAtual.mostrarDetalhes();
//        }
//
//    } //fecho metodo imprimirgaragem()



//    /**
//     * Método que recebe o Piloto como parâmetro, e faz uma verificação de a compra poder ser efetuada. Caso afirmativo, acrescenta o item ao inventário do VeiculoAtual do Piloto, além de decrementar as fichas de corrida deste.
//     * @param piloto - número que o utilizador introduz
//     */
//    public void comprarItem(Piloto piloto){
//        ItemsCorrida itemCorrida = null;
//        Veiculo veiculoAtual = null;
//
//        //Vamos comparar o crédito do Piloto com o preço do item que quer adquirir
//        //Caso o piloto possa comprar o item:
//        if ( piloto.getFichasCorrida() >= itemCorrida.getPreco() ){
//            System.out.println("PROCEEDING TO ITEM ACQUISITION:");
//
//            //Descontar o preço do item ao crédito do jogador (guardado na variável fichasCorrida):
//            piloto.setFichasCorrida( piloto.getFichasCorrida()-itemCorrida.getPreco() );
//
//            //Vamos acrescentar o item ao inventário do VeiculoAtual do Piloto:
//            //Ou seja, as modificaçoes ao arraylist kitcorridacarro da classe Carro e as habilidades ao habilidadesmota da classe Mota
//            (ItemsCorrida_Inventario.stock).add(itemCorrida); ????? FTS
//

//        }else{   //Caso o piloto nao possa comprar o item:
//            System.out.println("BOOHOO, YOU DON'T HAVE ENOUGH COINS TO ACQUIRE THE ITEM!");
//            System.out.println("TT__TT");
//        }
//
//    }



//    /**
//     * Método que recebe o Piloto como parâmetro, faz a verificação de a compra
//     * poder ser efetuada. Caso afirmativo, deve alterar o Veiculo do Piloto, bem como decrementar as suas
//     * fichas de corrida.
//     * @param piloto
//     */
//    public void comprarVeiculo(Piloto piloto){
//     FEITO NA CLASSE VEICULOS-CONTROLLER!!!
//    }
//
}

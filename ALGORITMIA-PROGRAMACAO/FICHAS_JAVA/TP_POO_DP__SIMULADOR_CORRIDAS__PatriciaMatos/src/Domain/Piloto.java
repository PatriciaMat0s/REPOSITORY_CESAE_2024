package Domain;

import Domain.Veiculo.Veiculo; //para obter a potencia do veiculoAtual do piloto, usada no metodo de calcular tempo de uma volta
import Domain.Atrasos; //para obter os atrasos, usada no metodo de calcular tempo de uma volta


public class Piloto {
    protected String nome;
    protected int fichasCorrida; //REPRESENTA O CRÉDITO DO JOGADOR!
    // NAO CONFUNDIR COM O ATRIBUTO PRECO NAS CLASSES VEICULO E ITEMSCORRIDA!
    protected Veiculo veiculoAtual;
    protected int numVitorias;

    //método construtor:
    public Piloto(String nome, int fichasCorrida, Veiculo veiculoAtual, int vitorias) {
        this.nome = nome;
        this.fichasCorrida = fichasCorrida;
        this.veiculoAtual = veiculoAtual;
        this.numVitorias = vitorias;
    }

    // Setters e getters e outros metodos:
    public String getNome() {
        return nome;
    }

    public int getFichasCorrida() {
        return fichasCorrida;
    }

    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFichasCorrida(int fichasCorrida) {
        this.fichasCorrida = fichasCorrida;
    }

    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }


//    /**
//     * Método que imprime o inventário de itens do VeiculoAtual e pergunta qual quer usar, sendo que seguidamente aplica os efeitos no Veiculo do Piloto.
//     */
//    public void usarItemCorrida() {
//        //Re-instanciar a classe Veiculo e actualiza o objeto veiculoAtual com os efeitos do item de corrida - os atributos potencia, peso e desgaste sao actualizados)
//
//
//    }


    /**
     * Método que recebe como parâmetro uma pista e retorna o tempo total que o
     * piloto demorou a percorrer a pista no seu Veiculo (cada volta).
     *
     * @param pista
     * @return tempoPista tempo
     */

//   TEMPO TOTAL POR PISTA calcula-se de acordo com:
//   1) distanciaVolta/((1.6*potencia))-(0.2*peso)-(0.5*desgaste))
//   2) A este tempo, somar o tempo que os Momentos (atrasos)  atrasaram
//   3) A cada volta, todos os momentos são repetidos de novo.
//   4) Para calcular o atraso usar: ( (peso*atrasoPeso)+(potencia*atrasoPotencia) )/100
//   A cada volta, o desgaste do veículo aumenta em 20.
    public double corrida(Pista pista) {

        double tempoPistaAtual = 0;
        double atrasoPistaAtual;
        double desgaste = veiculoAtual.getDesgaste(); //Pois a cada volta o desgaste do veículo aumenta em 20!
        int numvolta = pista.getQuantidadeVoltas();

        // (Para nao estar a fazer um switch case com os casos a calcularem o tempo de cada volta, que deu erro pois a funçáo pede um return incondicional no corpo da função, usamos dois ciclos aninhados

        for (int i = 0; i < pista.getQuantidadeVoltas(); i++) {

            //Dado que depois da 1a volta, a cada volta o desgaste aumenta 20 unidades, foi conveniente
            // usar uma expressão matemática geral, ie aplicável a qualquer volta, incluindo à que nao tem o incremento de desgaste:
            // Incremento desgaste: 1ªvolta = 20x0 | 2ªvolta = 20x1 | 3ªvolta = 20x2 | 4ªvolta = 20x3 | 5ªvolta = 20x4:

            desgaste = desgaste + 20*i;
            //Aplicar à fórmula fornecida no enunciado:
            tempoPistaAtual = pista.getDistanciaVoltaMetros() / ((1.6 * veiculoAtual.getPotenciaCV())) - (0.2 * veiculoAtual.getPesoKg()) - (0.5 * desgaste);

            // Agora, adicionar os atrasos ("momentos") a cada volta, iterando o array que os guarda (atrasosPista) visto que a cada volta, todos os momentos são repetidos de novo
            for (Atrasos atrasoAtual : pista.getAtrasosPista()) {

                atrasoPistaAtual = (veiculoAtual.getPesoKg() * atrasoAtual.atrasoPeso + veiculoAtual.getPotenciaCV() * atrasoAtual.atrasoPeso) / 100;

                tempoPistaAtual = tempoPistaAtual + atrasoPistaAtual;
            }
        }
        return tempoPistaAtual;

    }



    //FUNCAO PEDIA UM RETURN GERAL E SÓ TINHA RETURNS PARCIAIS POR CHAVETA, E DAVA ERRO
//    public double corrida(Pista pista) {
//
//        double tempoPistaAtual;
//        double atrasoPistaAtual;
//        Atrasos atraso = null;
//        double desgaste = veiculoAtual.getDesgaste(); //Pois a cada volta o desgaste do veículo aumenta em 20!
//
//
//        switch(pista.getQuantidadeVoltas()){
//            case 1:
//                tempoPistaAtual = pista.getDistanciaVoltaMetros() / ((1.6 * veiculoAtual.getPotenciaCV())) - (0.2 * veiculoAtual.getPesoKg()) - (0.5 * desgaste);
//
//                atrasoPistaAtual = (veiculoAtual.getPesoKg() * atraso.atrasoPeso + veiculoAtual.getPotenciaCV() * atraso.atrasoPotencia) / 100;
//
//                tempoPistaAtual = tempoPistaAtual + atrasoPistaAtual;
//                return tempoPistaAtual;
//                //Não é necessário ter um break pois o return tem a mesma fucnionalidade;
//
//            case 2:
//                desgaste = desgaste + 20;
//                tempoPistaAtual = pista.getDistanciaVoltaMetros() / ((1.6 * veiculoAtual.getPotenciaCV())) - (0.2 * veiculoAtual.getPesoKg()) - (0.5 * desgaste);
//
//                atrasoPistaAtual = (veiculoAtual.getPesoKg() * atraso.atrasoPeso + veiculoAtual.getPotenciaCV() * atraso.atrasoPotencia) / 100;
//
//                tempoPistaAtual = tempoPistaAtual + atrasoPistaAtual;
//                return tempoPistaAtual;
//                //break;
//
//            case 3:
//                desgaste = desgaste + 20 + 20;
//                tempoPistaAtual = pista.getDistanciaVoltaMetros() / ((1.6 * veiculoAtual.getPotenciaCV())) - (0.2 * veiculoAtual.getPesoKg()) - (0.5 * desgaste);
//
//                atrasoPistaAtual = (veiculoAtual.getPesoKg() * atraso.atrasoPeso + veiculoAtual.getPotenciaCV() * atraso.atrasoPotencia) / 100;
//
//                tempoPistaAtual = tempoPistaAtual + atrasoPistaAtual;
//                return tempoPistaAtual;
//                //break;
//
//            case 4:
//                desgaste = desgaste + 20 + 20 + 20;
//                tempoPistaAtual = pista.getDistanciaVoltaMetros() / ((1.6 * veiculoAtual.getPotenciaCV())) - (0.2 * veiculoAtual.getPesoKg()) - (0.5 * desgaste);
//
//                atrasoPistaAtual = (veiculoAtual.getPesoKg() * atraso.atrasoPeso + veiculoAtual.getPotenciaCV() * atraso.atrasoPotencia) / 100;
//
//                tempoPistaAtual = tempoPistaAtual + atrasoPistaAtual;
//                return tempoPistaAtual;
//                //break;
//
//            case 5:
//                desgaste = desgaste + 20 + 20 + 20 + 20;
//                tempoPistaAtual = pista.getDistanciaVoltaMetros() / ((1.6 * veiculoAtual.getPotenciaCV())) - (0.2 * veiculoAtual.getPesoKg()) - (0.5 * desgaste);
//
//                atrasoPistaAtual = (veiculoAtual.getPesoKg() * atraso.atrasoPeso + veiculoAtual.getPotenciaCV() * atraso.atrasoPotencia) / 100;
//
//                tempoPistaAtual = tempoPistaAtual + atrasoPistaAtual;
//                return tempoPistaAtual;
//                //break;
//        }//fecho switch
//
//    }


// FUNÇÃO QUE ESCREVI A INTERPRETAR MAL O ENUNCIADO, OU SEJA, ASSUMINDO QUE O TEMPO RETORNADO ERA DO JOGO COMPLETO, IE, DAS 5 VOLTAS À PISTA.
    //CONSERVEI AQUI, ANYWAY:
//    public double corrida(Pista pista) {
//        double tempoPistaAtual;
//        double tempoTotal = 0;
//        double atrasoPistaAtual;
//        Atrasos atraso = null;
//        double desgaste = veiculoAtual.getDesgaste(); //Pois a cada volta o desgaste do veículo aumenta em 20!
//
//
//        for (int i = 1; i < 6; i++) {
//
//            tempoPistaAtual = pista.getDistanciaVoltaMetros() / ((1.6 * veiculoAtual.getPotenciaCV())) - (0.2 * veiculoAtual.getPesoKg()) - (0.5 * desgaste);
//
//            desgaste = desgaste + 20;
//
//            atrasoPistaAtual = (veiculoAtual.getPesoKg() * atraso.atrasoPeso + veiculoAtual.getPotenciaCV() * atraso.atrasoPotencia) / 100;
//
//            tempoTotal = tempoTotal + tempoPistaAtual + atrasoPistaAtual;
//        }
//
//        return tempoTotal;
//    }



} //fecho classe

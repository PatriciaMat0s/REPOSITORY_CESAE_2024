public class Piloto {

    Crie uma classe “Piloto” com os atributos:
             nome (String)
 fichasCorrida (int)
 veiculoAtual (Veiculo)
 vitorias (int)
• Deve ter o método usarItem( ) que imprime o inventário de itens do VeiculoAtual e pergunta qual quer usar,
    seguidamente aplica os efeitos no Veiculo do Piloto.
• Deve implementar o método corrida( ) que recebe como parâmetro uma pista e retorna o tempo total que o
    piloto demorou a percorrer a pista no seu Veiculo, de acordo com as seguintes regras:
    o Calcula o tempo de cada volta de acordo com a seguinte fórmula:
             distanciaVolta/((1.6*potencia))-(0.2*peso)-(0.5*desgaste))
             A este tempo, somar o tempo que os Momentos atrasaram. Sendo que a cada volta, todos os
    momentos são repetidos de novo. Para calcular o atraso usar:
            ((peso*atrasoPeso)+(potencia*atrasoPotencia))/100
    A cada volta, o desgaste do veículo aumenta em 20.

}

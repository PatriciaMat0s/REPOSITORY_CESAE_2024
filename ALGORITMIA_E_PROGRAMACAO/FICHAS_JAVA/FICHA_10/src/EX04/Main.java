package EX04;

import EX01.TipoCombustivel;

public class Main {

    public static void main(String[] args) {

        Imovel minhacasinha = new Imovel("rua sésamo", "69", "Cu do Judas", TipoImovel.MANSAO, Acabamento.NOVA, 150, 3, 4, 10);
        Imovel tuacasinha = new Imovel("rua sésamo", "70", "Cu do Judas", TipoImovel.MANSAO, Acabamento.NOVA, 100, 4, 2, 3);

        minhacasinha.calcularValorImovel();
        System.out.println("");
        minhacasinha.mudarAcabamento(Acabamento.NOVA_COM_ALTO_ACABAMENTO);
        System.out.println("");
        minhacasinha.compararImoveis(tuacasinha);
        minhacasinha.imprimirDescricao();
        tuacasinha.imprimirDescricao();


    }
}


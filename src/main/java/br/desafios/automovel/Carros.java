package br.desafios.automovel;

public class Carros {
    public static void main(String[] args) {

        Esportivo esportivo = new Esportivo();
        esportivo.setCombustivel(200);
        esportivo.setTiposDeCombustivel(TiposDeCombustivel.GASOLINA);

        System.out.println(esportivo);

        Caminhao caminhao = new Caminhao();
        caminhao.setCombustivel(100);
        caminhao.setTiposDeCombustivel(TiposDeCombustivel.DIESEL);

        System.out.println(caminhao);
    }
}

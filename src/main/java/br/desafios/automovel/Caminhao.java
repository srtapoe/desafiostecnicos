package br.desafios.automovel;

public class Caminhao extends Automovel{
    public Caminhao(){}

    @Override
    public String toString() {
        return "Caminhao{" +
                "\nCombustível: " + super.getCombustivel() + " litros" +
                "\nTipo de Combustível: " + super.getTiposDeCombustivel() +
                "}\n";
    }
}

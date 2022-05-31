package br.desafios.automovel;

public class Esportivo extends Automovel{

    public Esportivo(){}

    @Override
    public String toString() {
        return "Esportivo{" +
                "\nCombustível: " + super.getCombustivel() + " litros" +
                "\nTipo de Combustível: " + super.getTiposDeCombustivel() +
                "}\n";
    }
}

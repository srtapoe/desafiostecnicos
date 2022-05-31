package br.desafios.agenda;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contato {

    private int codPessoa;
    private String numTelefone;
    private int idade;

    public Contato(int codPessoa, String numTelefone, int idade) {
        this.codPessoa = codPessoa;
        this.numTelefone = numTelefone;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contato:  \n" +
                "\nCódigo:" + codPessoa +
                "\nNúmero: '" + numTelefone + '\'' +
                "\nIdade: " + idade +
                "\n";
    }
}

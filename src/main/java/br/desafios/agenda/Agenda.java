package br.desafios.agenda;

import java.util.ArrayList;

public class Agenda {
    public static void main(String[] args) {

        Contato contato1 = new Contato(1, "1111-1111", 30);
        Contato contato2 = new Contato(2, "2222-2222", 30);
        Contato contato3 = new Contato(3, "3333-3333", 29);

        ArrayList<Contato> agenda = new ArrayList<>();
        agenda.add(contato1);
        agenda.add(contato2);
        agenda.add(contato3);

        for (Contato contatos: agenda) {
            System.out.println(agenda.toString());
        }

        System.out.println("=========REMOVENDO CONTATO=========");
        agenda.remove(0);

        for (Contato contatos: agenda) {
            System.out.println(agenda.toString());
        }

    }
}

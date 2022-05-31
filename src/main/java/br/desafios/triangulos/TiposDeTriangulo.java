package br.desafios.triangulos;

import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {
        Scanner dados  = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int ladoUm = dados.nextInt();
        System.out.println("Digite o segundo lado: ");
        int ladoDois = dados.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int ladoTres = dados.nextInt();

        int trianguloOuNao = ladoUm + ladoDois;

        if(trianguloOuNao > ladoTres){
            if(ladoUm == ladoDois && ladoDois == ladoTres){
                System.out.println("Triângulo Equilátero");
            }else if(ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres){
                System.out.println("Triângulo Isóceles");
            }else {
                System.out.println("Triângulo Escaleno");
            }
        }else{
            System.out.println("Não é triângulo!");
        }
    }
}

package Pesquisa.ExercicioSomaNumeros;

import java.util.ArrayList;
import java.util.List;


public class SomaNumero {

    private List<NumeroInteiro> numeroList;

    public SomaNumero () {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new NumeroInteiro(numero));
        System.out.println("Número " + numero + " adicionado.");
    }

    public int calcularSoma() {
       int somando = 0;
        if (!numeroList.isEmpty()) {
            for (NumeroInteiro ni : numeroList) {
                somando += ni.getNumero();
            }
            
        } else {
            System.out.println("Não há elementos na lista. Resultado null.");
        }
    return somando;    
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (NumeroInteiro ni : numeroList) {
                if(ni.getNumero() > maiorNumero) {
                    maiorNumero = ni.getNumero();
                }
            }
        } else {
            System.out.println("Não há elementos na lista. Resultado null.");
        }
    return maiorNumero;     
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (NumeroInteiro ni : numeroList) {
                if(ni.getNumero() < menorNumero) {
                    menorNumero = ni.getNumero();
                }
            }
        } else {
            System.out.println("Não há elementos na lista. Resultado null.");
        }
    return menorNumero;     
    }

    public void exibirNumeros() {
        System.out.println(numeroList);
    }
 
public static void main(String[] args) {
    SomaNumero somarNumeros = new SomaNumero();

    somarNumeros.adicionarNumero(1);
    somarNumeros.adicionarNumero(10);
    somarNumeros.adicionarNumero(3);
    somarNumeros.adicionarNumero(8);
    System.out.println(somarNumeros.calcularSoma());
    System.out.println(somarNumeros.encontrarMaiorNumero());
    System.out.println(somarNumeros.encontrarMenorNumero());
}

}

package controller;

import model.estrutura.grafo.GrafoMatriz;

public class GrafoMatrizController {
    public GrafoMatrizController() {
        super();
    }

    // Método de teste para criar e conectar nós em um grafo de matriz
    public String teste() throws Exception {
        // Inicializa os rótulos dos nós do grafo
        String[] routers = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
        GrafoMatriz g = new GrafoMatriz(routers);

        // Adiciona arestas (conexões) entre os nós especificados
        g.link("A", "B");
        g.link("A", "D");
        g.link("A", "F");
        g.link("B", "C");
        g.link("C", "I");
        g.link("C", "J");
        g.link("D", "G");
        g.link("D", "H");
        g.link("D", "I");
        g.link("E", "H");
        g.link("E", "J");
        g.link("F", "H");
        g.link("F", "K");
        g.link("G", "L");
        g.link("H", "F");
        g.link("H", "D");
        g.link("H", "E");
        g.link("I", "D");
        g.link("I", "C");
        g.link("I", "J");
        g.link("J", "C");
        g.link("J", "I");
        g.link("J", "N");
        g.link("K", "F");
        g.link("K", "L");
        g.link("L", "G");
        g.link("L", "K");
        g.link("L", "M");
        g.link("M", "L");
        g.link("M", "N");
        g.link("N", "J");
        g.link("N", "M");
        g.link("N", "O");
        g.link("O", "N");
        g.link("O", "H");
        
        // Exibe o grafo antes de remover a aresta
        String resultadoAntes = g.toString();

        // Remover a aresta entre "A" e "B"
        g.remover("A", "B");

        // Exibe o grafo após a remoção
        String resultadoDepois = g.toString();

        return "Antes da remoção:\n" + resultadoAntes + "\nApós remoção de A-B:\n" + resultadoDepois;
    }
}

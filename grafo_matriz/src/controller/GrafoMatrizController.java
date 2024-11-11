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
        g.link("B", "A");
        g.link("B", "C");
        g.link("A", "D");
        g.link("A", "F");
        g.link("C", "I");
        g.link("C", "J");
        g.link("J", "E");        
        g.link("J", "I");
        g.link("J", "N");
        g.link("D", "G");
        g.link("D", "H");
        g.link("E", "H");
        g.link("F", "H");
        g.link("F", "K");
        g.link("I", "D");
        g.link("N", "O");
        g.link("N", "M");
        g.link("G", "L");
        g.link("L", "K");
        g.link("L", "M");

        // Retorna o grafo como string para exibir sua estrutura
        return g.toString();
    }
}

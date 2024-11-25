package model.estrutura.grafo;

import java.util.*;

public class GrafoMatriz<T> {
    // Matriz de adjacência para armazenar conexões entre os nós
    private int[][] matriz;
    // Array de rótulos para identificar cada nó
    private String[] labels;

    // Construtor que inicializa a matriz de adjacência e os rótulos dos nós
    public GrafoMatriz(String[] labels) {
        this.labels = labels;
        this.matriz = new int[labels.length][labels.length];
    }

    // Método para adicionar uma aresta (conexão) entre dois nós especificados pelos rótulos
    public void link(String label1, String label2) {
        int indexLabel1 = Arrays.asList(this.labels).indexOf(label1);
        int indexLabel2 = Arrays.asList(this.labels).indexOf(label2);

        // Define a conexão como 1 na matriz de adjacência (grafo não-direcionado)
        this.matriz[indexLabel1][indexLabel2] = 1;
        this.matriz[indexLabel2][indexLabel1] = 1;
    }

    // Método para remover uma aresta entre dois nós especificados pelos rótulos
    public void unlink(String label1, String label2) {
        int indexLabel1 = Arrays.asList(this.labels).indexOf(label1);
        int indexLabel2 = Arrays.asList(this.labels).indexOf(label2);

        // Remove a conexão na matriz de adjacência, definindo-a como 0
        this.matriz[indexLabel1][indexLabel2] = 0;
        this.matriz[indexLabel2][indexLabel1] = 0;
    }
 // Método para remover uma aresta entre dois nós
    public void remover(String label1, String label2) {
        int indexLabel1 = Arrays.asList(this.labels).indexOf(label1);
        int indexLabel2 = Arrays.asList(this.labels).indexOf(label2);

        // Verifica se os nós existem
        if (indexLabel1 != -1 && indexLabel2 != -1) {
            // Remove a aresta definindo 0 na matriz
            this.matriz[indexLabel1][indexLabel2] = 0;
            this.matriz[indexLabel2][indexLabel1] = 0;
        } else {
            System.out.println("Nós não encontrados no grafo.");
        }
    }

    // Método que exibe o grafo como uma string, mostrando cada nó e suas conexões
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        // Percorre cada nó na matriz e exibe suas conexões
        for (int i = 0; i < this.labels.length; i++) {
            builder.append(this.labels[i] + ": ");
            for (int j = 0; j < this.labels.length; j++) {
                if (this.matriz[i][j] == 1) {
                    builder.append(this.labels[j] + " ");
                }
            }
            builder.append("\r\n");
        }
        return builder.toString();
    }
}

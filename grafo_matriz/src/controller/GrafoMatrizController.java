package controller;

import model.estrutura.grafo.GrafoMatriz;

public class GrafoMatrizController{
	public GrafoMatrizController(){
		super();
	}
	
	public String teste() throws Exception{
		String[] routers = new String[] {"A", "B", "C", "D" "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};
		GrafoMatriz g = new GrafoMatriz(routers);

		//String[] routers = new String[] {"A", "B", "C", "D"};
		//GrafoMatriz g = new GrafoMatriz(routers);
		
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
		

		return g.toString();
	}
}
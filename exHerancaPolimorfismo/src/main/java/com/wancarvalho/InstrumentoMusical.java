package com.wancarvalho;

//considerando apenas violão e guitarra
public class InstrumentoMusical {
    public static final int numDeCordas = 6;
    private String fabricante;

    private String tipo; //eletrico ou acustico

    public InstrumentoMusical(String fabricante, String tipo){
        this.fabricante = fabricante;
        this.tipo = tipo;
    }
}

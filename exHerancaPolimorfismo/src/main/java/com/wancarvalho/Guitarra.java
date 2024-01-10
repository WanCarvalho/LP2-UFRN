package com.wancarvalho;

public class Guitarra extends InstrumentoMusical {
    protected int tamanhoEscala;
    public Guitarra(String fabricante, String tipo, int tamanhoEscala){
        super(fabricante, tipo);
        this.tamanhoEscala = tamanhoEscala;
    }
}

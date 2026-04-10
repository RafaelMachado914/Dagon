
package br.com.dagon;


public class Cartas {
 
 public int numero;
 public int dano  ;

    public Cartas(int numero) {
        this.numero = numero;
        this.dano = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}

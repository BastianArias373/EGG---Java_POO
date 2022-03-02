package operacion;

public class Operacion {
    
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multi;
    private float div;

    public Operacion() {
    }
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Operacion(int numero1, int numero2, int suma, int resta, int multi, float div) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.suma = suma;
        this.resta = resta;
        this.multi = multi;
        this.div = div;
    }
    
    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getSuma() {
        return suma;
    }
    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }
    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMulti() {
        return multi;
    }
    public void setMulti(int multi) {
        this.multi = multi;
    }

    public float getDiv() {
        return div;
    }
    public void setDiv(float div) {
        this.div = div;
    }
    
    
    
    

}

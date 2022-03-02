package Formas;

public class Cuadrado {
    
    private float lado;
    private float area;
    private float perimetro;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
}

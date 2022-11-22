package Calculo;

public class MatematicaAvancada {

    private double resultado;

    /**
     * @param valor1
     * @param valor2
     */
    public void soma(double valor1, double valor2) {
        resultado=valor1*valor2;
    }

    public double getResultado(){
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado= resultado;
    }
}

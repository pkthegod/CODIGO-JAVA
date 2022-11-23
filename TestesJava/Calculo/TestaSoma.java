package Calculo;
public class TestaSoma {
public static void main(String[] args) {
    MatematicaAvancada ma=new MatematicaAvancada();
    ma.soma(900, 750);
    double valorSeguro=ma.getResultado();
    System.out.println("Valor do seguro: "+valorSeguro);

    if (ma.par(valorSeguro)){
        System.out.println("---------------> Este numero é par");
    } else {
        System.out.println("---------------> Este numero é ímpar");
    }

    double fatorDesconto=ma.descontoSeguro(5);
    double seguroDesconto=valorSeguro*fatorDesconto;
    double seguroFinal=valorSeguro-seguroDesconto;

    System.out.println("Fator de desconto.......: "+fatorDesconto);
    System.out.println("Valor do desconto.......:"+seguroDesconto);
    System.out.println("Seguro com desconto.....:"+seguroFinal);
}

    

}

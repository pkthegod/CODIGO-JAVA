package Calculo;


class QuartoPrograma {
    public static void main (String[] args) {

        Calculo.Apoio.Matematica m=new Calculo.Apoio.Matematica();
        m.soma(5, 30);
        System.out.println("Resultado: "+m.getResultado());

        m.multiplica(5, 30);
        System.out.println("Resultado: "+m.getResultado());
    }
}

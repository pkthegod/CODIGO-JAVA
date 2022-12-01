public class TestaLoop {  
    public static void main(String[] args) {
        System.out.println("Teste de while");
        int n=0;

        while (n<5){
            System.out.println(n);

            if(n==3)
                break;

            n++;
        }

        System.out.println("-");

        System.out.println("Teste de do/while");
        int i=0;
        do {
            System.out.println(i);

            if(n==3)
                break;
            
            i++;
        } while(i<5);

        System.out.println("Testando o laço for: ");
        for(int z=0; z<5; z++){
            System.out.println(z);
            if(n==3)
                break;
        }

        int distancia = 500;
        double tanqueGasolina = 50;
        double quilometrosPorLitro = 8.4;
        double consumoPorQuilometro = 1/quilometrosPorLitro;

        for (int decorrido=1; decorrido<distancia; decorrido++){
            tanqueGasolina-=consumoPorQuilometro;
            System.out.println("KM rodados: "+decorrido);
            if(tanqueGasolina<=0){
                System.out.println("Acabou a gasosa...");
                break;
            }
        }

    }
}

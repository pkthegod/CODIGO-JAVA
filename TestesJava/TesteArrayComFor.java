public class TesteArrayComFor {
    /**
     * @param args
     */
    public static void main(String[] args) {
    
        String [] a;
        String b [];

        a=new String[5];
        b=new String[5];

        a[0] = "Joao";
        a[1] = "Maria";
        a[2] = "Marcos";
        a[3] = "Clara";
        a[4] = "Rogério";

        b[0] = "Silva";
        b[1] = "Fernandes";
        b[2] = "Pereira";
        b[3] = "Lins";
        b[4] = "Gomes";

        for (int n=0;n<a.length; n++){
            System.out.println(a[n]);
        }

        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }

        for (int z=0;z<a.length; z++){
            System.out.println(a[z]+" "+b[z]);
        }
    }
}
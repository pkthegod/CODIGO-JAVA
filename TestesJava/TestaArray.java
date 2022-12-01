public class TestaArray {
    public static void main(String[] args) {
        String[] a;
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

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println("-");

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println("-");

        System.out.println(a[0]+" "+b[0]);
        System.out.println(a[1]+" "+b[1]);
        System.out.println(a[2]+" "+b[2]);
        System.out.println(a[3]+" "+b[3]);
        System.out.println(a[4]+" "+b[4]);
        System.out.println("-");
    }
}

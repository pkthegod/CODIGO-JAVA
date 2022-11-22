import javax.swing.*;


class Imc {
    public static void main(String[] args) {
        
        double alturaPessoa;
        double pesoPessoa;
        double imc;

        alturaPessoa=Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros (com ponto): "));
        pesoPessoa=Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em quilos (com ponto): "));
        imc=pesoPessoa/(alturaPessoa*alturaPessoa);

        JOptionPane.showMessageDialog(null,"Esse é o seu IMC atual: "+imc);
    }    
}

package JogosNumericos;
import javax.swing.JOptionPane;
import JogosNumericos.ClassesBase.Dado;
import JogosNumericos.ClassesBase.Roleta;
public class TestaJogo {
    public static void main(String[] args) {
        Dado dd = new JogosNumericos.ClassesBase.Dado();
        dd.setAposta(Integer.parseInt(JOptionPane.showInputDialog("Entre com a aposta de 1 a 6: ")));
        dd.executaJogo();
        dd.mostraResultado();

        JOptionPane.showMessageDialog(null, "ainda tem mais!");

        Roleta r1 = new Roleta();
        r1.setAposta(Integer.parseInt(JOptionPane.showInputDialog("Entre com a aposta de 1 a 36: ")));
        r1.executaJogo();
        r1.mostraResultado();
    }
}

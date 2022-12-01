package JogosNumericos.ClassesBase;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jogo {
    private int aposta;
    private int resultado;

    public void executaJogo(){
        Random rnd = new Random();
        this.resultado = rnd.nextInt(6)+1;
    }

    public void executaJogo(int aposta){
        this.aposta=aposta;
        this.executaJogo();
    }

    public void mostraResultado(){
        JOptionPane.showMessageDialog(null,"Sua aposta: "+aposta+" Resultado: "+resultado);
    
        if (this.resultado == this.aposta)
        JOptionPane.showMessageDialog(null,"Boa, acertou mizeravi!");
        
        else JOptionPane.showMessageDialog(null,"ERRRRRRRRRRROOOOOU!");
    }

    public void setAposta(int aposta) {
        if(aposta>6 || aposta <1)
            JOptionPane.showMessageDialog(null,"APOSTA INVÁLIDA!");
        this.aposta = aposta;
    }

    public void setResultado(int resultado) {
       this.resultado = resultado;
    }
}

//salvar como programa java start 01
import javax.swing.*;
class ProgramaJavaStart02
{
 public static void main (String args[])
 {
  // declaracao das variasveis
  float peso;
  float altura;
  float imc;
  float a;
  //saida de dados
  peso = Float.parseFloat(JOptionPane.showInputDialog ("Digite seu peso "));
  altura = Float.parseFloat(JOptionPane.showInputDialog ("Digite sua altura "));
  a = (altura*altura);
  imc = (peso/a);
  System.out.println("Seu imc e de "+ imc);
 }  
}

package java39;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2:"));
        int n = 0;
        try {
            n = n1 / n2;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Tentando fazer uma divisão por 0: " + e);
        }
        // se for uma divisão por zero vai dar erro.
        System.out.println("O resultado é: " + n);
    }
  }

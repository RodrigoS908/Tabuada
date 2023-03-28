package tsbuada;
import javax.swing.JOptionPane;
public class Tsbuada {
    public static void main(String[] args) {
        int conta = 0,x= Integer.parseInt(JOptionPane.showInputDialog("insitra um numero"));
        while(conta<=10){
            JOptionPane.showMessageDialog(null, conta*x);
            conta++;
        }
    }
}

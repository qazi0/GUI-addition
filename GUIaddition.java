
package guiaddition;
import javax.swing.JOptionPane;
public class GUIaddition
{

    public static void main(String[] args) 
    {
        String num1=JOptionPane.showInputDialog("Enter first number:");
        String num2=JOptionPane.showInputDialog("Enter second number:");
        int number1=Integer.parseInt(num1);
        int number2=Integer.parseInt(num2);
        int sum=number1+number2;
        JOptionPane.showMessageDialog(null,"Sum is "+sum,"Sum of Two Integers",JOptionPane.PLAIN_MESSAGE);
    }
    
}

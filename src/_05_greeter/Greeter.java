package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String Input = JOptionPane.showInputDialog("Hi there, what is your name");
JOptionPane.showMessageDialog(null,"Hello" +Input);


}
}

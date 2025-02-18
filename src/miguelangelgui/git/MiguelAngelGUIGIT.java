/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/MiguelAngelGUIGIT.java to edit this template
 */
package miguelangelgui.git;

/**
 *
 * @author Miguel
 */
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiguelAngelGUIGIT
extends JFrame {
public MiguelAngelGUIGIT() {
JLabel lblSaludo = new JLabel("Hola Mundo.");
add(lblSaludo);
lblSaludo.setBounds(2,28,116,24);
this.setSize(400, 300);
this.setTitle("JFrame");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
public static void main(String[] args) {
MiguelAngelGUIGIT main = new MiguelAngelGUIGIT();
}
}

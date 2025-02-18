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
JLabel lblSaludo2 = new JLabel("¿Qué tal estás?.");
JLabel lblSaludo3 = new JLabel("¿Hola?.");
add(lblSaludo);
lblSaludo.setBounds(2,28,116,24);
add(lblSaludo2);
lblSaludo2.setBounds(2,50,116,24);
add(lblSaludo3);
lblSaludo3.setBounds(2,75,116,24);
this.setSize(400, 300);
this.setTitle("JFrame");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
public static void main(String[] args) {
MiguelAngelGUIGIT main = new MiguelAngelGUIGIT();
}
}

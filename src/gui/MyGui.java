/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author pupil
 */
public class MyGui extends JFrame{
    private JLabel jLabelTitle;
    private JTextField jTextFieldSetText;
    public MyGui() {
        initComponent();
    }

    private void initComponent() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(400, 250));
        setMinimumSize(new Dimension(400, 250));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setLocationRelativeTo(null);
        jLabelTitle = new JLabel("Hello, JKTV20!");
//        JPanel jPanelLabelTitle = new JPanel();
//        jPanelLabelTitle.setMinimumSize(this.getPreferredSize());
        jLabelTitle.setHorizontalAlignment(JLabel.CENTER);
        jLabelTitle.setVerticalAlignment(JLabel.CENTER);
        jTextFieldSetText = new JTextField();
        jTextFieldSetText.setText("");
        jTextFieldSetText.setHorizontalAlignment(jTextFieldSetText.CENTER);
        jTextFieldSetText.setMaximumSize(new Dimension(300, 27));
        this.getContentPane().add(jLabelTitle);
        this.getContentPane().add(jTextFieldSetText);
        pack();
    }
    
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyGui().setVisible(true);
            }
        });
    }
    
    
    
}

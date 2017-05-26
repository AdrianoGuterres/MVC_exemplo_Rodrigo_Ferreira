package br.com.gqferreira.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSlider;

/**
 *
 * @author Gustavo Ferreira
 */
public class DialogGerarNumero extends JDialog{

    private JLabel lbNumeroMaximo;
    private JButton btGerar;
    private JButton btGerarOrdenar;
    private JSlider slNumeroMaximo;

    //Get and Set
    public JButton getBtGerar() {
        return btGerar;
    }
    public JButton getBtGerarOrdenar() {
        return btGerarOrdenar;
    }    
    public JSlider getSlNumeroMaximo() {
        return slNumeroMaximo;
    }
    
    public DialogGerarNumero() {
        this.setSize(300, 205);
        this.setLocationRelativeTo(null);
        this.setTitle("Gerar numero randomico");
        this.setModal(true);
        getContentPane().setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        this.lbNumeroMaximo = new JLabel("Numero maximo da sequencia");
        
        this.slNumeroMaximo = new JSlider(1, 99999);
        this.slNumeroMaximo.setMajorTickSpacing(9999);
        this.slNumeroMaximo.setPaintTicks(true);
        
        this.btGerar = new JButton("Gerar numero");
        this.btGerarOrdenar = new JButton("Gerar e ordenar");
                
        this.lbNumeroMaximo.setBounds(20, 20, 200, 20);
        this.slNumeroMaximo.setBounds(20, 51, 245, 30);
        this.btGerar.setBounds(70, 90, 150, 25);
        this.btGerarOrdenar.setBounds(70, 125, 150, 25);
        
        getContentPane().add(lbNumeroMaximo);
        getContentPane().add(slNumeroMaximo);
        getContentPane().add(btGerar);
        getContentPane().add(btGerarOrdenar);
    }
}

package rodoviariaprogresso;

import janelas.JanelaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author Lucas Tomasi
 */
public class RodoviariaProgresso {

    public static void main(String[] args) {
        janelas.JanelaPrincipal janelaPrincipal = new JanelaPrincipal();        
        janelaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setVisible(true);
             
    }

}

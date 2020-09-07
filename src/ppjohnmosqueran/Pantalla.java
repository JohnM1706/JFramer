
package ppjohnmosqueran;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jhon Fredy Mosquera Acosta
 */
public class Pantalla extends javax.swing.JFrame {
    JPanel pantalla1;                                        //crear panel 
    JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4;          //genera etiqueta
    JButton boton1,boton2,boton3,boton4;                    //genrar un boton 
    JTextField texto1,texto2,texto3;  
 
    public Pantalla() {
        initComponents();
        pantalla1 = new JPanel();
        pantalla1.setLayout(null);                 //para inciar mi pantalla en 0
        pantalla1.setBounds(0, 0, 500, 500);       //para dar ubicacion y ancho
        
        etiqueta1 = new JLabel("Norte");
        etiqueta1.setBounds(170,30, 80, 30);     
        
        etiqueta2 = new JLabel("Ocidente");
        etiqueta2.setBounds(20,139, 80, 30);      
        
        etiqueta3 = new JLabel("Sur");
        etiqueta3.setBounds(170,250, 80, 30);      
        
        etiqueta4 = new JLabel("Oriente");
        etiqueta4.setBounds(325,139,80, 30);      
     //-----------------------------------------
        texto1 = new JTextField();
        texto1.setBounds(140,75,90, 35); 
        
        texto2 = new JTextField();
        texto2.setBounds(140,132,90, 35); 
        
        texto3 = new JTextField();
        texto3.setBounds(140,185,90, 35);
     //-------------------------------------------
        boton1 = new JButton("1");
        boton1.setBounds(20,30,50,35);      //para dar ubicacion y ancho
        
        boton2 = new JButton("2");
        boton2.setBounds(20,250,50,35);
        
        boton3 = new JButton("3");
        boton3.setBounds(320,30,50,35);
        
        boton4 = new JButton("4");
        boton4.setBounds(320,250,50,35);
       //-----------------------------------------
        pantalla1.add(texto1);
        pantalla1.setVisible(true);        
        pantalla1.add(texto2);
        pantalla1.setVisible(true);        
        pantalla1.add(texto3);
        pantalla1.setVisible(true);
      //-------------------------------------
        pantalla1.add(boton1);
        pantalla1.setVisible(true);
        pantalla1.add(boton2);
        pantalla1.setVisible(true);
        pantalla1.add(boton3);
        pantalla1.setVisible(true);
        pantalla1.add(boton4);
        pantalla1.setVisible(true);
      //------------------------------------
        pantalla1.add(etiqueta1);
        pantalla1.setVisible(true);
        pantalla1.add(etiqueta2);
        pantalla1.setVisible(true);
        pantalla1.add(etiqueta3);
        pantalla1.setVisible(true);
        pantalla1.add(etiqueta4);
        pantalla1.setVisible(true);
        
        //---------------------------------
        
        pantalla1.setVisible(true);   
        
       jPanel1.add(pantalla1);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

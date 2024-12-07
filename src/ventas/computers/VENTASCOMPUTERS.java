
package ventas.computers;

import ventas.computers.igu.LOGIN;


public class VENTASCOMPUTERS {

   
    public static void main(String[] args) {
     
        /* El metodo mas importante hace que se vea bonito y no
        como un programa de 1997....
         Configura la importación de estilos   */
        
            
        ImportEstilos();

        // Crear y mostrar el formulario Login
        java.awt.EventQueue.invokeLater(() -> {
          
        LOGIN loginFrame = new LOGIN();
        loginFrame.setLocationRelativeTo(null); // Centra el JFrame en la pantalla 
        loginFrame.setVisible(true);
            
       
        });
        
        
       
        
    }
     // Simplemente Hermoso
         
    private static void ImportEstilos() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

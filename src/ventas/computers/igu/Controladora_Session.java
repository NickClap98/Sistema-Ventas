package ventas.computers.igu;

public class Controladora_Session {

    String UsuarioAnterior;
    String PasswordAnterior;

    LOGIN MV = new LOGIN();

    public Controladora_Session() {

        /* SE PIDE Y OBTIENE EL USER Y PASS QUE SE PUSO EN EL LOGIN Y LA PASA 
        A UNA VARIABLE PARA COMPARARLA */
        UsuarioAnterior = MV.getUser();
        PasswordAnterior = MV.getPass();

        //SI ES ADMIN QUE ABRA PANEL_HOME SINO EMPLEADO 
        //LAS MINISCULAS SERAN IGNORADAS
        if ("NICK".equals(UsuarioAnterior.toUpperCase()) && "Nick".equals(PasswordAnterior)) {
            PANEL_HOME HOME = new PANEL_HOME();
            HOME.setVisible(true);
            HOME.setLocationRelativeTo(null);
            MV.dispose();

        } else if ("EMPLEADO".equals(UsuarioAnterior.toUpperCase()) && "1234".equals(PasswordAnterior)) {

            PANEL_EMPLEADO USER = new PANEL_EMPLEADO();
            USER.setVisible(true);
            USER.setLocationRelativeTo(null);
            MV.dispose();
        } else {
            System.exit(1);

        }

    }

}

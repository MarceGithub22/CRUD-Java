package ejemplo;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo {

    public static void main(String[] args) {

        //Captura si existe un error
        try {
            //Esto es para enviar el LookAndFeel al JFrame
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            
            //Llamamos a nuestro JFrame
            VistaUsuario vista = new VistaUsuario();
            //Lo hacemos visible
            vista.show();
            
        } catch (UnsupportedLookAndFeelException e) {
            //Muestra una ventana emergente
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado. Favor de comunicarse con el "
                    + "Administrador.", "SYSTEM ERROR", JOptionPane.ERROR_MESSAGE);
            //Muestra el error por consola
            System.err.println("ERROR: " + e.getMessage());
        }

    }

}

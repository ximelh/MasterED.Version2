import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame ventana = new JFrame();

        ventana.setSize(1300,750);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);

        panel.setLayout(null);

        JLabel etiquetausuario = new JLabel("Nombre de usuario");
        etiquetausuario.setBounds(250,250,120,20);
        panel.add(etiquetausuario);

        JLabel etiquetacontrasenia = new JLabel("Contrasenia");
        etiquetacontrasenia.setBounds(270,275,120,20);
        panel.add(etiquetacontrasenia);

        JTextField usuariotexto = new JTextField();
        usuariotexto.setBounds(400,250,120,20);
        panel.add(usuariotexto);

        JPasswordField contrasenia = new JPasswordField();
        contrasenia.setBounds(400,275,120,20);
        panel.add(contrasenia);

        JButton iniciarsesion = new JButton("Iniciar Sesion");
        iniciarsesion.setBounds(250,350,120,20);
        panel.add(iniciarsesion);

        JButton registrar = new JButton("Registrarse");
        registrar.setBounds(400,350,120,20);
        panel.add(registrar);

        ventana.setVisible(true);

    }
}
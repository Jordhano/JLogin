import java.awt.Component;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JLogin{
	private JDialog presentacion;
	private JTextField txfUsuario;
	private JPasswordField txfContrasena;
	private JButton btnLogin;
	private JButton btnRecordar;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JLabel lblImage;
	private JLabel lblTituloPrincipal;
	private JLoginServe implementacion;
	private String URL;
	
	public JLogin(){
		
	}
	public void iniciar(){
		{
			lblTituloPrincipal = new JLabel();
			lblTituloPrincipal.setBounds(183, 9, 214, 33);
			presentacion.add(lblTituloPrincipal);
			lblTituloPrincipal.setFont(new java.awt.Font("Arial Black",0,16));
		}
		{
			lblUsuario = new JLabel("Usuario");
			lblUsuario.setBounds(230, 48, 181, 33);
			presentacion.add(lblUsuario);
		}
		{
			txfUsuario = new JTextField();
			txfUsuario.setBounds(317, 48, 181, 33);
			presentacion.add(txfUsuario);
		}
		{
			lblContrasena = new JLabel("Contraseña");
			lblContrasena.setBounds(230, 92, 181, 33);
			presentacion.add(lblContrasena);
		}
		{
			txfContrasena = new JPasswordField();
			txfContrasena.setBounds(317, 92, 181, 33);
			presentacion.add(txfContrasena);
		}
		{
			btnLogin = new JButton("Login");			
			btnLogin.setBounds(219, 147, 157, 62);
			btnLogin.setFocusable(false);
			presentacion.add(btnLogin);
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					if (implementacion.verify(txfUsuario.getText(),txfContrasena.getText(),URL) == true){
						JOptionPane.showMessageDialog(null, "Entrar");
					}else{
						JOptionPane.showMessageDialog(null, "Error De Intento A Conexion");
					}
				}
			});
		}
		{
			btnRecordar = new JButton("Recordar Pass");			
			btnRecordar.setBounds(376, 147, 157, 62);
			btnRecordar.setFocusable(false);
			presentacion.add(btnRecordar);
		}
		{
			lblImage = new JLabel();
			lblImage.setBounds(30, 23, 153, 168);
			lblImage.setIcon(new ImageIcon("login.png"));
			presentacion.add(lblImage);
		}
	}
	
	public void configurarLogo(String dirrecionImage) {
		this.lblImage.setIcon(new ImageIcon(dirrecionImage));
	}
	public void configurarTituloPrincipal(String lblTitulo) {
		this.lblTituloPrincipal.setText(lblTitulo) ;
	}
	public void configurarTituloVentana(JLabel lblTitulo) {
		presentacion.setTitle(lblTitulo.getText());
	}

	public void mostrarVentana(Dialog show,JLoginServe implementacion, String URL){
		presentacion = new JDialog(show);
		this.implementacion = implementacion;
		this.URL = URL;
		presentacion.setLayout(null);
		presentacion.setSize(551, 242);
		presentacion.setDefaultCloseOperation(presentacion.DISPOSE_ON_CLOSE);
		presentacion.setResizable(false);
		presentacion.setLocationRelativeTo(null);
		iniciar();
		presentacion.setVisible(true);
	}
	
}

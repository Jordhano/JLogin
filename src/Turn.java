
public class Turn implements JLoginServe {
	
	public static void main(String ar[]){
		JLogin a = new JLogin();
		a.mostrarVentana(null, new Turn(),"");
	}
	@Override
	public boolean verify(String usuario, String Contrasena, String url) {
		return true;
	}
}

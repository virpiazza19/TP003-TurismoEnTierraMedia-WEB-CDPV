package modelo;

public class UsuarioNulo extends Usuario {

	public static Usuario build() {
		return new UsuarioNulo();
	}

	public UsuarioNulo() {
		super(0, "", 0, 0.0, "", "", false);
	}

	@Override
	public boolean isNull() {
		return true;
	}

}

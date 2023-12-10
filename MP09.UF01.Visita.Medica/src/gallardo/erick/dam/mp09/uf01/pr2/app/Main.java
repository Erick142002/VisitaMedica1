package gallardo.erick.dam.mp09.uf01.pr2.app;

import gallardo.erick.dam.mp09.uf01.pr2.controller.UsuariController;

public class Main {
	
	public static void main(String[] args) {
		UsuariController usuariController = new UsuariController();
		usuariController.aplicaSeguretatMD5();
		usuariController.aplicaSeguretatSHA256();
		usuariController.aplicaSeguretatAES();

	}

}

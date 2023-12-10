package gallardo.erick.dam.mp09.uf01.pr2.seguretat.view.console;

import java.util.Scanner;   

import gallardo.erick.dam.mp09.uf01.pr2.seguretat.model.domain.Usuari;

 

public class UsuariView {
	
	
	public Usuari getUsuari() {
		Usuari usuari = new Usuari();
		Scanner scanner = new Scanner(System.in);
		showMissatge("Introdueixi el mail: ", false);
		usuari.setMail(scanner.next());
		showMissatge("Introdueixi el password: ", false);
		usuari.setPassword(scanner.next());

		return usuari;
	}

	public void showUsuari(Usuari usuari) {
		System.out.println(usuari.toString());
	}

	public void showMissatge(String missatge, boolean esError) {
		if (esError) {
			System.err.println(missatge);
		} else {
			System.out.println(missatge);
		}
	}

}

package gallardo.erick.dam.mp09.uf01.pr2.controller;

import gallardo.erick.dam.mp09.uf01.pr2.seguretat.model.domain.Usuari; 
import gallardo.erick.dam.mp09.uf01.pr2.seguretat.model.security.AESSecurity;
import gallardo.erick.dam.mp09.uf01.pr2.seguretat.model.security.MD5Security;
import gallardo.erick.dam.mp09.uf01.pr2.seguretat.model.security.SHA256Security;
import gallardo.erick.dam.mp09.uf01.pr2.seguretat.view.console.UsuariView;

public class UsuariController {
	
	UsuariView usuariView = new UsuariView();

	public void aplicaSeguretatMD5() {

		try {
			usuariView.showMissatge("MD5 ------------", false);
			Usuari usuari = usuariView.getUsuari();
			MD5Security Security = new MD5Security();
			String mailEnc = Security.encripta(usuari.getMail());
			String passwordEnc = Security.encripta(usuari.getPassword());

			Usuari usuariEnc = new Usuari();
			usuariEnc.setMail(mailEnc);
			usuariEnc.setPassword(passwordEnc);

			usuariView.showUsuari(usuariEnc);
		} catch (Exception ex) {
			usuariView.showMissatge(ex.getMessage(), true);
		}

	}

	public void aplicaSeguretatSHA256() {
		try {
			usuariView.showMissatge("SHA256 ------------", false);
			Usuari usuari = usuariView.getUsuari();
			SHA256Security Security = new SHA256Security();
			String mailEnc = Security.encripta(usuari.getMail());
			String passwordEnc = Security.encripta(usuari.getPassword());

			Usuari usuariEnc = new Usuari();
			usuariEnc.setMail(mailEnc);
			usuariEnc.setPassword(passwordEnc);

			usuariView.showUsuari(usuariEnc);
		} catch (Exception ex) {
			usuariView.showMissatge(ex.getMessage(), true);
		}
	}

	public void aplicaSeguretatAES() {
		try {
			usuariView.showMissatge("AES ------------ Encripta", false);
			Usuari usuari = usuariView.getUsuari();
			AESSecurity Security = new AESSecurity();
			String mailEnc = Security.encripta(usuari.getMail());
			String passwordEnc = Security.encripta(usuari.getPassword());

			Usuari usuariEnc = new Usuari();
			usuariEnc.setMail(mailEnc);
			usuariEnc.setPassword(passwordEnc);

			usuariView.showUsuari(usuariEnc);

			usuariView.showMissatge("AES ------------ Desencripta", false);

			String mailDesenc = Security.desencripta(usuariEnc.getMail());
			String passwordDesenc = Security.desencripta(usuariEnc.getPassword());

			Usuari usuariDesenc = new Usuari();
			usuariDesenc.setMail(mailDesenc);
			usuariDesenc.setPassword(passwordDesenc);
			usuariView.showUsuari(usuariDesenc);
		} catch (Exception ex) {
			usuariView.showMissatge(ex.getMessage(), true);
		}

	}

}

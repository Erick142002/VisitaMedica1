package gallardo.erick.dam.mp09.uf01.pr2.seguretat.model.domain;

import java.time.LocalDate;

public class Usuari {

    private int idVisita;
    private String nomPacient;
    private String nomMetge;
    private LocalDate data;
    private String diagnosi;

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getNomPacient() {
        return nomPacient;
    }

    public void setNomPacient(String nomPacient) {
        this.nomPacient = nomPacient;
    }

    public String getNomMetge() {
        return nomMetge;
    }

    public void setNomMetge(String nomMetge) {
        this.nomMetge = nomMetge;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    @Override
    public String toString() {
        return "VisitaMedica [idVisita=" + idVisita + ", nomPacient=" + nomPacient + ", nomMetge=" + nomMetge +
                ", data=" + data + ", diagnosi=" + diagnosi + "]";
    }

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMail(String mailEnc) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String passwordEnc) {
		// TODO Auto-generated method stub
		
	}
}


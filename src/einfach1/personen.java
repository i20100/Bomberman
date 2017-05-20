package einfach1;

import java.sql.Date;

public class personen {
	
	int id;
	boolean IstNochDabei;
	String Name;
	String Vorname;
	String Adress;
	String ort_id;
	String Telefon;
	String email;
	Date Geburi;

	
	public boolean isIstNochDabei() {
		return IstNochDabei;
	}

	public void setIstNochDabei(boolean istNochDabei) {
		IstNochDabei = istNochDabei;
	}

	public Date getGeburi() {
		return Geburi;
	}

	public void setGeburi(Date geburi) {
		Geburi = geburi;
	}

	public personen() {
		// TODO Auto-generated constructor stub
	}
			
			//Creating a variable for the connection called "con"
			public personen(int int1, boolean boolean2, String string3, String string4, String string5, int int6,
			String string7, String string8, Date date9) {
		// TODO Auto-generated constructor stub
			}




			public int getId() {
				return id;
			}




			public void setId(int id) {
				this.id = id;
			}




			public String getName() {
				return Name;
			}




			public void setName(String name) {
				Name = name;
			}




			public String getVorname() {
				return Vorname;
			}




			public void setVorname(String vorname) {
				Vorname = vorname;
			}




			public String getAdress() {
				return Adress;
			}




			public void setAdress(String adress) {
				this.Adress = adress;
			}




			public String getOrt_id() {
				return ort_id;
			}




			public void setOrt_id(String ort_id) {
				this.ort_id = ort_id;
			}




			public String getTelefon() {
				return Telefon;
			}




			public void setTelefon(String telefon) {
				Telefon = telefon;
			}




			public String getEmail() {
				return email;
			}




			public void setEmail(String email) {
				this.email = email;
			}




			@Override
			public String toString() {
				return "personen [id=" + id + ", Name=" + Name + ", Vorname=" + Vorname + ", Adress=" + Adress
						+ ", ort_id=" + ort_id + ", Telefon=" + Telefon + ", email=" + email + "]";
			}

			public void setBoolean(boolean boolean1) {
				// TODO Auto-generated method stub
				System.out.println(1);
				
			}
		
	
	
}

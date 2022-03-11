package rikudo;

/**
*@author DeaSalmaIsnaini
*@version 1.0
*@since 2022-03-11
*/

public class Itachi extends Rikudo {
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}
	
	void printDojutsu() {
		System.out.println(this.Dojutsu);
		setDojutsu();
		System.out.println(this.Dojutsu);
	}
	
	private void setDojutsu() { /* method private hanya dapat terlihat dan dapat diakses pada class tempat method tersebut dideklarasikan. */
		this.Dojutsu = "Mangekyou Sharingan"; 
	}

}

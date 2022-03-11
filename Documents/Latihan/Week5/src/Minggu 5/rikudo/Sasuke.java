package rikudo;

/**
*@author DeaSalmaIsnaini
*@version 1.0
*@since 2022-03-11
*/

public class Sasuke extends Itachi{
	String Dojutsu = "Sharingan";
	
	@Override
	void printDojutsu() {
		super.printDojutsu();
		System.out.println(this.Dojutsu);
	}
}

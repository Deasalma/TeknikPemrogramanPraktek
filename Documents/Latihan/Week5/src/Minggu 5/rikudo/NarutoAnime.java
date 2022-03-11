package rikudo;

/**
*@author DeaSalmaIsnaini
*@version 1.0
*@since 2022-03-11
*/

public class NarutoAnime {
	public static void main(String[] Args) {
		Sasuke s = new Sasuke();
		s.printDojutsu();
		Itachi i = new Sasuke();// objek subkelas ke variabel superkelas.
		i.printKekkeiGenkai();
	}
}

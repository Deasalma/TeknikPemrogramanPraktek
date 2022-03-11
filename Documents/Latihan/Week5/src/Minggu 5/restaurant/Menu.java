package restaurant;

/**
*@author DeaSalmaIsnaini
*@version 1.0
*@since 2022-03-11
*/

public class Menu {
	
	/*state*/
	private String nama_makanan = " ";
	private double harga_makanan = 0;
	private int stok = 0 ;
	
	/* Getter */
	public String getNama_makanan() {
		return nama_makanan;
	}
	public int getStok() {
		return stok;
	}
	
	/* Constructor dengan parameter */
	public Menu (String nama, double harga, int stok) {
		this.nama_makanan = nama;
		this.harga_makanan = harga;
		this.stok = stok;
	}
	
	public void tampilMenu() {
		System.out.println(nama_makanan + "[" + stok +" ]"+"\tRp. "+harga_makanan );
	}
	
	public void kurangStok(int  banyak) {
		stok -= banyak;
	}
	
}

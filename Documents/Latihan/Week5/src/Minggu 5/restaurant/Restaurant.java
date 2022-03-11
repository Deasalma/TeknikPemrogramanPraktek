package restaurant;

/**
*@author DeaSalmaIsnaini
*@version 1.0
*@since 2022-03-11
*/

public class Restaurant {
	/*public String[] nama_makanan;
	public double[] harga_makanan;
	public int[] stok;*/
	
	/* Perubahan */
	/*state*/
	private Menu[] menuMakanan = {};
	private static byte id = 0; //Variabel static dibuat ketika suatu program dijalankan dan akan dihapus ketika suatu program berhenti
	

	/* Constructor */
	public Restaurant() {
		menuMakanan = new Menu[10];
	}
	
	/*Methods*/
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menuMakanan[id] = new Menu(nama, harga, stok);
	}
	public void tampilMenuMakanan() {
		
				System.out.println("Menu");
				for(int i = 0; i <= id; i++) {
					if(!isOutOfStock(i)) {
						this.menuMakanan[i].tampilMenu();
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(menuMakanan[id].getStok()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void nextId() { //Metode statis adalah metode yang tidak beroperasi pada objek
		id++;
	}
	
	public void Pemesanan(String namaMakanan, int banyak) {
		for(int i = 0; i <= id; i++) {
			if(namaMakanan.equals(menuMakanan[i].getNama_makanan())) {
				if(menuMakanan[i].getStok()>= banyak) {						
					System.out.println(menuMakanan[i].getNama_makanan() + " Sebanyak " + banyak + " buah, Terjual !!! ");
					menuMakanan[i].kurangStok(banyak);
				}
				else {
					System.out.print("Stok " + menuMakanan[i].getNama_makanan());
					if(menuMakanan[i].getStok() == 0) {
						System.out.println(" Habis");
					}
					else {
						System.out.println(" Tersisa "+menuMakanan[i].getStok()+" Lagi ");
					}
				}
			}
		}
	}
}

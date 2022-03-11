package restaurant;
/**
*@author DeaSalmaIsnaini
*@version 1.0
*@since 2022-03-11
*/
import java.util.*;

public class MainRestaurant {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		Scanner keyboard = new Scanner(System.in);
		String makanan;
		int jmlPesanan;
		
		System.out.println("------------- Menu ---------------------");
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		
		System.out.println("\nSilahkan Masukkan Pesanan Anda : ");
		makanan = keyboard.nextLine();
		jmlPesanan = keyboard.nextInt();
		menu.Pemesanan(makanan, jmlPesanan);
		keyboard.close();
		
		System.out.println("\nStok Menu Saat ini");
		menu.tampilMenuMakanan();
		
	}

}

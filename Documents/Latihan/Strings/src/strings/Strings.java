package strings;
/*
 * Elemen-elemen dari sebuah String disebut karakter. Banyaknya karakter dalam sebuah String disebut
 * panjangnya, dan dapat diambil dengan metode String.length().
 * Diberikan dua string huruf kecil bahasa Inggris, A dan B, lakukan operasi berikut:
 * 1. Jumlahkan panjang A dan B.
 * 2. Tentukan apakah A secara leksikografis lebih besar dari B (yaitu: apakah B muncul sebelum A dalam kamus?)
 * 3. Kapitalisasi huruf pertama dalam A dan B dan cetak dalam satu baris, dipisahkan oleh a ruang angkasa. 
 * Format Input
 * Baris pertama berisi string A. Baris kedua berisi string lain B. String adalah
 * hanya terdiri dari huruf kecil bahasa Inggris.
 * Format output
 * Ada tiga baris output:
 * Untuk baris pertama, jumlahkan panjang A dan B.
 * Untuk baris kedua, tulis Ya jika A secara leksikografis lebih besar dari B jika tidak, cetak Tidak sebagai gantinya.
 * Untuk baris ketiga, huruf besar huruf pertama di A dan dan B cetak dalam satu baris, dipisahkan oleh spasi.
 */
import java.io.*;
import java.util.*;
public class Strings {
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		System.out.println(A.length()+B.length());
		int i = A.compareTo(B);
		if(i > 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		String atemp = A.substring(0, 1).toUpperCase()+A.substring(1);
		String btemp = B.substring(0, 1).toUpperCase()+B.substring(1);
		System.out.println(atemp+" "+btemp);
		scan.close();
	}
}

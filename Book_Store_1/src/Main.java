import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Menu");
			System.out.println("1. List Buku");
			System.out.println("2. Keluar");
			System.out.print("Pilih menu yang akan dipilih : ");

			int pilihan = input.nextInt();

			if (pilihan == 1) {
				System.out.println("");
				tampilkan();
				System.out.println("");

				do {
					System.out.print("Pilih buku mana yang akan dibeli : ");

					int pilihan_buku = input.nextInt();

					if (pilihan_buku == list_buku.jav.nomor) {
						System.out.println(list_buku.jav.nomor + "Buku yang dibeli adalah buku " + list_buku.jav.buku + " seharga Rp." + list_buku.jav.harga);
					} else if (pilihan_buku == list_buku.kot.nomor) {
						System.out.println(list_buku.jav.nomor + "Buku yang dibeli adalah buku " + list_buku.kot.buku + " seharga Rp." + list_buku.kot.harga);
					} else if (pilihan_buku == list_buku.spr.nomor) {
						System.out.println(list_buku.jav.nomor + "Buku yang dibeli adalah buku " + list_buku.spr.buku + " seharga Rp." + list_buku.spr.harga);
					} else if (pilihan_buku == list_buku.ang.nomor) {
						System.out.println(list_buku.jav.nomor + "Buku yang dibeli adalah buku  " + list_buku.ang.buku + " seharga Rp." + list_buku.ang.harga);
					}

					System.out.println("Apakah mau beli lagi ?");
					System.out.println("Pilih 1 untuk pilih kembali");
					System.out.println("Pilih 2 untuk keluar");
					System.out.print("Pilih menu yang akan dipilih : ");
					int beliLagi = input.nextInt();
					
					System.out.println("");
					tampilkan();
					System.out.println("");

					if (beliLagi == 2) {
						break;
					}

				} while (true);

			} else if (pilihan == 2) {
				System.exit(0);
				input.close();
			} else {
				System.out.println("Pilihan tidak ada");
			}

		} while (true);
		


	}

	public static void tampilkan() {
		System.out.println("Buku " + list_buku.jav.buku + " seharga Rp." + list_buku.jav.harga);
		System.out.println("Buku " + list_buku.kot.buku + " seharga Rp." + list_buku.kot.harga);
		System.out.println("Buku " + list_buku.spr.buku + " seharga Rp." + list_buku.spr.harga);
		System.out.println("Buku " + list_buku.ang.buku + " seharga Rp." + list_buku.ang.harga);
	}

}

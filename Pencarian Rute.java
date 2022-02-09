import java.util.Scanner;

public class utsDaa_1911500154 {
	public static void main(String[] args) {
		final double INF = Double.POSITIVE_INFINITY;
		System.out.println("=============Daftar Kota==============");
		String[] nmSimpul = {"Muntok", "Sungailiat", "Pangkalpinang", "Koba", "Toboali"};
		double[][] adjacent = {{0, 106, INF, INF, INF},		//muntok
							   {106, 0, 32, INF, INF},		//sungailiat
							   {INF, 32, 0, 58, INF},		//pangkalpinang
							   {INF, INF, 58, 0, 67},		//koba
							   {INF, INF, INF, 67, 0}};		//toboali
		Scanner input = new Scanner(System.in);
		int asal = 0;
		int tujuan = 0;
		for(int i = 1; i <= 5; i++) System.out.println("[" + i + "] " + nmSimpul[i - 1]);
		while(asal <= 0 || asal > 5) {
			System.out.println("===================================");
			System.out.print("Masukkan Angka dari Kota asal (1-5): "); asal = Integer.parseInt(input.nextLine());
			if(asal <= 0 || asal > 5) System.out.println("Kabupaten/kota asal salah!");
		}
		while(tujuan <= 0 || tujuan > 5) {
			System.out.print("Masukkan Angka dari Kota tujuan (1-5): "); tujuan = Integer.parseInt(input.nextLine());
			if(tujuan <= 0 || tujuan > 5) System.out.println("Kabupaten/kota tujuan salah!");
		}
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(i + 1 == asal && j + 1 == tujuan) {
					if(adjacent[i][j] !=0 && adjacent[i][j] != INF)
						System.out.println(nmSimpul[i] + " dan " + nmSimpul[j] + " dapat ditempuh langsung dengan jarak " + adjacent[i][j] + " km ");
					else if(adjacent[i][j] == 0)
						System.out.println("Kota asal dan tujuan sama");
					else
						System.out.println("Tidak ada rute langsung antara " + nmSimpul[i] + " dan " + nmSimpul[j]);
				}
			}
		}
	}
}

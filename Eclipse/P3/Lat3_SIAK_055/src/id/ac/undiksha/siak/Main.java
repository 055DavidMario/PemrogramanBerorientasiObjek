package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Inheritense (extends) dan Implement");
		System.out.println("\n");
		
		Mahasiswa mhs2 = new Mahasiswa(
				"David Mario Yohanes Samosir",
				"Cibinong",
				true,
				"2115101055",
				"ILKOM-21",
				"Ilmu Komputer",
				"TI-21",
				"Teknik Informatika",
				"FTK"
				);
		mhs2.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"Dosen 1",
				"Singaraja",
				true,
				"10101010",
				"ILKOM",
				"Ilmu Komputer",
				"Dosen Ilkom",
				"TI",
				"Teknik Informatika",
				"FTK"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai 1",
				"Buleleng",
				false,
				"123456789",
				"Lab Ilkom"
				);
		pegawai1.printAllInfo();
	}
}
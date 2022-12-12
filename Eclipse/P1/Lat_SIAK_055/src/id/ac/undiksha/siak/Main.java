package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa mhs1 = new Mahasiswa();
		Dosen dsn1 = new Dosen();
		Pegawai pgw1 = new Pegawai();
		
		mhs1.setNim("2115101055");
		mhs1.setNama("David Mario");
		
//		System.out.println(mhs1.getNim());
//		System.out.println(mhs1.getNama());
		System.out.println("Data Mahasiswa");
		mhs1.printAllInfo();
//		
//		Mahasiswa mhs2 = new Mahasiswa(
//				"12345678",
//				"Budi",
//				true,
//				"Denpasar",
//				"Ilmu Komputer",
//				"Teknik Informatika",
//				"FTK"
//				);
//		System.out.println("");
//		
//		mhs2.printAllInfo();
		
		System.out.println("");
		System.out.println("Data Dosen");
		dsn1.printAllInfo();
		
		System.out.println("");
		System.out.println("Data Pegawai");
		pgw1.printAllInfo();
	}

}

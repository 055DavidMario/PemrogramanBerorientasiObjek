package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Manusia;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		
//		Mahasiswa mhs1 = new Mahasiswa(
//				"2115101055",
//				"David",
//				true,
//				"Singaraja",
//				"Ilmu Komputer",
//				"Teknik Informatika",
//				"FTK"
//				);

		System.out.println("Data Mahasiswa");
		
//		mhs1.printAllInfo();
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
//		System.out.println("Data Dosen");

		Manusia mns1 = new Manusia();
		mns1.setNama("Dodi");
		mns1.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs3");
		Mahasiswa mhs3 = new Mahasiswa();
		mhs3.setNama("Dodi");
		mhs3.setProdi("Ilmu Komputer");
		mhs3.printAllInfo();
		
//		Manusia mns2 = new Manusia("Edi", true "Singaraja");
//		mns2.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs5");
		Mahasiswa mhs5 = new Mahasiswa("1234","ILKOM", "TI", "FTK");	
//		mhs5.getAlamat();
//		mhs5.getNim();
		mhs5.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs7");
		Mahasiswa mhs7 = new Mahasiswa("Budi",true, "Denpasar");
		mhs7.printAllInfo();
		
		System.out.println("");
		System.out.println("siX");
		Manusia siX = new Mahasiswa (); //sesuai tipe yang di buat yaitu Manusia ,Dimana Mahasiswa memiliki sifat dari manusia, jadi Mahasiswa bisa buat manusia.
		siX.getNama();
//		siX.getNim();
		siX.printAllInfo();
		
//		Mahasiswa siY = new Manusia();Error karena Manusia belum tentu mahasiswa, jadi constructor Manusia hanya bisa membuat Sifat manusianya saja.
		
	
		
//		System.out.println("");
//		System.out.println("Data Pegawai");
//		pgw1.printAllInfo();
		
		
		
		
		
		//Tugas Dosen Dan Pegawai
		System.out.println("");
		System.out.println("Dosen");//Judul
		Dosen dosen = new Dosen("Gede Kadek Komang",true,"Singaraja");//Menggisi value data dari sifat Supperclass yaitu Manusia
		dosen.setNip("2115101063");
		dosen.setJabatan("Rektor 5 Periode");
		dosen.setProdi("ILKOM"); 
		dosen.setJurusan("TI");
		dosen.setFakultas("FTK");
		dosen.printAllInfo();//Memanggil semua data 
		
		System.out.println("");
		System.out.println("Pegawai");
		Manusia X = new Pegawai ("Si Manusia X ", true, "Pantai Bangli"); 
		X.printAllInfo();
		
		System.out.println("");
		System.out.println("Pegawai");//Judul
		Pegawai pgw1 = new Pegawai("Pegawai X", false, "Busungbiu"); //data manusia
		pgw1.setNip("1234567890"); 
		pgw1.setJabatan("Karyawan PNS");
		pgw1.setUnit("Sektor B");
		pgw1.printAllInfo();

		
		
		
	
	}

}

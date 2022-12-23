package id.ac.undiksha.siak.entities;

public class Manusia {
	private String 	nama; //Tipe data String di gunakan untuk menampung jenis data Huruf,simbol atau kalimat 
	private boolean	jenisKelamin; //Tipe data boolean di gunakan karna hanya memiliki 2 nilai yaitu 0 (perempuan) 1 (laki-laki)
	private String 	alamat;
	//private di gunakan untuk menjaga data agar tidak semua bisa mengakses kecuali dirinya sendiri
	
	public Manusia () { //contractor Manusia
		this.setNama("<Nama belum diisi>"); 
//		this.setJenisKelamin("<Jenis Kelamin belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
	}

	public Manusia(String nama, boolean jenisKelamin, String alamat) { //Menggunakan Public agar bisa di akses oleh semua orang 
		super(); //Berguna untuk mengakses Superclass(Manusia) yang sifatnya bisa di turunkan
		this.nama = nama; //this memanggil dirinya sendiri dari fungsi dari Manusia
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
	}



	public void printAllInfo() { //printAllInfo berguna untuk menampilkan semua data
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Jenis Kelamin: " + 
		(jenisKelamin ? "Laki-laki" : "Perempuan")); //menggunkana kondisi if True/False = ? True : Else atau 1 : 0
	}
	
	//Menggenerete getter dan setter kan datanya dengan fitur dari source
	//Get berguna untuk memanggil  data
	//Set untuk membuat value yang akan di isi pada data
	public String getNama() { 
		return nama;
		
	}
	public void setNama(String nama) {
		this.nama = nama;
	
	}
	public boolean isJenisKelamin() {
		return jenisKelamin;
	
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	
	}
	public String getAlamat() {
		return alamat;
	
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	
}
package id.ac.undiksha.siak.entities;

public class Dosen extends Manusia{ //Meng inheritance sifat dari manusia agar bisa di gunakan di Pegawai
	private String 	nip;
	private String 	jabatan;
	private String 	prodi;
	private String 	jurusan;
	private String 	fakultas;
		
	public Dosen(String nip, String nama, boolean jenisKelamin, String alamat, String jabatan, String prodi,
			String jurusan, String fakultas) {
		super();//Berguna untuk mengakses Superclass(Manusia)
		this.nip = nip;
		this.jabatan = jabatan;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public Dosen() { //construktor dosen 
		super(); //Berguna untuk mengakses Superclass(Manusia)
		this.setNip("<NIP belum diisi>");//this memanggil dirinya sendiri dari fungsi dari Dosen
		this.setJabatan("<Jabatan belum diisi>");
		this.setProdi("<Prodi belum diisi>");
		this.setJurusan("<Jurusan belum diisi>");
		this.setFakultas("<Fakultas belum diisi>");
	}
	
	public Dosen(String nama, boolean jenisKelamin, String alamat) {
		super(nama, jenisKelamin, alamat);
		// TODO Auto-generated constructor stub
	}
	
	public Dosen(String nama, boolean jenisKelamin, String alamat, 
			String nip,String jabatan, String prodi, String jurusan, String fakultas) { //memanggil data data 
		super(nama, jenisKelamin, alamat); //memanggil sifat dan isi data dari superclass yaitu manusia
		this.nip = nip;
		this.jabatan = jabatan;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllInfo() { //untuk printout semua data yaitu Manusia dan Dosen
		System.out.println("Nama: " + this.getNama());
		System.out.println("Jenis Kelamin: " + 
				(isJenisKelamin() ? "Laki-laki" : "Perempuan")); 
		System.out.println("Alamat: " + this.getAlamat());
		
		System.out.println("NIP: " + this.getNip());
		System.out.println("Jabatan: " + this.getJabatan());
		System.out.println("Prodi: " + this.getProdi());
		System.out.println("Jurusan: " + this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		
	}
	
	//Menggenerete getter dan setter kan datanya dengan fitur dari source
		//Get berguna untuk memanggil  data
		//Set untuk membuat value yang akan di isi pada data
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getFakultas() {
		return fakultas;
	}
	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	
	
}

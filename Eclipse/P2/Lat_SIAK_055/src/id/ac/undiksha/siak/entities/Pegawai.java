package id.ac.undiksha.siak.entities;

public class Pegawai extends Manusia{ //Meng inheritance sifat dari manusia agar bisa di gunakan di Pegawai
	private String 	nip; //Data data pegawai
	private String 	jabatan;
	private String 	unit;
	
	public Pegawai(String nip, String nama, boolean jenisKelamin, String alamat, String jabatan, String unit) {
		super();
		this.nip = nip;
		this.jabatan = jabatan;
		this.unit = unit;
	}

	public Pegawai(String nama, boolean jenisKelamin, String alamat) {
		super(nama, jenisKelamin, alamat);
		// TODO Auto-generated constructor stub
	}

	public Pegawai() { //construktor Pegawai untuk set default value
		super(); //Memanggil data dari superclass yaitu Manusia ke pegawai
		this.setNip("<NIP belum diisi>");
		this.setJabatan("<Jabatan belum diisi>");
		this.setUnit("<Unit belum diisi>");
	}
	
	public void printAllInfo() { //printAllInfo berguna untuk menampilkan semua data
		System.out.println("NIP: " + this.getNip());
		System.out.println("Nama: " + this.getNama());
		System.out.println("Jenis Kelamin: " + 
				(isJenisKelamin() ? "Laki-laki" : "Perempuan")); //menggunkana kondisi if True/False = ? True : Else atau 1 : 0
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Jabatan: " + this.getJabatan());
		System.out.println("Unit: " + this.getUnit());
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}

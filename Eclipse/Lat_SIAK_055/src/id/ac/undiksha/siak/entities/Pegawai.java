package id.ac.undiksha.siak.entities;

public class Pegawai {
	private String 	nip;
	private String 	nama;
	private boolean	jenisKelamin; //0 perempuan 1 laki-laki
	private String 	alamat;
	private String 	jabatan;
	private String 	unit;
	
	
	public Pegawai() { //construktor untuk set default value
		this.setNip("<NIP belum diisi>");
		this.setNama("<nama belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
		this.setJabatan("<Jabatan belum diisi>");
		this.setUnit("<Unit belum diisi>");
	}
	
	public void printAllInfo() { //untuk printout semua data bersamaan
		System.out.println("NIP: " + this.getNip());
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Jabatan: " + this.getJabatan());
		System.out.println("Unit: " + this.getUnit());
		
		System.out.println("Jenis Kelamin: " + 
		(jenisKelamin ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
	}
	
	//get n set
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
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

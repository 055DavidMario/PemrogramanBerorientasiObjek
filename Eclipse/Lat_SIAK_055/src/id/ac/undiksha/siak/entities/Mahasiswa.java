package id.ac.undiksha.siak.entities;

public class Mahasiswa {
	private String 	nim;
	private String 	nama;
	private boolean	jenisKelamin; //0 perempuan 1 laki-laki
	private String 	alamat;
	private String 	prodi;
	private String 	jurusan;
	private String 	fakultas;
	
	
	
	public Mahasiswa(String nim, String nama, boolean jenisKelamin, String alamat, String prodi, String jurusan,
			String fakultas) {
		super();
		this.nim = nim;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public Mahasiswa() { //construktor untuk set default value
		this.setNim("<NIM belum diisi>");
		this.setNama("<nama belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
		this.setProdi("<Prodi belum diisi>");
		this.setJurusan("<Jurusan belum diisi>");
		this.setFakultas("<Fakultas belum diisi>");
	}
	
	public void printAllInfo() { //untuk printout semua data bersamaan
		System.out.println("NIM: " + this.getNim());
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Prodi: " + this.getProdi());
		System.out.println("Jurusan: " + this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		
		System.out.println("Jenis Kelamin: " + 
		(jenisKelamin ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
	}
	
	//get and set
	//nim	
		public String getNim() { //untuk dipanggil pada main
			return this.nim;
		}
		public void setNim(String nim) { //untuk memberi isian nim
			this.nim = nim;
		}
	
	//nama
		public String getNama() { 
			return this.nama;			
		}
		public void setNama(String nama) { //untuk memberi isian nama
			this.nama = nama;
		}
		
	//jk
		public boolean isJenisKelamin() {
			return jenisKelamin;
		}

		public void setJenisKelamin(boolean jenisKelamin) {
			this.jenisKelamin = jenisKelamin;
		}

	//alamat
		public String getAlamat() {
			return alamat;
		}
		
		public void setAlamat(String alamat) {
			this.alamat = alamat;
		}

	//prodi
		public String getProdi() {
			return prodi;
		}

		public void setProdi(String prodi) {
			this.prodi = prodi;
		}

	//jurusan
		public String getJurusan() {
			return jurusan;
		}

		public void setJurusan(String jurusan) {
			this.jurusan = jurusan;
		}

	//fakultas
		public String getFakultas() {
			return fakultas;
		}

		public void setFakultas(String fakultas) {
			this.fakultas = fakultas;
		}

}

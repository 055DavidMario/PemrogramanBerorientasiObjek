package id.ac.undiksha.siak.entities;

public class Mahasiswa extends Manusia{ //inheritense
	private String 	nim;  
	private String 	prodi;
	private String 	jurusan;
	private String 	fakultas;

	public Mahasiswa() { //construktor untuk set default value
		super();
		this.setNim("<NIM belum diisi>");
		this.setProdi("<Prodi belum diisi>");
		this.setJurusan("<Jurusan belum diisi>");
		this.setFakultas("<Fakultas belum diisi>");
	}
	
	public Mahasiswa(String nim, String prodi, String jurusan, String fakultas) {
		super();
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}


	public Mahasiswa(String nama, boolean jenisKelamin, String alamat) {
		super(nama, jenisKelamin, alamat);
		// TODO Auto-generated constructor stub
	}
	
	public Mahasiswa(String nama, boolean jenisKelamin, String alamat, 
			String nim, String prodi, String jurusan, String fakultas) {
		super(nama, jenisKelamin, alamat);
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllInfo() { //untuk printout semua data bersamaan
		System.out.println("Nama: " + this.getNama());
		System.out.println("Jenis Kelamin: " + 
				(isJenisKelamin() ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("NIM: " + this.getNim());
		System.out.println("Prodi: " + this.getProdi());
		System.out.println("Jurusan: " + this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		
		
		
	}
	
	//get and set
	//nim	
		public String getNim() { //untuk dipanggil pada main
			return this.nim;
		}
		public void setNim(String nim) { //untuk memberi isian nim
			this.nim = nim;
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

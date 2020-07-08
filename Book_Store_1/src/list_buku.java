
public enum list_buku {

	jav(1,10000,"Java"),kot(2,11000,"kotlin"),spr(3,12000,"spring"),ang(4,13000,"angular");
	
	public int nomor,harga;
	public String buku;
	
	private list_buku(int nomor, int harga,String buku) {
		this.nomor = nomor;
		this.harga = harga;
		this.buku = buku;
	}
	
}

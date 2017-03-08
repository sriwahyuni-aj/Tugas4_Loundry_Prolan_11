public class Loundry {
	public static void main (String[] args) {
	System.out.print("-- INFORMASI JAKET --\n\n");
	Jaket jaket = new Jaket();
 
	
	
    jaket.nama = "JAKET";
    jaket.harga = 15000;
    jaket.informasi_jaket();
	
	
	System.out.print("-- INFORMASI SELIMUT --\n\n");
	Selimut selimut = new Selimut();
	
    selimut.nama = "SELIMUT";
    selimut.harga = 20000;
    selimut.informasi_selimut();
	}
}
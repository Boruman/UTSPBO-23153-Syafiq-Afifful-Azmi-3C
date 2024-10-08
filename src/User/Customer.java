package User;

/**
 *
 * @author Syafiq
 */
public class Customer extends Pengguna {

    public Customer(String nama) {
        super(nama);
    }

    @Override
    public void pesanKamar(int nomorKamar) {
        // Implementasi spesifik untuk customer
        System.out.println(nama + " memesan kamar nomor " + nomorKamar);
        // Logika memesan kamar bisa diatur di sini
    }
}
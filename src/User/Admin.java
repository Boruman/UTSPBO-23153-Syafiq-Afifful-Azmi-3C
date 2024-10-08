package User;
import ReservasiHotel.KamarHotel;
import ReservasiHotel.Hotel;
import java.util.ArrayList;
/**
 *
 * @author Syafiq
 */
public class Admin extends Pengguna {

    public Admin(String nama) {
        super(nama);
    }

    public void tambahKamar(Hotel hotel, KamarHotel kamar) {
        hotel.tambahKamar(kamar);
        System.out.println("Kamar baru dengan nomor " + kamar.getNomorKamar() + " berhasil ditambahkan.");
    }

    @Override
    public void pesanKamar(int nomorKamar) {
        System.out.println("Admin " + nama + " memesan kamar nomor " + nomorKamar);
    }
}
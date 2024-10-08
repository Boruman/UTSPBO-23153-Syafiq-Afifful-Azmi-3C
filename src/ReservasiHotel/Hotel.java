package ReservasiHotel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Syafiq
 */
public class Hotel {
    private final String namaHotel;
    private final List<KamarHotel> daftarKamar;

    public Hotel(String namaHotel) {
        this.namaHotel = namaHotel;
        this.daftarKamar = new ArrayList<>();
    }

    public void tambahKamar(KamarHotel kamar) {
        daftarKamar.add(kamar);
    }

    public void cekKetersediaan() {
        System.out.println("Kamar yang tersedia:"); 
        for (KamarHotel kamar : daftarKamar) {
            if (!kamar.isDipesan()) {
                System.out.println(kamar.getDetailKamar());
            }
        }
    }

    public KamarHotel cariKamar(int nomorKamar) {
        for (KamarHotel kamar : daftarKamar) {
            if (kamar.getNomorKamar() == nomorKamar) {
                return kamar;
            }
        }
        return null;
    }

    public String getNamaHotel() {
    return this.namaHotel;
}
}
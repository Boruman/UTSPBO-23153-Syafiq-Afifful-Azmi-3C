package ReservasiHotel;

/**
 *
 * @author Syafiq
 */
public class KamarHotel {
    private int nomorKamar;
    String tipeKamar;
    private boolean dipesan;

    public KamarHotel(int nomorKamar, String tipeKamar) {
        this.tipeKamar = tipeKamar;
        this.nomorKamar = nomorKamar;
        this.dipesan = false;
    }

    public boolean isDipesan() {
        return dipesan;
    }

    public void setDipesan(boolean dipesan) {
        this.dipesan = dipesan;
    }
    
      public String getTipeKamar() {
        return tipeKamar;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getDetailKamar() {
        return ("Nomor Kamar: " + nomorKamar + "\nTipe: " + tipeKamar + ", \nStatus: " + (dipesan ? "Dipesan" : "Tersedia"));
    }
}
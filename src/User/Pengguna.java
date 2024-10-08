/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.ArrayList;
import java.util.List;
import ReservasiHotel.KamarHotel;
import ReservasiHotel.Reservasi;

/**
 *
 * @author Syafiq
 */
public abstract class Pengguna implements Reservasi {
    String nama;
    protected List<KamarHotel> kamarDipesan;

    public Pengguna(String nama) {
        this.nama = nama;
        this.kamarDipesan = new ArrayList<>();
    }

    @Override
    public abstract void pesanKamar(int nomorKamar);

    public void batalkanPesanan(KamarHotel kamar) {
        kamar.setDipesan(false);
        kamarDipesan.remove(kamar);
        System.out.println("Pesanan untuk kamar " + kamar.getNomorKamar() + " telah dibatalkan.");
    }
    
    public String getNamaPengguna() {
        return nama;
    }

    public void lihatPesanan() {
    if (kamarDipesan.isEmpty()) {
            System.out.println ("Hallo " + getNamaPengguna() + ", Anda belum Memesan Kamar untuk Saat Ini.");
        } else {
            System.out.println ("Hallo " + getNamaPengguna() + ", Anda telah Memesan Kamar berikut :");
            for (KamarHotel kamar : kamarDipesan) {
                kamar.getDetailKamar();
            }
            
        }
    }
}

import java.time.DayOfWeek;
import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class HitungHari {
    private int bulan;
    private int tahun;
    
    public HitungHari(int bulan, int tahun) {
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public HitungHari() {}
    
    public int getJumlahHari() {
        YearMonth yearMonth = YearMonth.of(tahun, bulan);
        return yearMonth.lengthOfMonth();
    }
    
    public String getHariPertama() {
        LocalDate pertama = LocalDate.of(tahun, bulan, 1);
        return translateHari(pertama.getDayOfWeek());
    }
    
    public String getHariTerakhir() {
        LocalDate terakhir = LocalDate.of(tahun, bulan, getJumlahHari());
        return translateHari(terakhir.getDayOfWeek());
    }
    
    public long hitungSelisihHari(LocalDate tanggalDipilih) {
        LocalDate hariIni = LocalDate.now();
        return ChronoUnit.DAYS.between(tanggalDipilih, hariIni);
    }
    
    private String translateHari(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY: 
                return "Senin";
            case TUESDAY: 
                return "Selasa";
            case WEDNESDAY: 
                return "Rabu";
            case THURSDAY: 
                return "Kamis";
            case FRIDAY: 
                return "Jumat";
            case SATURDAY: 
                return "Sabtu";
            case SUNDAY: 
                return "Minggu";
            default: 
                return "";
        }
    }
    
    
    
}

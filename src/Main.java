public class Main {
    public static void main(String[] args) {


        /*
                OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
                ogretmenKrediManager.hesapla();
        */

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager()); // iki nesne oluşturduk
        krediUI.krediHesapla(new TarimKrediManager()); // krediHesapla nın bir etkisi olmuyor
        krediUI.krediHesapla(new AskerKrediManager());
        // krediUI class ındaki krediHesapla metodunu çağırıp new lediğimiz nesneyi gönderiyoruz

        /*

        # krediHesapla ya ben istediğim class taki nesneyi gönderebilirim
        # çünkü BaseKrediManager hem OgretmenKrediManager ın hem de TarimKrediManager ın
        annesi olduğu için
        krediHesapla metoduna anneyi verip çocuklarından istediğimizi yollayabiliriz.
        # BUNU REFERANCE TİP OLMASI YAPIYOR
        # BaseKrediManager OgretmenKrediManager ında TarimKrediManager ında
        referance ını tutabilir.

        */







    }
}
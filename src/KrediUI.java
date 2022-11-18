public class KrediUI {
    // arayüz

    /*

        # krediHesapla ya ben istediğim class taki nesneyi gönderebilirim
        # çünkü BaseKrediManager hem OgretmenKrediManager ın hem de TarimKrediManager ın
        annesi olduğu için
        krediHesapla metoduna anneyi verip çocuklarından istediğimizi yollayabiliriz.
        # BUNU REFERANCE TİP OLMASI YAPIYOR
        # BaseKrediManager OgretmenKrediManager ında TarimKrediManager ında
        referance ını tutabilir.

     */

    public void krediHesapla(BaseKrediManager baseKrediManager){ // ( sınıf nesne )

        // class'tan üretilmiş bir nesneyi çağırıyoruz
        baseKrediManager.hesapla();

        // ogretmenKrediManager.hesapla(); hata! extends edilen bu şekilde çağrılamaz.

    }
}

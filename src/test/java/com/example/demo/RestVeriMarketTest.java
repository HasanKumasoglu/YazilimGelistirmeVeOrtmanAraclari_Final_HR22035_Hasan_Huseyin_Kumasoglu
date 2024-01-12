package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RestVeriMarketTest {

    @Test
    void urunEk() {

        RestVeriMarket.UrunBilgi TurunBilgi = new RestVeriMarket.UrunBilgi("Cikolata" , 3);

        RestVeriMarket.urunEk(TurunBilgi);

        //Ürünü bulması için URUN_LIST üzerinden, var olup olmadığını buluyor. Eğere bu nesne kayıt edilmemiş olasydı, URUN_LIST üzerinden bulamazdı.

        /*

        for (UrunBilgi urunBilgi: URUN_LIST) {            =====>
            if (urunBilgi.ID == no ) {                    =====>   "urunBul Kodu"
                return urunBilgi;                         =====>
            }
        }

        */

        assertEquals(RestVeriMarket.urunBul(TurunBilgi.ID()) , TurunBilgi);

    }

    @Test
    void urunList() {

        RestVeriMarket.UrunBilgi TurunBilgi = new RestVeriMarket.UrunBilgi("Bal", 4);

        RestVeriMarket.urunEk(TurunBilgi);

        //Static olarak 2 tane ürün eklenmişti fazladan ürün ekleyrek URUN_LIST'in size'ını 3'e çıkartmış olduk
        //Üstündeki testten dolayı 1 tane daha nesnemiz var

        assertEquals(RestVeriMarket.URUN_LIST.size() , 4 );

    }


    @Test
    void urunSil() {

        //Static olarak 2 ürünüm var
        //Yukarıdaki 2 test ile 2 ürünüm daha var

        RestVeriMarket.urunSil(1);

        //ID : 2 olan ürünü sil emri verdim.

        assertEquals(RestVeriMarket.URUN_LIST.size() , 3);

        //3 tane nesne kaldığını göstermek için. URUN_LIST.size() kullanarak içinde 3 nesne olduğunu gördüm.


    }
}


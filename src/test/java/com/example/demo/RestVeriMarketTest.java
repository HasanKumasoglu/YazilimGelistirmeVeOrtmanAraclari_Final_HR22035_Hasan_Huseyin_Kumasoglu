package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RestVeriMarketTest {

    @Test
    void urunEk() {

        RestVeriMarket.UrunBilgi TurunBilgi = new RestVeriMarket.UrunBilgi("Cikolata" , 3);

        RestVeriMarket.urunEk(TurunBilgi);

        assertEquals(RestVeriMarket.URUN_LIST.size() , 3);
        RestVeriMarket.urunSil(3);

    }

    @Test
    void urunList() {


        RestVeriMarket.UrunBilgi TurunBilgi = new RestVeriMarket.UrunBilgi("Bal", 4);

        RestVeriMarket.urunEk(TurunBilgi);

        //Static olarak 2 tane ürün eklenmişti fazladan ürün ekleyrek URUN_LIST'in size'ını 3'e çıkartmış olduk

        assertEquals(RestVeriMarket.URUN_LIST.size() , 3 );
        RestVeriMarket.urunSil(4);

    }


    @Test
    void urunSil() {

        //Static olarak 2 ürünüm var

        RestVeriMarket.urunSil(1);

        //ID : 2 olan ürünü sil emri verdim.

        assertEquals(RestVeriMarket.URUN_LIST.size() , 1);

        //1 tane nesne kaldığını göstermek için. URUN_LIST.size() kullanarak içinde 1 nesne olduğunu gördüm.


    }
}


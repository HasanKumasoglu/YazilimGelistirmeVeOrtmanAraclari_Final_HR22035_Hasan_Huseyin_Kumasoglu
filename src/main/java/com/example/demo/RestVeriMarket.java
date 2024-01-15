package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class RestVeriMarket {

    public record UrunBilgi(String UrunAdi, int ID){}

    public static final List<UrunBilgi> URUN_LIST = new ArrayList<>();



    static {

        URUN_LIST.add(new UrunBilgi("Ekmek",1));
        URUN_LIST.add(new UrunBilgi("Peynir",2));

    }

    @PostMapping("/urunEkleme")
    public static UrunBilgi urunEk(@RequestBody UrunBilgi urunBilgi) {

        URUN_LIST.add(urunBilgi);

        return urunBilgi;
    }

    @GetMapping("/urunListele")
    public static List<UrunBilgi> urunList() {

        return URUN_LIST;

    }


    @DeleteMapping("/urunSilme/{IDx}")
    public static UrunBilgi urunSil(@PathVariable int IDx) {

        for (UrunBilgi urunBilgi: URUN_LIST) {
            if (urunBilgi.ID == IDx ) {

                URUN_LIST.remove(urunBilgi);

                return urunBilgi;

            }
        }

        return null;
    }

}


package com.selimcinar.fonksiyonlarvesnflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.contracts.Returns

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //onCreate fonksiyonu Main activity ilk açıldığı anda çalışır.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  m = -10
        if (m ==0) {
            ilkFonksiyon()
        }
        else
        {
            ikinciFonksiyon()
        }

        cikarma(500,20) //Fonksiyon parametresi ile yazıldı.

        var x = cikarma(500,20) // cikarma fonksiyonu Unit
        println(x) // unit değeri döndürür

        var  y = toplama(10,20) // toplama fonksiyonu Int
        println(y) // Int değer döndürür.

        button.setOnClickListener {  //Buttona tıklayınca şu olsun
            val toplamaSonucu = toplama(10,50)
            textView.text = "Sonuç : ${toplamaSonucu}"
        }
        sinifCalismasi()

        }
    fun ilkFonksiyon() {
        println("İlk fonksiyon çalıştırıldı.")
    }

    fun ikinciFonksiyon () {
        println("İkinci fonksiyon çalıştırıldı.")
        ilkFonksiyon()
    }

    // Girdi Almak Parametre oluşturmak
    fun  cikarma(x: Int , y:Int) {
        textView.text="Sonuç : ${x-y}" // activity_main içerisinde textView ' e işlem yaptırıldı
    }


    //Çıktı Vermek -> Döndürmek (Return)
    fun toplama(a: Int ,b:Int) : Int {   //Parametrelere ekle ve : sonunda Int döndür
        return  a + b
    }

    /*

    //Görünüm tarafından çağırmak çalıştırmak
    fun Degistir (view: View) {
        view.background // view la alakalı metotlar çalıştırılır.
        val toplamaSonucu = toplama(10,50)
        textView.text = "Sonuç : ${toplamaSonucu}"
    */
    //Sınıflar ve fonksiyonlar

    fun sinifCalismasi () {

    var superman = Superkahraman("Superman",50,"Gazeteci")
        textView.text = "Yaş : ${superman.yas}"
        superman.testFonksiyonu();
        println(superman.sacRenginiAl())

    }

    fun nullGüvenliği(){
        //Null ,Nullability,Null Safety boş herhangi bir değer almamış
        //Tanımlama , Defining
        var benimString : String? // nul olabilen string

        //Initialization başlatma
        benimString = "Selim"

        var benimYasim : Int? = null  // nul olabilen int
        println(benimYasim )

        benimYasim = 2
        // Null kontrolleri
        if (benimYasim != null) {
            println(benimYasim*2)
        }
        else {
            println("null geldi")
        }

        //2
        benimYasim = 3
        // !! -> null olamayacak , ?-> null olabilir.
        println(benimYasim?.minus(2))  // benimyasimdan null olabilir ve 2 değerini minus et cikar

        //3
        // elvis operatörü
        val sonuc = benimYasim?.minus(2) ?:10 // null geliyorsa 10 değerini alır default  gelmiyorsa 2 değerinin alır
        println(sonuc)

        //4
        // let

        benimYasim?.let {  // nullsa bu değer çalışmaz null boş değilse çalışır
            println(it*5)
        }




    }



    }

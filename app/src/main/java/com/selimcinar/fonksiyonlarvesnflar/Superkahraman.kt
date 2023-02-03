package com.selimcinar.fonksiyonlarvesnflar

class Superkahraman (var isim:String ,var yas:Int,var meslek:String ){
  fun testFonksiyonu(){
      println("test")
  }
    private fun testFonksiyonu2 (){
        println("test2")
    }

   private var sacininRengi = "Sari"

    //Getter  private objeyi getirmeyi sağlar
    fun sacRenginiAl() : String{
        return this.sacininRengi
    }

    //Setter private objeyi değiştirmeyi sağlar
    fun  sacRenginiDegistir() {
        this.sacininRengi="Yeşil"
    }

   // Acces Levels  - Erişilebilirlilik Seviyeleri
  //private gizli özel sadece bu sınıftan   - protected korunmuş sınıf ve .kt dosyası içerisinden erişilir  - internal  kendi mödüllerimiz içerisinden erişilir.- public heryerden ulaşılır





/*
    //Property özellik

    var isim = ""
    var yas = 0
    var meslek = ""





    //Constructor her objede oluşturmada çalıştırılır.
    //Özel fonksiyon

    constructor(isim: String ,yas : Int, meslek:String) {
        this.isim = isim
        this.yas = yas
        this.meslek = meslek
        println("Constructor çağrıldı.")
    } */

}
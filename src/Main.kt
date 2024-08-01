//enum class lar sabit değerleri ifade etmek ve gruplanabilir veri türlerini gruplamak için kullanılır
//haftanın günleri,trafik ışığı renkleri,ülkeler,şehirler,bankacılık işlemleri para yatırma,çekme,bakiye sorgulama vb.
//enum classlar miras alınamazlar ve miras alamazlar yanlızca interface implement edebilirler.
//enum classların nesneleri üretilemez.enum classların içersinde değişken ve fonksiyon tanımlanabilir.
//enum sabitleri arka planda statik class gibi davranırlar yani PAZARTESİ burada statik class olarak bulunuyor. ve
//yukarsındaki enumm class ı miras alırlar. enum sabitlerinin name ve ordinal isminde 2 propertysi vardır.
// name bize sabitin ismini ordinal ise sırasını verir(0 dan başlar)
//enum  sabitleri statik class oldukları için de nesnesi oluşturulmadan properylerine erişim sağlanır.

enum class Gunler{
    PAZARTESİ,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESİ,PAZAR

}
fun haftaninGunleri(gun:Gunler):String{
    return when(gun){
        Gunler.PAZARTESİ -> "Hafta Başladı"
        Gunler.CUMA -> "Haftanın Son Günü"
        Gunler.CUMARTESİ,Gunler.PAZAR -> "Hafta Sonu"
        else -> "Hafta İçi"
    }
}

enum class Team(val starCount:Int){ // Eğer enumlara parametre verildiyse sabitler bu parametreyi içermek zorunda
    FENERBAHCE(5),
    GALATASARAY(4),
    BESİKTAS(3)


}

fun main(){
    val pazartesi = Gunler.PAZARTESİ
   println(haftaninGunleri(pazartesi))

val fenerbahce = Team.FENERBAHCE
    println(fenerbahce.starCount)

    val tumGunler = Gunler.values() //values fonksiyonu tüm enum sabitlerinin değerini döner
    tumGunler.forEach { println(it) }

    val sali = Gunler.valueOf("SALI") //valueOf ise seçilen sabitin değerini döner
    println(sali)

    println(Team.FENERBAHCE.ordinal) // ordinal sabitlerin sırasını belirtir arrayler gibi ilk sabit 0 değerinden başlar

}

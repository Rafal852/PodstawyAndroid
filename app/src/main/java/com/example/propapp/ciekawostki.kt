package com.example.propapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ciekawostki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciekawostki)

        val cikawostki = arrayOf(" Sęp może żyć 40 lat.", " Waga dorosłego sępa w zależności od gatunku waha się od 1,5 kg do 15 kg."," Sępy żywią się głównie padliną, oraz jajami ptaków."," Sępy występują w Afryce, Azji i Europie.", " Długość ciała sępa waha się od 60 do 120 cm.", " Rozpiętość skrzydeł w zależności od gatunku wynosi od 1,5 do 3,1 m.", " Na polskim niebie można zobaczyć sępa płowego. Nie jest to jednak prosta sprawa. W XXI wieku odnotowano tylko 14 razy jego obecność.", " Sępy mają niewiele piór na głowię, aby sprawnie zachodziły procesy termoregulacyjne, ochładzające ich głowę.")

        val listview = findViewById<ListView>(R.id.viewset)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cikawostki)
        listview.adapter = adapter
    }
}
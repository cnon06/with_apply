package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class person ()
{
    var ad =""
    var  yas=0

    fun senKimsin()
    {
        println("Ben $ad ve $yas yaşındayım")
    }

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1 = person()
        p1.ad="Sinan"
        p1.yas=41
        p1.senKimsin()

        println("..............................")

        with(p1)
        {
            ad="Suzan"
            yas=37
        }

        p1.senKimsin()

        println("..............................")

        p1.apply {
            ad="Sinem"
            yas=0
        }.senKimsin()




    }
}
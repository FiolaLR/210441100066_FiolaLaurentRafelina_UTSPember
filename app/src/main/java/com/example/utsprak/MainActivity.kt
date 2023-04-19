package com.example.utsprak

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: adapter
    lateinit var listData: ArrayList<classdata>

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = adapter(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(classdata("FIOLA LAURENT RAFELINA", "20 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.ffio))
        listData.add(classdata("NOVALDY DANDI PRIBADI", "20 TAHUN", "UNIVERSITAS SURABAYA", R.drawable.fnoval))
        listData.add(classdata("CHAFI APRILLYA RAHMA Z", "20 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fchafi))
        listData.add(classdata("YOHAN FADHILAH JIBRATAL", "20 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fyohan))
        listData.add(classdata("ARIF GHIFARI", "20 TAHUN", "UNIVERSITAS NEGERI SURABAYA", R.drawable.frif))
        listData.add(classdata("NOVIA PUTRI RAMADHANI", "20 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fnopi))
        listData.add(classdata("M MAHFUD ABDUL JALIL", "19 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fmhfd))
        listData.add(classdata("ANNISA FEBRIANTY", "18 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fnisa))
        listData.add(classdata("ABDUL HAKIM", "19 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fkim))
        listData.add(classdata("FEBITA OVIANDARI S", "17 TAHUN", "UNIVERSITAS BRAWIJAYA", R.drawable.fovin))
        listData.add(classdata("RYANSYA RAMADHANA SUBANA", "22 TAHUN ", "UNIVERSITAS BRAWIJAYA", R.drawable.fryan))
        listData.add(classdata("DZIKRI AMIRUL ASHARI", "20 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fdzik))
        listData.add(classdata("LORDGENT RAFELINO", "25 TAHUN", "BACK END DEVELOPER", R.drawable.flord))
        listData.add(classdata("SAFYAH MIYATRI ", "26 TAHUN", "PERAWAT", R.drawable.fsaf))
        listData.add(classdata("MUCTHAR NUR F", "22 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.ftar))
        listData.add(classdata("SANDY ADITYA RAMDHANI", "22 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fsandy))
        listData.add(classdata("RIZAL", "21 TAHUN", "UNIVERSITAS TRUNOJOYO", R.drawable.fjal))
        listData.add(classdata("NUR RIZKINA", "21 TAHUN", "POLITEKNIK JEMBER", R.drawable.fnur))
        listData.add(classdata("FARIZAL ARYA W", "22 TAHUN", "POLITEKNIK JEMBER", R.drawable.ftum))
        listData.add(classdata("MUHAMMAD ALEX STEVANI", "24 TAHUN", "UNIVERSITAS 17 AGUSTUS", R.drawable.feng))


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.itemlist ->{
                startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                true
            }
            else ->return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }
}



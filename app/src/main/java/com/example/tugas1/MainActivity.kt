package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.example.listviewkotpractice.ListAdapter
import com.example.tugas1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable._211402005,
            R.drawable._211402006,
            R.drawable._211402007,
            R.drawable._211402008,
            R.drawable._211402009,
            R.drawable._211402010,
            R.drawable._211402011,
            R.drawable._211402012,
            R.drawable._211402013,
        )
        val emailList = intArrayOf(
            R.string.email1,
            R.string.email2,
            R.string.email3,
            R.string.email4,
            R.string.email5,
            R.string.email6,
            R.string.email7,
            R.string.email8,
            R.string.email9,
            R.string.email10
        )
        val angkatanList = intArrayOf(
            R.string.angkatan1,
            R.string.angkatan2,
            R.string.angkatan3,
            R.string.angkatan4,
            R.string.angkatan5,
            R.string.angkatan6,
            R.string.angkatan7,
            R.string.angkatan8,
            R.string.angkatan9,
            R.string.angkatan10,
        )

        val fakultasList = intArrayOf(
            R.string.fakultas1,
            R.string.fakultas2,
            R.string.fakultas3,
            R.string.fakultas4,
            R.string.fakultas5,
            R.string.fakultas6,
            R.string.fakultas7,
            R.string.fakultas8,
            R.string.fakultas9,
            R.string.fakultas10,
        )

        val progamstudiList = intArrayOf(
            R.string.program_studi1,
            R.string.program_studi2,
            R.string.program_studi3,
            R.string.program_studi4,
            R.string.program_studi5,
            R.string.program_studi6,
            R.string.program_studi7,
            R.string.program_studi8,
            R.string.program_studi9,
            R.string.program_studi10,
        )

        val semesterterdaftarList = intArrayOf(
            R.string.sem_terdaftar1,
            R.string.sem_terdaftar2,
            R.string.sem_terdaftar3,
            R.string.sem_terdaftar4,
            R.string.sem_terdaftar5,
            R.string.sem_terdaftar6,
            R.string.sem_terdaftar7,
            R.string.sem_terdaftar8,
            R.string.sem_terdaftar9,
            R.string.sem_terdaftar10,
        )

        val statusList = intArrayOf(
            R.string.status1,
            R.string.status2,
            R.string.status3,
            R.string.status4,
            R.string.status5,
            R.string.status6,
            R.string.status7,
            R.string.status8,
            R.string.status9,
            R.string.status10,
        )


        val nameList = arrayOf(
            "Nadia Sofia",
            "Donny Adithya",
            "CECILIA PRAMUDITHA",
            "Ade Bunga Dwi Setiayu",
            "MUTIA RAHMAH",
            "MARIA JULIANA PURBA",
            "FANI WINDARI",
            "ICHA FRABILA",
            "CLARISSA NAZHWA RAMADHINA",
            "Ridho P. Sibuea"
        )

        val nimList = arrayOf(
            "211402005",
            "211402006",
            "211402007",
            "211402008",
            "211402009",
            "211402010",
            "211402011",
            "211402012",
            "211402013",
            "211402014"
        )

        for (i in imageList.indices) {
            listData = ListData(
                nameList[i],
                nimList[i],
                emailList[i],
                angkatanList[i],
                fakultasList[i],
                progamstudiList[i],
                semesterterdaftarList[i],
                statusList[i],
                imageList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(this@MainActivity, dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true

        binding.listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@MainActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("nim", nimList[i])
            intent.putExtra("email", emailList[i])
            intent.putExtra("angkatan", angkatanList[i])
            intent.putExtra("fakultas", fakultasList[i])
            intent.putExtra("programstudi", progamstudiList[i])
            intent.putExtra("semesterterdaftar", semesterterdaftarList[i])
            intent.putExtra("status", statusList[i])
            intent.putExtra("image", imageList[i])
            startActivity(intent)
        }
    }
}
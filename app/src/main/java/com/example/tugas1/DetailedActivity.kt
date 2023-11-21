package com.example.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas1.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val nim = intent.getStringExtra("nim")
            val email = intent.getIntExtra("email", R.string.email1)
            val angkatan = intent.getIntExtra("angkatan", R.string.angkatan1)
            val fakultas = intent.getIntExtra("fakultas", R.string.fakultas10)
            val programstudi = intent.getIntExtra("programstudi", R.string.program_studi1)
            val semesterterdaftar = intent.getIntExtra("semesterterdaftar", R.string.sem_terdaftar1)
            val status = intent.getIntExtra("status", R.string.status1)
            val image = intent.getIntExtra("image", R.drawable._211402005)
            binding.detailName.text = name
            binding.detailNim.text = nim
            binding.detailEmail.setText(email)
            binding.detailAngkatan.setText(angkatan)
            binding.detailFakultas.setText(fakultas)
            binding.detailProgramstudi.setText(programstudi)
            binding.detailSemester.setText(semesterterdaftar)
            binding.detailStatus.setText(status)
            binding.detailImage.setImageResource(image)
        }
    }
}
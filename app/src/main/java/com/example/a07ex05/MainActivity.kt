package com.example.a07ex05

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView = findViewById<ImageView>(R.id.imgviewFoto)
        val imagem = findViewById<EditText>(R.id.linkImagem)
        val btnPesquisar = findViewById<Button>(R.id.btnPesquisar)

        btnPesquisar.setOnClickListener {
            val link = imagem.text.toString()
            Glide.with(this).load(link).into(imageView)
        }
    }
}
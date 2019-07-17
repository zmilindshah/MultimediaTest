package com.example.multimediatest

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlin.random.Random

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val imageView: ImageView = findViewById(R.id.simpleImageView)
        val imageUrl: String = "https://b.zmtcdn.com/data/o2_showcase/20ef74e96949b20adaa43168a3b491701561186015.jpeg"
        //imageView.setImageURI(Uri.parse(imageUrl))
        val x = Random(77).nextInt(0, 100)
        if (x % 2 != 0) {
            Log.d("mm", "Picasso : "+x)
            Picasso.get().load(imageUrl).into(imageView)
        } else {
            Log.d("mm", "Glide : "+x)
            Glide.with(this).load(imageUrl).into(imageView)
        }
    }

    override fun onRestart() {
        Log.i("mm","restart")
        val imageView: ImageView = findViewById(R.id.simpleImageView)
        val imageUrl: String = "https://b.zmtcdn.com/data/o2_showcase/20ef74e96949b20adaa43168a3b491701561186015.jpeg"
        //imageView.setImageURI(Uri.parse(imageUrl))
        val x = Random(7).nextInt(0, 100)
        if (x % 2 == 0) {
            Log.d("mm", "Picasso : "+x)
            Picasso.get().load(imageUrl).into(imageView)
        } else {
            Log.d("mm", "Glide : "+x)
            Glide.with(this).load(imageUrl).into(imageView)
        }
        super.onRestart()
    }
}

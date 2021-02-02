package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackBar()
//        showToast().show()
    }

    private fun showToast(): Toast {
        return Toast.makeText(this, "Eu sou um toast!", Toast.LENGTH_LONG).apply {
            setGravity(Gravity.TOP or Gravity.START, 0, 0)
        }
    }

    private fun showSnackBar() {
        val parentLayout = findViewById<ConstraintLayout>(R.id.constraint)

        var snackbar = Snackbar.make(parentLayout, "Indefinite Snack", Snackbar.LENGTH_SHORT)

        snackbar.setAction("Click", View.OnClickListener {
            showToast().show()
        })
        snackbar.setBackgroundTint(ContextCompat.getColor(this, android.R.color.holo_red_light))
        snackbar.setActionTextColor(ContextCompat.getColor(this, android.R.color.black))
        snackbar.show()
    }
}
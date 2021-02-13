package com.example.appinterfacesembarquees

import android.media.MediaPlayer
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import java.lang.Thread.sleep
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {


    lateinit var ivPiano: ImageView
    lateinit var ivFa1: ImageView
    lateinit var ivSol1: ImageView
    lateinit var ivLa1: ImageView
    lateinit var ivSi1: ImageView
    lateinit var ivDo1: ImageView
    lateinit var ivRe1: ImageView
    lateinit var ivMi1: ImageView
    lateinit var ivFa2: ImageView
    lateinit var ivSol2: ImageView
    lateinit var ivLa2: ImageView
    lateinit var ivSi2: ImageView
    lateinit var ivDo2: ImageView
    lateinit var ivRe2: ImageView
    lateinit var ivMi2: ImageView
    lateinit var tvX: TextView
    lateinit var tvY: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivPiano = findViewById<ImageView>(R.id.ivPiano)
        tvX = findViewById<TextView>(R.id.tvX)
        tvY = findViewById<TextView>(R.id.tvY)

        ivFa1 = findViewById<ImageView>(R.id.ivFa1)
        ivFa1.visibility = View.INVISIBLE
        ivSol1 = findViewById<ImageView>(R.id.ivSol1)
        ivSol1.visibility = View.INVISIBLE
        ivLa1 = findViewById<ImageView>(R.id.ivLa1)
        ivLa1.visibility = View.INVISIBLE
        ivSi1 = findViewById<ImageView>(R.id.ivSi1)
        ivSi1.visibility = View.INVISIBLE
        ivDo1 = findViewById<ImageView>(R.id.ivDo1)
        ivDo1.visibility = View.INVISIBLE
        ivRe1 = findViewById<ImageView>(R.id.ivRe1)
        ivRe1.visibility = View.INVISIBLE
        ivMi1 = findViewById<ImageView>(R.id.ivMi1)
        ivMi1.visibility = View.INVISIBLE
        ivFa2 = findViewById<ImageView>(R.id.ivFa2)
        ivFa2.visibility = View.INVISIBLE
        ivSol2 = findViewById<ImageView>(R.id.ivSol2)
        ivSol2.visibility = View.INVISIBLE
        ivLa2 = findViewById<ImageView>(R.id.ivLa2)
        ivLa2.visibility = View.INVISIBLE
        ivSi2 = findViewById<ImageView>(R.id.ivSi2)
        ivSi2.visibility = View.INVISIBLE
        ivDo2 = findViewById<ImageView>(R.id.ivDo2)
        ivDo2.visibility = View.INVISIBLE
        ivRe2 = findViewById<ImageView>(R.id.ivRe2)
        ivRe2.visibility = View.INVISIBLE
        ivMi2 = findViewById<ImageView>(R.id.ivMi2)
        ivMi2.visibility = View.INVISIBLE


       ivPiano.setOnTouchListener {
                _, event ->
            handleTouch(event)
            true
        }
    }

    private fun handleTouch(m: MotionEvent) {
        val pointerCount = m.pointerCount

            for (i in 0 until pointerCount) {
                val x = m.getX(i)
                val y = m.getY(i)
                val id = m.getPointerId(i)

                var note = (x.toInt()) * 14 / (ivPiano.width.toInt())

                if (id == 0) {
                    tvY.text = note.toString()
                    var nomNote = Notes(note).toString()
                    tvX.text = Notes(note).toString()
                    when (nomNote) {
                        "Fa" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivFa1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivFa1.visibility = View.INVISIBLE
                            }

                        }
                        "Sol" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano110)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSol1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSol1.visibility = View.INVISIBLE
                            }
                        }
                        "La" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano111)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivLa1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivLa1.visibility = View.INVISIBLE
                            }
                        }
                        "Si" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSi1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSi1.visibility = View.INVISIBLE
                            }

                        }
                        "Do" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivDo1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivDo1.visibility = View.INVISIBLE
                            }

                        }
                        "Re" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivRe1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivRe1.visibility = View.INVISIBLE
                            }

                        }
                        "Mi" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivMi1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivMi1.visibility = View.INVISIBLE
                            }
                        }
                        "Fa2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivFa2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivFa2.visibility = View.INVISIBLE
                            }
                        }
                        "Sol2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano110)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSol2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSol2.visibility = View.INVISIBLE
                            }
                        }
                        "La2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano111)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivLa2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivLa2.visibility = View.INVISIBLE
                            }
                        }
                        "Si2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSi2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSi2.visibility = View.INVISIBLE
                            }

                        }
                        "Do2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivDo2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivDo2.visibility = View.INVISIBLE
                            }

                        }
                        "Re2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivRe2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivRe2.visibility = View.INVISIBLE
                            }

                        }
                        "Mi2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivMi2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivMi2.visibility = View.INVISIBLE
                            }

                        }
                        else -> {
                        }
                    }

                } else if (id == 1) {
                    tvY.text = note.toString()
                    var nomNote = Notes(note).toString()
                    tvX.text = Notes(note).toString()
                    when (nomNote) {
                        "Fa" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivFa1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivFa1.visibility = View.INVISIBLE
                            }

                        }
                        "Sol" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano110)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSol1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSol1.visibility = View.INVISIBLE
                            }
                        }
                        "La" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano111)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivLa1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivLa1.visibility = View.INVISIBLE
                            }
                        }
                        "Si" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSi1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSi1.visibility = View.INVISIBLE
                            }

                        }
                        "Do" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivDo1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivDo1.visibility = View.INVISIBLE
                            }

                        }
                        "Re" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivRe1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivRe1.visibility = View.INVISIBLE
                            }

                        }
                        "Mi" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivMi1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivMi1.visibility = View.INVISIBLE
                            }
                        }
                        "Fa2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivFa2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivFa2.visibility = View.INVISIBLE
                            }
                        }
                        "Sol2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano110)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSol2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSol2.visibility = View.INVISIBLE
                            }
                        }
                        "La2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano111)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivLa2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivLa2.visibility = View.INVISIBLE
                            }
                        }
                        "Si2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSi2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSi2.visibility = View.INVISIBLE
                            }

                        }
                        "Do2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivDo2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivDo2.visibility = View.INVISIBLE
                            }

                        }
                        "Re2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivRe2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivRe2.visibility = View.INVISIBLE
                            }

                        }
                        "Mi2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivMi2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivMi2.visibility = View.INVISIBLE
                            }

                        }
                        else -> {
                        }
                    }
                } else if (id == 2) {
                    tvY.text = note.toString()
                    var nomNote = Notes(note).toString()
                    tvX.text = Notes(note).toString()
                    when (nomNote) {
                        "Fa" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivFa1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivFa1.visibility = View.INVISIBLE
                            }

                        }
                        "Sol" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano110)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSol1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSol1.visibility = View.INVISIBLE
                            }
                        }
                        "La" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano111)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivLa1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivLa1.visibility = View.INVISIBLE
                            }
                        }
                        "Si" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSi1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSi1.visibility = View.INVISIBLE
                            }

                        }
                        "Do" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivDo1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivDo1.visibility = View.INVISIBLE
                            }

                        }
                        "Re" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivRe1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivRe1.visibility = View.INVISIBLE
                            }

                        }
                        "Mi" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivMi1.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivMi1.visibility = View.INVISIBLE
                            }
                        }
                        "Fa2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivFa2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivFa2.visibility = View.INVISIBLE
                            }
                        }
                        "Sol2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano110)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSol2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSol2.visibility = View.INVISIBLE
                            }
                        }
                        "La2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano111)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivLa2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivLa2.visibility = View.INVISIBLE
                            }
                        }
                        "Si2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivSi2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivSi2.visibility = View.INVISIBLE
                            }

                        }
                        "Do2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivDo2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivDo2.visibility = View.INVISIBLE
                            }

                        }
                        "Re2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivRe2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivRe2.visibility = View.INVISIBLE
                            }

                        }
                        "Mi2" -> {
                            var mediaPlayer = MediaPlayer.create(this, R.raw.piano11)
                            mediaPlayer.start() // no need to call prepare(); create() does that for you
                            ivMi2.visibility = View.VISIBLE
                            GlobalScope.launch {
                                delay(100L)
                                ivMi2.visibility = View.INVISIBLE
                            }

                        }
                    }
                }
            }
    }


}


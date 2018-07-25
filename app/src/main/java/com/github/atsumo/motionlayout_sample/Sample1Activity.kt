package com.github.atsumo.motionlayout_sample

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Sample1Activity : AppCompatActivity() {
  companion object {
    fun createIntent(context: Context) = Intent(context, Sample1Activity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sample1)
  }
}

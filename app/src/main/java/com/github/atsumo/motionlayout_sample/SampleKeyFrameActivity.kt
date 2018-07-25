package com.github.atsumo.motionlayout_sample

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SampleKeyFrameActivity : AppCompatActivity() {
  companion object {
    fun createIntent(context: Context) = Intent(context, SampleKeyFrameActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sample_key_frame)
  }
}

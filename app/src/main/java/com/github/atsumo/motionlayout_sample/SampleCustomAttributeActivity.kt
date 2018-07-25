package com.github.atsumo.motionlayout_sample

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SampleCustomAttributeActivity : AppCompatActivity() {
  companion object {
    fun createIntent(context: Context) = Intent(context, SampleCustomAttributeActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sample_custom_attribute)
  }
}

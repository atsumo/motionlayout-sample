package com.github.atsumo.motionlayout_sample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.atsumo.motionlayout_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val binding =
      DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)


    binding.sample1Activity.setOnClickListener {
      startActivity(Sample1Activity.createIntent(this))
    }

    binding.sampleCustomAttributeActivity.setOnClickListener {
      startActivity(SampleCustomAttributeActivity.createIntent(this))
    }

    binding.sampleCustomAttributeActivity2.setOnClickListener {
      startActivity(SampleCustomAttributeActivity2.createIntent(this))
    }

    binding.sampleKeyFrameActivity.setOnClickListener {
      startActivity(SampleKeyFrameActivity.createIntent(this))
    }
  }
}

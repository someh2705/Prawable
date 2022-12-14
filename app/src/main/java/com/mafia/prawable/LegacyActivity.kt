package com.mafia.prawable

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mafia.prawable.databinding.ActivityLegacyBinding

class LegacyActivity : Activity() {

    private lateinit var binding: ActivityLegacyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.activity_legacy,
            null, false
        )

        setContentView(binding.root)
    }
}
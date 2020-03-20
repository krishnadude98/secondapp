package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finsih.*

class FinsihActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finsih)
        val league= intent.getStringExtra(EXTRA_LEAGUE)
        val skill=intent.getStringExtra(EXTRA_SKILL)
        SearchLeaguesText.text="looking for $league $skill league near you...."
    }
}

package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class League_Activity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_)
    }
    fun LeagueNextClicked(view: View) {
        var skillactivity= Intent(this,SkillActivity::class.java)
        startActivity(skillactivity)
    }
}

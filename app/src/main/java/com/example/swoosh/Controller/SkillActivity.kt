package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league= intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
    fun OnBeginnerClicked(view: View){
        ProSkillBtn.isChecked= false
        skill="Beginner"
    }
    fun OnProClicked(view: View){
        BeginnerSkillBtn.isChecked=false
        skill= "professional"
    }
    fun OnSkillFinishedClicked(view: View){
       if (skill!="") {
           val finishActivity = Intent(this, FinsihActivity::class.java)
           finishActivity.putExtra(EXTRA_LEAGUE,league)
           finishActivity.putExtra(EXTRA_SKILL,skill)
           startActivity(finishActivity)

       }
        else{
           Toast.makeText(this,"pls select a skill level",Toast.LENGTH_SHORT).show()   }

    }
}

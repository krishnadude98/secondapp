package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league_.*

class League_Activity : BaseActivity() {
    var SelectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_)
    }

    fun onMensClicked(view: View){
        WomenLeaguebtn.isChecked= false
        coedLeagueBtn.isChecked= false
        SelectedLeague= "mens"
    }
    fun onwomenclicked (view: View){
        mens_leaguebtn.isChecked= false
        coedLeagueBtn.isChecked=false
        SelectedLeague= "womens"
    }
    fun coedclicked(view: View){
        mens_leaguebtn.isChecked= false
        WomenLeaguebtn.isChecked=false
        SelectedLeague="co-ed"
    }
    fun LeagueNextClicked(view: View) {
        if (SelectedLeague!="")
        {
            val skillactivity = Intent(this, SkillActivity::class.java)
            skillactivity.putExtra(EXTRA_LEAGUE,SelectedLeague)
            startActivity(skillactivity)
        }
        else{
            Toast.makeText(this,"Please Select a League",Toast.LENGTH_SHORT).show()
        }
    }

}

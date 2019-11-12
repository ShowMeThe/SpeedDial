package com.showmethe.speeddial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.showmethe.speeddiallib.expand.ExpandIcon
import com.showmethe.speeddiallib.expand.ExpandManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val expands = ArrayList<ExpandIcon>()
        expands.add(ExpandIcon().setIcon(R.mipmap.baseline_search_white_24).setBackgroundTint(R.color.colorPrimaryDark).setTextLabel("2222"))
        expands.add(ExpandIcon().setIcon(R.mipmap.baseline_arrow_upward_white_24dp).setBackgroundTint(R.color.colorPrimaryDark).setTextLabel("333333"))
        ExpandManager.newBuilder().setExpandIcons(expands).motion(R.color.black,R.mipmap.close).bindTarget(crl).build()


    }
}

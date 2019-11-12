package com.showmethe.speeddial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.showmethe.speeddiallib.expand.Builder
import com.showmethe.speeddiallib.expand.ExpandIcon
import com.showmethe.speeddiallib.expand.ExpandManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val expands = ArrayList<ExpandIcon>()
        expands.add(ExpandIcon().setIcon(R.mipmap.baseline_search_white_24).setBackgroundTint(R.color.colorPrimaryDark).setTextLabel("项0"))
        expands.add(ExpandIcon().setIcon(R.mipmap.baseline_arrow_upward_white_24dp).setBackgroundTint(R.color.colorPrimaryDark).setTextLabel("项1"))
        ExpandManager.newBuilder().setSlide(Builder.Slide.BOTTOM).setExpandIcons(expands).motion(R.color.black,R.mipmap.close).bindTarget(crl).build()
        crl.setOnMenuClickListener {
            Toast.makeText(this,"点击下方第${it}项目",Toast.LENGTH_SHORT).show()
        }


        val expand2s = ArrayList<ExpandIcon>()
        expand2s.add(ExpandIcon().setIcon(R.mipmap.baseline_search_white_24).setBackgroundTint(R.color.colorPrimaryDark).setTextLabel("项0"))
        expand2s.add(ExpandIcon().setIcon(R.mipmap.baseline_arrow_upward_white_24dp).setBackgroundTint(R.color.colorPrimaryDark).setTextLabel("项1"))
        ExpandManager.newBuilder().setSlide(Builder.Slide.TOP).setExpandIcons(expand2s).motion(R.color.black,R.mipmap.close).bindTarget(crl2).build()
        crl2.setOnMenuClickListener {
            Toast.makeText(this,"点击上方第${it}项目",Toast.LENGTH_SHORT).show()
        }
    }
}

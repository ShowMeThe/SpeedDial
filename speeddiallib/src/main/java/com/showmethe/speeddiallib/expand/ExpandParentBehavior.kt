package com.showmethe.speeddiallib.expand

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.circularreveal.CircularRevealLinearLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton


/**
 * Author: showMeThe
 * Update Time: 2019/11/11 11:40
 * Package Name:com.showmethe.speeddiallib.expand
 */
open class ExpandParentBehavior(context: Context?, attrs: AttributeSet?)
    : CoordinatorLayout.Behavior<ExpandMenuChildLayout>(context, attrs) {

    override fun layoutDependsOn(parent: CoordinatorLayout, child: ExpandMenuChildLayout, dependency: View): Boolean {
        return dependency is FloatingActionButton
    }



    override fun onDependentViewChanged(parent: CoordinatorLayout, child: ExpandMenuChildLayout, dependency: View): Boolean {
        if(dependency is FloatingActionButton){
            dependency.setOnClickListener {
                if(child.isHidden()){
                    child.toVisible()
                    child.createMotion(dependency)
                    dependency.isExpanded = true
                }else{
                    child.toInVisible()
                    child.createMotion(dependency)
                    dependency.isExpanded = false
                }
            }
            dependentViewChanged(parent, child, dependency)

        }
        return true
    }


    open fun dependentViewChanged(parent: CoordinatorLayout, child: CircularRevealLinearLayout, dependency: View){

    }
}
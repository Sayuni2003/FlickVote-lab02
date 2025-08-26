package com.example.flickvote_lab02

import android.content.Intent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

fun setupBottomNav(activity: AppCompatActivity, selectedId: Int) {
    val navHome = activity.findViewById<TextView>(R.id.nav_home)
    val navVoting = activity.findViewById<TextView>(R.id.nav_voting)
    val navProfile = activity.findViewById<TextView>(R.id.nav_profile)

    // Reset all colors
    fun resetColors() {
        navHome.setTextColor(activity.getColor(R.color.white))
        navVoting.setTextColor(activity.getColor(R.color.white))
        navProfile.setTextColor(activity.getColor(R.color.white))
    }

    // Apply selected style
    resetColors()
    activity.findViewById<TextView>(selectedId).setTextColor(activity.getColor(R.color.active))

    // Handle clicks
    navHome.setOnClickListener {
        if (selectedId != R.id.nav_home) {
            activity.startActivity(Intent(activity, HomePage::class.java))
        }
    }

    navVoting.setOnClickListener {
        if (selectedId != R.id.nav_voting) {
            activity.startActivity(Intent(activity, VoteScreen::class.java))
        }
    }

    navProfile.setOnClickListener {
        if (selectedId != R.id.nav_profile) {
            activity.startActivity(Intent(activity, profile_screen::class.java))
        }
    }
}
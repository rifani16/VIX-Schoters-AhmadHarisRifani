package com.rakamin.newsapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import com.rakamin.newsapp.R
import com.rakamin.newsapp.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : AppCompatActivity() {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.home, R.string.bookmark)
    }

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        binding.viewPager.adapter = sectionsPagerAdapter
        TabLayoutMediator(
            binding.tabs, binding.viewPager
        ) { tab: TabLayout.Tab, position: Int ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()

        supportActionBar?.elevation = 0f
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                val moveIntent = Intent(this@HomeActivity, AboutActivity::class.java)
                moveIntent.putExtra(AboutActivity.EXTRA_NAME, "Ahmad Haris Rifani")
                moveIntent.putExtra(AboutActivity.EXTRA_USERNAME, "rifani16")
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
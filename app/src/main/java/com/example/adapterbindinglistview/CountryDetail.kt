package com.example.adapterbindinglistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.size.Scale
import com.example.adapterbindinglistview.databinding.ActivityCountryDetailBinding
import com.example.adapterbindinglistview.model.country.Country

class CountryDetail : AppCompatActivity() {

    lateinit var binding: ActivityCountryDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCountryDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var country = intent.getSerializableExtra("country") as Country

        binding.imgView.load(country.imgUrl) {
            placeholder(R.drawable.empty)
        }
        binding.nameText.text = country.countryName
        binding.areaText.text = "Area: ${country.area}"
        binding.popText.text = "Population: ${country.population}"
        binding.infoText.text = country.info
    }
}
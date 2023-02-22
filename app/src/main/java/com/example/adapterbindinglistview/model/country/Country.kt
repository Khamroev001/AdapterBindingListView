package com.example.adapterbindinglistview.model.country

data class Country(
    var countryName: String,
    var population: String,
    var area: String,
    var imgUrl: String,
    var info: String,
) : java.io.Serializable
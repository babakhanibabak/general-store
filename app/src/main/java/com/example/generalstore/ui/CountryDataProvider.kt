package com.example.generalstore.ui

object CountryDataProvider {
    fun provideCountries() = arrayListOf(
        CountryItem(id = "1", name = "Afghanistan"),
        CountryItem(id = "2", name = "Iran"),
        CountryItem(id = "3", name = "Iraq"),
        CountryItem(id = "4", name = "Turkey"),
        CountryItem(id = "5", name = "Germany"),
    )
}
package com.example.assignment4

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONArray
import java.io.IOException
import java.nio.charset.Charset

object CommonUtils {
    fun getJsonFromAssets(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            val `is` = context.getAssets().open(fileName)
            val size = `is`.available()
            val buffer = ByteArray(size)
            `is`.read(buffer)
            `is`.close()
            var char= Charset.forName("UTF-8")
            jsonString = String(buffer, char)
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }

        return jsonString
    }

    fun getCountryList(context: Context): ArrayList<CountryList> {
        var jsonFileString: String? = null
        jsonFileString =
            CommonUtils.getJsonFromAssets(context, "countrylist.json")

        val usersType = object : TypeToken<List<CountryList>>() {}.type
        val users = Gson().fromJson<ArrayList<CountryList>>(jsonFileString, usersType)
        return users
    }

}
package com.lucas.marvelheroes.utils

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

class MarvelHeroesConstants {

 companion object{
     const val BASE_URL = "http://gateway.marvel.com/v1/public/"
     val TS: String = Timestamp(System.currentTimeMillis()).time.toString()

     const val API_KEY: String = "56d896386d6aadae0d992b37fb7cd27a"
     private const val PRIVATE_KEY: String = "ea74b9ec4249579461dd1b2c76a2eaa6cc030b9d"
     const val LIMIT: String = "100"

     fun hash(): String {
         val input = "$TS$PRIVATE_KEY$API_KEY"
         val md = MessageDigest.getInstance("MD5")
         return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
     }
 }

}

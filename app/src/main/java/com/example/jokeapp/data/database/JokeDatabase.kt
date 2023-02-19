package com.example.jokeapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.jokeapp.data.database.model.JokeInfoDbModel

@Database(entities = [JokeInfoDbModel::class], version = 2)
abstract class JokeDatabase : RoomDatabase() {

    abstract fun JokeDao(): JokeDao

    companion object {

        private var db: JokeDatabase? = null
        private const val DB_NAME = "joke.db"
        private val LOCK = Any()

        fun getInstance(context: Context): JokeDatabase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        JokeDatabase::class.java,
                        DB_NAME
                    )
                        .build()
                db = instance
                return instance
            }
        }
    }
}
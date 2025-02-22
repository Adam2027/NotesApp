package com.example.notesapp

import android.app.Application
import androidx.room.Room
import com.example.notesapp.data.NoteDatabase

class NotesApplication : Application() {
    lateinit var database: NoteDatabase
        private set

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,
            "notes_database"
        ).build()
    }
} 
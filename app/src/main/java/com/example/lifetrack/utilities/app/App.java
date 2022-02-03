package com.example.lifetrack.utilities.app;

import android.app.Application;

import androidx.room.Room;

import com.example.lifetrack.data.NoteDatabase;


public class App extends Application {
    NoteDatabase db;
    static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        db = Room.databaseBuilder(getApplicationContext(), NoteDatabase.class, "taskbase").allowMainThreadQueries().build();
    }

    public NoteDatabase getDb() {
        return db;
    }

    public static App getApp() {
        return app;
    }


}


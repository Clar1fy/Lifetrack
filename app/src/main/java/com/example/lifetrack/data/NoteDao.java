package com.example.lifetrack.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lifetrack.models.NoteModel;

import java.util.List;

@Dao
public interface NoteDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(NoteModel noteModels);

    @Query("SELECT * FROM note_table ")
    LiveData<List<NoteModel>> getAllNotes();

    @Update
    void updateNotes(NoteModel noteModel);

    @Delete
    void delete(NoteModel noteModel);


    @Query("DELETE  FROM note_table")
    void deleteAll();


}

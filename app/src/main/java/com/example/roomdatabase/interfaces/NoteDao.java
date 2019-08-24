package com.example.roomdatabase.interfaces;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdatabase.models.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM `note table`")
    void deleteallnotes();

    @Query("SELECT * FROM `note table` ORDER BY priority DESC")
    LiveData<List<Note>> getallnotes();


}

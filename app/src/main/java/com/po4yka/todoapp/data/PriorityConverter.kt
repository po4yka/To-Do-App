package com.po4yka.todoapp.data

import androidx.room.TypeConverter
import com.po4yka.todoapp.data.models.Priority

class PriorityConverter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}

package com.sda.eventapp.web.mvc.mapper;

import com.sda.eventapp.model.Event;
import com.sda.eventapp.web.mvc.form.CreateEventForm;

public class EventMapper {
    public static Event toEntity(CreateEventForm form) {
        return new Event(form.getTitle(), form.getDescription(), form.getStartingDateTime(), form.getEndingDateTime());
    }
}
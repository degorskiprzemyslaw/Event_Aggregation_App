package com.sda.eventapp.mapper;

import com.sda.eventapp.dto.CommentWithBasicData;
import com.sda.eventapp.model.Comment;
import com.sda.eventapp.model.User;
import com.sda.eventapp.service.EventService;
import com.sda.eventapp.web.mvc.form.CreateCommentForm;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


//todo: bind with User
@RequiredArgsConstructor
public class CommentMapper {
    private final EventService eventService;

    public static List<CommentWithBasicData> toWebpage(List<Comment> comments) {
        return comments.stream()
                .map(comment -> CommentWithBasicData.builder()
                        .text(comment.getText())
                        .writingDate(comment.getWritingDate())
                        .build())
                .toList();

    }


    public Comment toEntity(CreateCommentForm form, long eventId) {
        return Comment.builder()
                .text(form.getText())
                .writingDate(LocalDateTime.now())
                .user(User.builder()
                        .username("ania")
                        .build())
                .event(eventService.findById(eventId))
                .build();
    }
}

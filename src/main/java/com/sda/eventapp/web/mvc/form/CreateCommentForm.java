package com.sda.eventapp.web.mvc.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateCommentForm {
    @Size(max = 500)
    @NotBlank
    private String text;
}

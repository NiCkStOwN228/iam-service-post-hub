package com.post_hub.iam_service.model.request.post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest implements Serializable {

    @NotBlank(message = "Title cannot be empty")
    public String title;
    @NotBlank(message = "Content cannot be empty")
    public String content;
    @NotNull(message = "Specify the number of likes")
    public Integer likes;

}

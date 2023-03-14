package com.laoma.model.media.dtos;

import com.laoma.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class CommentReplytDto {

    @IdEncrypt
    private Integer commentId;
    private String content;

}

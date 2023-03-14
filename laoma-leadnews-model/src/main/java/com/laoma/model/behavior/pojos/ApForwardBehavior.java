package com.laoma.model.behavior.pojos;

import com.laoma.model.annotation.IdEncrypt;
import lombok.Data;

import java.util.Date;

@Data
public class ApForwardBehavior {
    private Long id;
    @IdEncrypt
    private Integer entryId;
    private Integer articleId;
    private Integer dynamicId;
    private Date createdTime;
}
package com.laoma.model.behavior.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.laoma.model.annotation.IdEncrypt;
import lombok.Data;

import java.util.Date;

@Data
public class ApReadBehavior {
    private Long id;
    @IdEncrypt
    private Integer entryId;
    @IdEncrypt
    private Integer articleId;
    private Short count;
    private Integer readDuration;
    private Short percentage;
    private Short loadDuration;
    private Date createdTime;
    private Date updatedTime;
    @JsonIgnore
    private String burst;
}
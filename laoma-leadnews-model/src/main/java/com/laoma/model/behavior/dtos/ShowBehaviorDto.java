package com.laoma.model.behavior.dtos;


import com.laoma.model.annotation.IdEncrypt;
import com.laoma.model.article.pojos.ApArticle;
import lombok.Data;

import java.util.List;

@Data
public class ShowBehaviorDto {

    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    List<ApArticle> articleIds;

}

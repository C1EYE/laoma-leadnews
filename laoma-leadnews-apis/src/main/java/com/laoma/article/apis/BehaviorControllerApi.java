package com.laoma.article.apis;

import com.laoma.model.behavior.dtos.ShowBehaviorDto;
import com.laoma.model.common.dtos.ResponseResult;

public interface BehaviorControllerApi {

    /**
     * 保存用户点击文章的行为
     * @param dto
     * @return
     */
    ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}

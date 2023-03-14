package com.laoma.article.service;

import com.laoma.model.article.dtos.ArticleHomeDto;
import com.laoma.model.common.dtos.ResponseResult;

public interface AppArticleService {
    /**
     * type  1 加载更多  2 加载更新
     * @param dto
     * @param type
     * @return
     */
    ResponseResult load(ArticleHomeDto dto, Short type);
}

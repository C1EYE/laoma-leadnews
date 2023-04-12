package com.laoma.article.apis;

import com.laoma.model.article.dtos.ArticleInfoDto;
import com.laoma.model.common.dtos.ResponseResult;

public interface ArticleInfoControllerApi {

    ResponseResult loadArticleInfo(ArticleInfoDto dto);

    ResponseResult loadArticleBehavior(ArticleInfoDto dto);
}

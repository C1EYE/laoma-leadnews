package com.laoma.article.service;

import com.laoma.model.article.dtos.ArticleInfoDto;
import com.laoma.model.common.dtos.ResponseResult;

public interface AppArticleInfoService {
    /**
     * 加载文章详情
     */
    public ResponseResult getArticleInfo(Integer articleId);
    /**
     * 加载文章详情的初始化配置信息，比如关注，收藏，点赞，不喜欢
     */
    ResponseResult loadArticleBehavior(ArticleInfoDto dto);
}

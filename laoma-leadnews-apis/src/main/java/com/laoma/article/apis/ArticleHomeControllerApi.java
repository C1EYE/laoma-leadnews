package com.laoma.article.apis;

import com.laoma.model.article.dtos.ArticleHomeDto;
import com.laoma.model.common.dtos.ResponseResult;

public interface ArticleHomeControllerApi {

    /**
     * 加载首页文章
     * @param dto
     * @return
     */
    public ResponseResult load(ArticleHomeDto dto);

    /**
     * 加载更多
     * @param dot
     * @return
     */
    public ResponseResult loadMore(ArticleHomeDto dot);

    /**
     * 加载最新的文章信息
     * @param dto
     * @return
     */
    public ResponseResult loadNew(ArticleHomeDto dto);
}

package com.laoma.model.mappers.app;

import com.laoma.model.article.pojos.ApArticleContent;

public interface ApArticleContentMapper {
    ApArticleContent selectByArticleId(Integer articleId);
}
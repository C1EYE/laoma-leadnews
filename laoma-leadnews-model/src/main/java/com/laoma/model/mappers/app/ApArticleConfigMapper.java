package com.laoma.model.mappers.app;

import com.laoma.model.article.pojos.ApArticleConfig;

public interface ApArticleConfigMapper {
    ApArticleConfig selectByArticleId(Integer articleId);
}
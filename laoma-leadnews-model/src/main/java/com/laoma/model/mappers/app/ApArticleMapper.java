package com.laoma.model.mappers.app;

import com.laoma.model.article.dtos.ArticleHomeDto;
import com.laoma.model.article.pojos.ApArticle;
import com.laoma.model.user.pojos.ApUserArticleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApArticleMapper {
    List<ApArticle> loadArticleListByLocation(@Param("dto") ArticleHomeDto dto, @Param("type") Short type);

    List<ApArticle> loadArticleListByIdList(List<ApUserArticleList> list);
}

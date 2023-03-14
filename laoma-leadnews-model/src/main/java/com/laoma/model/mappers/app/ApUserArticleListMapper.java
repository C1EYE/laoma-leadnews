package com.laoma.model.mappers.app;

import com.laoma.model.article.dtos.ArticleHomeDto;
import com.laoma.model.user.pojos.ApUser;
import com.laoma.model.user.pojos.ApUserArticleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApUserArticleListMapper {
    List<ApUserArticleList> loadArticleIdListByUser(@Param("user") ApUser user,@Param("dto") ArticleHomeDto dto,@Param("type") Short type);
}

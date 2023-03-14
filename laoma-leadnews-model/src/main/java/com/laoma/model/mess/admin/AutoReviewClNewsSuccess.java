package com.laoma.model.mess.admin;


import com.laoma.model.article.pojos.ApArticleConfig;
import com.laoma.model.article.pojos.ApArticleContent;
import com.laoma.model.article.pojos.ApAuthor;
import lombok.Data;

@Data
public class AutoReviewClNewsSuccess {
    private ApArticleConfig apArticleConfig;
    private ApArticleContent apArticleContent;
    private ApAuthor apAuthor;

}

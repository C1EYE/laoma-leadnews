package com.laoma.article.test;

import com.laoma.article.ArticleJarApplication;
import com.laoma.article.service.AppArticleService;
import com.laoma.common.article.constans.ArticleConstans;
import com.laoma.model.common.dtos.ResponseResult;
import com.laoma.model.user.pojos.ApUser;
import com.laoma.utils.threadlocal.AppThreadLocalUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ArticleJarApplication.class)
@RunWith(SpringRunner.class)
public class ArticleTest {

    @Autowired
    private AppArticleService appArticleService;

    @Test
    public void testArticle(){
//        ApUser apUser = new ApUser();
//        apUser.setId(2104l);
//        AppThreadLocalUtils.setUser(apUser);
        ResponseResult result = appArticleService.load(null, ArticleConstans.LOADTYPE_LOAD_MORE);
        System.out.println(result.getData());
    }
}

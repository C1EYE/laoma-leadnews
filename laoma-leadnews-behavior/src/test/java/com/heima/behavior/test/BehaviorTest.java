package com.laoma.behavior.test;

import com.laoma.behavior.BehaviorJarApplication;
import com.laoma.behavior.service.AppShowBehaviorService;
import com.laoma.model.article.pojos.ApArticle;
import com.laoma.model.behavior.dtos.ShowBehaviorDto;
import com.laoma.model.user.pojos.ApUser;
import com.laoma.utils.threadlocal.AppThreadLocalUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = BehaviorJarApplication.class)
@RunWith(SpringRunner.class)
public class BehaviorTest {

    @Autowired
    private AppShowBehaviorService appShowBehaviorService;

    @Test
    public void testSave(){
        ApUser user = new ApUser();
        user.setId(1l);
        AppThreadLocalUtils.setUser(user);
        ShowBehaviorDto dto = new ShowBehaviorDto();
        List<ApArticle> list = new ArrayList<>();
        ApArticle apArticle = new ApArticle();
        apArticle.setId(200);
        list.add(apArticle);
        dto.setArticleIds(list);
        appShowBehaviorService.saveShowBehavior(dto);
    }
}

package com.laoma.behavior.controller.v1;

import com.laoma.article.apis.BehaviorControllerApi;
import com.laoma.behavior.service.AppShowBehaviorService;
import com.laoma.model.behavior.dtos.ShowBehaviorDto;
import com.laoma.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/behavior")
public class BehaviorController implements BehaviorControllerApi {

    @Autowired
    private AppShowBehaviorService appShowBehaviorService;

    @Override
    @RequestMapping("/save_behavior")
    public ResponseResult saveShowBehavior(ShowBehaviorDto dto) {
        return appShowBehaviorService.saveShowBehavior(dto);
    }
}

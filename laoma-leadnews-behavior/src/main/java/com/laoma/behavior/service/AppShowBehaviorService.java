package com.laoma.behavior.service;

import com.laoma.model.behavior.dtos.ShowBehaviorDto;
import com.laoma.model.common.dtos.ResponseResult;

public interface AppShowBehaviorService {
    ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}

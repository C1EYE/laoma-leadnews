package com.laoma.model.mappers.app;

import com.laoma.model.user.pojos.ApUser;

public interface ApUserMapper {
    ApUser selectById(Integer id);
}
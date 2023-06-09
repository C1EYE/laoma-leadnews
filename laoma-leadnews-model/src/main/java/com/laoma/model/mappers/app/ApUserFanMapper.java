package com.laoma.model.mappers.app;

import com.laoma.model.user.pojos.ApUserFan;
import org.apache.ibatis.annotations.Param;

public interface ApUserFanMapper {
    int insert(ApUserFan record);
    ApUserFan selectByFansId(@Param("burst") String burst, @Param("userId")Integer userId ,@Param("fansId") Long fansId);
    int deleteByFansId(@Param("burst")String burst,@Param("userId")Integer userId ,@Param("fansId")Long fansId);
}
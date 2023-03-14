package com.laoma.model.mappers.app;

import com.laoma.model.behavior.pojos.ApBehaviorEntry;
import org.apache.ibatis.annotations.Param;

public interface ApBehaviorEntryMapper {
    ApBehaviorEntry selectByUserIdOrEquipemntId(@Param("userId") Long userId,@Param("equipmentId") Integer equipmentId);
}

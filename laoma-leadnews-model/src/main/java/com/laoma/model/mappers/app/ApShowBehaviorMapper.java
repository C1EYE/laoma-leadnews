package com.laoma.model.mappers.app;

import com.laoma.model.behavior.pojos.ApShowBehavior;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApShowBehaviorMapper {
    List<ApShowBehavior> selectListByEntryIdAndArticleIds(@Param("entryId") Integer id, @Param("articleIds")Integer[] articleIds);

    void saveShowBehavior(@Param("articleIds") Integer[] articleIds, @Param("entryId") Integer entryId);
}

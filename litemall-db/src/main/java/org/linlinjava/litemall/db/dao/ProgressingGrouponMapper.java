package org.linlinjava.litemall.db.dao;

import org.linlinjava.litemall.db.domain.ProgressingGrouponVO;

import java.util.List;

public interface ProgressingGrouponMapper {
    List<ProgressingGrouponVO> getProgressingGroups(String productId);
}

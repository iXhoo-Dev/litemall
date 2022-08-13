package org.linlinjava.litemall.db.domain;

import lombok.Data;

/**
 * @author : ham
 * @date :2022/8/13 21:50
 * @description :
 * @modyified By:
 */
@Data
public class ProgressingGrouponVO {
    private Integer targetCount = 0;
    private Integer currentCount = 0;
    private Integer creatorUserId;
    private String creatorUserAvatar;
    private String creatorUserName;
}
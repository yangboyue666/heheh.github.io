/**
 * -----------------------------------
 * 林风社交论坛开源版本请务必保留此注释头信息
 * 开源地址: https://gitee.com/virus010101/linfeng-community
 * 商业版演示站点: https://www.linfeng.tech
 * 商业版购买联系技术客服
 * QQ:  3582996245
 * 可正常分享和学习源码，不得专卖或非法牟利！
 * Copyright (c) 2021-2023 linfeng all rights reserved.
 * 版权所有 ，侵权必究！
 * -----------------------------------
 */
package io.linfeng.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.linfeng.common.utils.PageUtils;
import io.linfeng.modules.admin.entity.SensitiveEntity;

import java.util.Map;

/**
 * 敏感词库信息表
 *
 * @author linfeng
 * @email 3582996245@qq.com
 * @date 2022-01-28 13:40:57
 */
public interface SensitiveService extends IService<SensitiveEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


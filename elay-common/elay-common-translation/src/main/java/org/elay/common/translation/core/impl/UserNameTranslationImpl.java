package org.elay.common.translation.core.impl;

import org.elay.common.core.service.UserService;
import org.elay.common.translation.annotation.TranslationType;
import org.elay.common.translation.constant.TransConstant;
import org.elay.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;

/**
 * 用户名翻译实现
 *
 * @author elay
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.USER_ID_TO_NAME)
public class UserNameTranslationImpl implements TranslationInterface<String> {

    private final UserService userService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof Long id) {
            return userService.selectUserNameById(id);
        }
        return null;
    }
}

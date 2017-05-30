/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.atrs.app.c2;

import jp.co.ntt.atrs.app.c0.MemberForm;
import jp.co.ntt.atrs.app.c0.MemberValidator;
import jp.co.ntt.atrs.domain.service.c2.MemberUpdateErrorCode;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.inject.Inject;

/**
 * 会員情報変更フォームのバリデータ。
 * @author NTT 電電花子
 */
@Component
public class MemberUpdateValidator implements Validator {

    /**
     * 会員情報フォームのバリデータ。
     */
    @Inject
    MemberValidator memberValidator;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return MemberUpdateForm.class.isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate(Object target, Errors errors) {

        MemberUpdateForm form = (MemberUpdateForm) target;
        MemberForm memberForm = form.getMemberForm();

        // パスワードチェック
        String confPassword = form.getNowPassword();
        String password = form.getPassword();
        String reEnterPassword = form.getReEnterPassword();

        if (StringUtils.hasLength(confPassword)) {
            if (StringUtils.hasLength(password)
                    && StringUtils.hasLength(reEnterPassword)) {
                if (!password.equals(reEnterPassword)) {

                    // パスワードと再入力したパスワードが違う場合エラー
                    errors.reject(MemberUpdateErrorCode.E_AR_C2_5001.code());
                }
            } else {

                // パスワードか再入力したパスワードが空欄の場合エラー
                errors.reject(MemberUpdateErrorCode.E_AR_C2_5002.code());
            }

        } else {
            if (StringUtils.hasLength(password)
                    || StringUtils.hasLength(reEnterPassword)) {

                // 現在のパスワードのみ空欄の場合エラー
                errors.reject(MemberUpdateErrorCode.E_AR_C2_5002.code());
            }
        }

        try {
            errors.pushNestedPath("memberForm");
            ValidationUtils
                    .invokeValidator(memberValidator, memberForm, errors);
        } finally {
            errors.popNestedPath();
        }

    }
}
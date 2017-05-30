/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.atrs.app.common.binding;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * 全コントローラ共通のバインダ初期化処理を行うクラス。
 * @author NTT 電電太郎
 */
@ControllerAdvice
public class GlobalBindingInitializer {

    /**
     * バインダーの初期化を行う。
     * <p>
     * Stringフィールドが空欄の場合に、空文字ではなくnullをバインドするよう設定する。
     * </p>
     * @param binder バインダ
     */
    @InitBinder
    public void initBinderControllerAdvice(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
}

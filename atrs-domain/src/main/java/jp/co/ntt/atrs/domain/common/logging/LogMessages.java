/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.logging;

import java.text.MessageFormat;

/**
 * ログメッセージを定義する列挙型。
 * @author NTT 電電太郎
 */
public enum LogMessages {

    /**
     * 不正リクエスト(パラメータ改竄)が発生した事を通知するログメッセージ。
     */
    E_AR_A0_L9001("e.ar.a0.L9001", "不正リクエスト(パラメータ改竄) {0}"),

    /**
     * データの更新(登録/削除)件数が想定件数が一致しない事を通知するログメッセージ。
     */
    E_AR_A0_L9002("e.ar.a0.L9002", "データ更新件数({0})と予想件数({1})の不一致"),

    /**
     * ログインが成功した事を通知するログメッセージ。
     */
    I_AR_A1_L0001("i.ar.a1.L0001", "お客様番号[{0}] ログイン成功"),

    /**
     * お客様番号に指定された値が不正である事が原因で、ログインが失敗した事を通知するログメッセージ。
     */
    I_AR_A1_L2001("i.ar.a1.L2001", "お客様番号[{0}] ログイン失敗(お客様番号不正)"),

    /**
     * パスワードに指定された値が不正である事が原因で、ログインが失敗した事を通知するログメッセージ。
     */
    I_AR_A1_L2002("i.ar.a1.L2002", "お客様番号[{0}] ログイン失敗(パスワード不正)"),

    /**
     * パスワードが一致しない事を通知するログメッセージ。
     */
    I_AR_A1_L2003("i.ar.a1.L2003", "お客様番号[{0}] ログイン失敗(パスワード不一致)"),

    /**
     * ログアウトが成功した事を通知するログメッセージ。
     */
    I_AR_A2_L0001("i.ar.a2.L0001", "お客様番号[{0}] ログアウト成功"),

    /**
     * レポート情報の取得失敗を通知するログメッセージ。
     */
    E_AR_D1_L0001("e.ar.d1.L0001", "お客様番号[{0}]のレポート情報取得失敗"),

    /**
     * レポートの作成失敗を通知するログメッセージ。
     */
    E_AR_D1_L0002("e.ar.d1.L0002", "お客様番号[{0}]のレポート作成失敗"),

    /**
     * ディレクトリ作成の失敗を通知するログメッセージ。
     */
    E_AR_D1_L0003("e.ar.d1.L0003", "ディレクトリ[{0}]の作成失敗"),

    /**
     * レポート作成条件抽出の失敗を通知するログメッセージ。
     */
    E_AR_D1_L0004("e.ar.d1.L0004", "レポート作成条件抽出失敗"),

    /**
     * 不明なファイル名を警告するログメッセージ。
     */
    W_AR_D1_L0001("w.ar.d1.L0001", "ファイル[{0}]は存在しません"),

    /**
     * 受信したJMSメッセージ型が一致しない事を通知するログメッセージ。
     */
    W_AR_D1_L0002("w.ar.d1.L0002", "受信したJMSメッセージ型[{0}]と想定メッセージ型[{1}]の不一致"),

    /**
     * 受信した顧客番号が不正（NULLか桁数が一致しない）である事を通知するログメッセージ。
     */
    W_AR_D1_L0003("w.ar.d1.L0003", "受信したJMSメッセージのお客様番号[{0}]が不正");

    /**
     * メッセージコード。
     */
    private final String code;

    /**
     * メッセージ内容。
     */
    private final String message;

    /**
     * コンストラクタ。
     * @param code メッセージコード
     * @param message メッセージ内容
     */
    LogMessages(String code, String message) {
        this.code = code;
        this.message = "[" + code + "] " + message;
    }

    /**
     * メッセージコードを取得する。
     * @return メッセージコード
     */
    public String getCode() {
        return code;
    }

    /**
     * メッセージ内容を取得する。
     * @return メッセージ内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * パラメータを指定してメッセージ内容を取得する。
     * @param args パラメータ
     * @return メッセージ内容
     */
    public String getMessage(Object... args) {
        return MessageFormat.format(message, args);
    }
}
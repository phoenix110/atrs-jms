/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.c1;

import jp.co.ntt.atrs.domain.model.Member;

/**
 * 会員情報登録を行うServiceインタフェース。
 * @author NTT 電電花子
 */
public interface MemberRegisterService {

    /**
     * 会員情報を登録する。
     * <p>
     * 登録時に発出されたお客様番号を格納した会員情報インスタンスが返される。
     * </p>
     * @param member 会員情報
     * @return Member お客様番号が格納された会員情報
     */
    Member register(Member member);

}

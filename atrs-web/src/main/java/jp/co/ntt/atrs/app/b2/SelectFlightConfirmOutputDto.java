/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b2;

import jp.co.ntt.atrs.app.b0.SelectFlightDto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 選択フライト確認画面出力用DTO。
 * @author NTT 電電次郎
 */
public class SelectFlightConfirmOutputDto implements Serializable {

    /**
     * シリアルバージョンUID。
     */
    private static final long serialVersionUID = 2222939610095033934L;

    /**
     * 選択したフライト情報リスト。
     */
    private List<SelectFlightDto> selectFlightDtoList;

    /**
     * 復路選択ボタン表示フラグ。
     */
    private boolean hasHomeward;

    /**
     * 選択したフライト情報リスト を取得する。
     * @return 選択したフライト情報リスト
     */
    public List<SelectFlightDto> getSelectFlightDtoList() {
        return selectFlightDtoList;
    }

    /**
     * 選択したフライト情報リスト を設定する。
     * @param selectFlightDtoList 選択したフライト情報リスト
     */
    public void setSelectFlightDtoList(List<SelectFlightDto> selectFlightDtoList) {
        this.selectFlightDtoList = selectFlightDtoList;
    }

    /**
     * 復路選択ボタン表示フラグ を取得する。
     * @return 復路選択ボタン表示フラグ
     */
    public boolean isHasHomeward() {
        return hasHomeward;
    }

    /**
     * 復路選択ボタン表示フラグ を設定する。
     * @param hasHomeward 復路選択ボタン表示フラグ
     */
    public void setHasHomeward(boolean hasHomeward) {
        this.hasHomeward = hasHomeward;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }
}

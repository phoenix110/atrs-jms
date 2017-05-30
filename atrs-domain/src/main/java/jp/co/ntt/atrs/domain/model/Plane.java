/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 航空機情報。
 * @author NTT 電電太郎
 */
public class Plane implements Serializable {

    /**
     * シリアルバージョンUID。
     */
    private static final long serialVersionUID = -2976813933439957678L;

    /**
     * 機種。
     */
    private String craftType;

    /**
     * 席数(一般席)
     */
    private Integer nSeatNum;

    /**
     * 席数(特別席)
     */
    private Integer sSeatNum;

    /**
     * 機種を取得する。
     * @return 機種
     */
    public String getCraftType() {
        return craftType;
    }

    /**
     * 機種を設定する。
     * @param craftType 機種
     */
    public void setCraftType(String craftType) {
        this.craftType = craftType;
    }

    /**
     * 席数(一般席)を取得する。
     * @return 席数(一般席)
     */
    public Integer getNSeatNum() {
        return nSeatNum;
    }

    /**
     * 席数(一般席)を設定する。
     * @param seatNum 席数(一般席)
     */
    public void setNSeatNum(Integer seatNum) {
        nSeatNum = seatNum;
    }

    /**
     * 席数(特別席)を取得する。
     * @return 席数(特別席)
     */
    public Integer getSSeatNum() {
        return sSeatNum;
    }

    /**
     * 席数(特別席)を設定する。
     * @param seatNum 席数(特別席)
     */
    public void setSSeatNum(Integer seatNum) {
        sSeatNum = seatNum;
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

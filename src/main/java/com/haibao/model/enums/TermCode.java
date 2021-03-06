package com.haibao.model.enums;

/**
 * Created by haibao on 2018/1/22.
 */
public enum TermCode {
    FIRST((byte) 0, "第一学期"),
    SECOND((byte) 1, "第二学期");


    TermCode(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private byte code;
    private String desc;

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}

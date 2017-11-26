package com.hencoder.hencoderpracticedraw1.bean;

/**
 * [Description]
 * <p>
 * [How to use]
 * <p>
 * [Tips]
 *
 * @author Created by Zhimin.Huang on 2017/11/26.
 * @since 1.0.0
 */
public class PieChatBean {

    private float persent;
    private int colorRes;
    private String name;

    public PieChatBean(float persent, int colorRes, String name) {
        this.persent = persent;
        this.colorRes = colorRes;
        this.name = name;
    }

    public float getPersent() {
        return persent;
    }

    public void setPersent(float persent) {
        this.persent = persent;
    }

    public int getColorRes() {
        return colorRes;
    }

    public void setColorRes(int colorRes) {
        this.colorRes = colorRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

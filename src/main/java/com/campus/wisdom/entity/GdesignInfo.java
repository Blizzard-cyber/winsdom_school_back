package com.campus.wisdom.entity;

/**
 * @ClassName GdesignInfo
 * @Description
 * @Author Abel
 * @Date 2022/7/3 18:40
 * @Version 1.0
 **/
public class GdesignInfo {
    private String id;
    private String title;
    private String demand;

    public GdesignInfo() {
    }

    public GdesignInfo(String id, String title, String demand) {
        this.id = id;
        this.title = title;
        this.demand = demand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return "GdesignInfo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", demand='" + demand + '\'' +
                '}';
    }
}
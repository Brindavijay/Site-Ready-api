package com.icon.item.dto;

import org.springframework.data.annotation.Id;

/**
 * Created by A541351 on 10/23/2016.
 */
public class Item extends BaseItem{


    private String longDesc;

    private Specification specification;

    private String labelInfo;


    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String getLabelInfo() {
        return labelInfo;
    }

    public void setLabelInfo(String labelInfo) {
        this.labelInfo = labelInfo;
    }
}

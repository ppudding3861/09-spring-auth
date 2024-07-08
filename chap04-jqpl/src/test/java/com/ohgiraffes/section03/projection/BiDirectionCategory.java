package com.ohgiraffes.section03.projection;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "bidirection_category")
@Table(name = "tbl_category")
public class BiDirectionCategory {

    @Id
    @Column(name = "category_code")
    private int categoryCode;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "ref_category_code")
    private int refCategoryCode;

    @OneToMany(mappedBy = "categoryCode")
    private List<BiDirectionMenu> menuList;

    public BiDirectionCategory() {
    }

    public BiDirectionCategory(int categoryCode, String categoryName, int refCategoryCode, List<BiDirectionMenu> menuList) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
        this.menuList = menuList;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(int refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    public List<BiDirectionMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<BiDirectionMenu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "BiDirectionCategory{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}

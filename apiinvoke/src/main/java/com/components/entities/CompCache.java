package com.components.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * 缓存表
 *
 * @author JHui.Yang
 * @version $Id CompCache.java, v 0.1 2018-11-13 10:40 JHui.Yang Exp $$
 */
@Entity
@Table(name="comp_cache")
public class CompCache implements Serializable {

    private static final long serialVersionUID = 24L;

    @Id
    @Column(columnDefinition = "varchar(200) NOT NULL COMMENT 'PK'")
    private String id;


    @Column(columnDefinition = "longtext NOT NULL COMMENT '内容'")
    private String val;


    @Column(name="valid_date" ,columnDefinition = "timestamp NULL COMMENT '有效期截止时间' ")
    private Date validDate;

    @Column(name="gmt_create" ,columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间' ")
    private Date gmtCreate;


    @Column(name="gmt_update" ,columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '修改时间' ")
    private Date gmtUpdate;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

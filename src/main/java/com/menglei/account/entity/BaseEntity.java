package com.menglei.account.entity;

import java.io.Serializable;

/**
  * @className BaseEntity
  * Description 基础实体
  * @date 2018/8/16 11:36
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 4458617931513088934L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建人和创建时间
     */
    private Long createTime;
    private String creator;

    /**
     * 修改人和修改时间
     */
    private Long updateTime;
    private String updater;

    /**
     * 描述
     */
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", creator='" + creator + '\'' +
                ", updateTime=" + updateTime +
                ", updater='" + updater + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

package com.zdx.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章实体
 */
@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private Integer articleId;  //文章id
    private Integer categoryId; //分类id
    private Integer id;    //作者id
    private byte articleState;//文章状态,0:草稿, 1:发布,2：删除.

    private String title;   //文章标题
    private String content; //文章内容
    private Date createTime;    //创建时间
    private Date updateTime;    //更新时间

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte getArticleState() {
        return articleState;
    }

    public void setArticleState(byte articleState) {
        this.articleState = articleState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
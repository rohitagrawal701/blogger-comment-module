package com.blogger.comment.document;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comment")
public class Comment extends BaseDocument {

    private String blogId;

    private String commenterId;

    private String description;

    private Date createdOn;

    private Date updatedOn;

    private int likes;

    private int dislikes;

    public Comment() {
        super();
    }

    public Comment(final String blogId, final String commenterId,
            final String description, final Date createdOn,
            final Date updatedOn, final int likes, final int dislikes) {
        super();
        this.blogId = blogId;
        this.commenterId = commenterId;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(final String blogId) {
        this.blogId = blogId;
    }

    public String getCommenterId() {
        return commenterId;
    }

    public void setCommenterId(final String commenterId) {
        this.commenterId = commenterId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(final Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(final int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(final int dislikes) {
        this.dislikes = dislikes;
    }

}

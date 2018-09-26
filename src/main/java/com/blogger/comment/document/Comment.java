package com.blogger.comment.document;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comment")
public class Comment extends BaseDocument {

    private String blogId;

    private String commenterId;

    private String description;

    private Date createdOn;

    private Date updatedOn;

    private List<String> usersLiked;

    private List<String> usersDisliked;

    public Comment() {
        super();
    }

    public Comment(final String blogId, final String commenterId,
            final String description, final Date createdOn,
            final Date updatedOn, final List<String> usersLiked,
            final List<String> usersDisliked) {
        super();
        this.blogId = blogId;
        this.commenterId = commenterId;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.usersLiked = usersLiked;
        this.usersDisliked = usersDisliked;
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

    public List<String> getUsersLiked() {
        return usersLiked;
    }

    public void setUsersLiked(final List<String> usersLiked) {
        this.usersLiked = usersLiked;
    }

    public List<String> getUsersDisliked() {
        return usersDisliked;
    }

    public void setUsersDisliked(final List<String> usersDisliked) {
        this.usersDisliked = usersDisliked;
    }

}
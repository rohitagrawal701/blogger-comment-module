package com.blogger.comment.dto;

import java.io.Serializable;

public class CommentDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String blogId;

    private String commenterId;

    private String description;

    private int likes;

    private int dislikes;

    public CommentDto() {
    }

    public CommentDto(final String id, final String blogId,
            final String commenterId, final String description, final int likes,
            final int dislikes) {
        super();
        this.id = id;
        this.blogId = blogId;
        this.commenterId = commenterId;
        this.description = description;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
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
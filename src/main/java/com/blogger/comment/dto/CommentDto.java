package com.blogger.comment.dto;

import java.io.Serializable;
import java.util.List;

public class CommentDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String blogId;

    private String commenterId;

    private String description;

    private List<String> usersLiked;

    private List<String> usersDisliked;

    public CommentDto() {
    }

    public CommentDto(final String id, final String blogId,
            final String commenterId, final String description,
            final List<String> usersLiked, final List<String> usersDisliked) {
        super();
        this.id = id;
        this.blogId = blogId;
        this.commenterId = commenterId;
        this.description = description;
        this.usersLiked = usersLiked;
        this.usersDisliked = usersDisliked;
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
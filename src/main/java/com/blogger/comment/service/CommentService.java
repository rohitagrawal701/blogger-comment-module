package com.blogger.comment.service;

import java.util.List;

import com.blogger.comment.dto.CommentDto;

public interface CommentService {

    List<CommentDto> fetchAllComments();

    CommentDto fetchCommentById(String commentId);

    boolean deleteCommentById(String commentId);

    CommentDto updateComment(CommentDto commentDto);

    CommentDto insertComment(CommentDto commentDto);

}

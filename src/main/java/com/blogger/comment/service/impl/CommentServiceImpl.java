package com.blogger.comment.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.comment.document.Comment;
import com.blogger.comment.dto.CommentDto;
import com.blogger.comment.repository.CommentRepository;
import com.blogger.comment.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public List<CommentDto> fetchAllComments() {
        final List<CommentDto> commentDtoList = new ArrayList<>();
        final List<Comment> commentList = commentRepository.findAll();
        dozerBeanMapper.map(commentList, commentDtoList, "comment");
        return commentDtoList;
    }

    @Override
    public CommentDto fetchCommentById(final String commentId) {
        final CommentDto commentDto = new CommentDto();
        final Comment comment = commentRepository.findOne(commentId);
        dozerBeanMapper.map(comment, commentDto, "comment");
        return commentDto;
    }

    @Override
    public boolean deleteCommentById(final String commentId) {
        commentRepository.delete(commentId);
        return true;
    }

    @Override
    public CommentDto updateComment(final CommentDto commentDto) {
        final Comment comment = new Comment();
        dozerBeanMapper.map(commentDto, comment, "comment");
        comment.setUpdatedOn(Calendar.getInstance().getTime());
        commentRepository.save(comment);
        return commentDto;
    }

    @Override
    public CommentDto insertComment(final CommentDto commentDto) {
        final Comment comment = new Comment();
        dozerBeanMapper.map(commentDto, comment,
                "comment-create-dto-to-entity");
        comment.setCreatedOn(Calendar.getInstance().getTime());
        comment.setUpdatedOn(Calendar.getInstance().getTime());
        commentRepository.insert(comment);
        commentDto.setId(comment.getId());
        return commentDto;
    }

}

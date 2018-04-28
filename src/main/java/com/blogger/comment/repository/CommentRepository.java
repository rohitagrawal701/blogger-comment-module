package com.blogger.comment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blogger.comment.document.Comment;

public interface CommentRepository
        extends MongoRepository<Comment, String>, CommentRepositoryCustom {

}

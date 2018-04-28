package com.blogger.comment.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.blogger.comment.repository.CommentRepositoryCustom;

public class CommentRepositoryImpl extends BaseRepositoryImpl
        implements CommentRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

}

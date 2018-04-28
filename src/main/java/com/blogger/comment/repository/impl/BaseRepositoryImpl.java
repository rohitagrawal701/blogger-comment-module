package com.blogger.comment.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.blogger.comment.document.BaseDocument;
import com.blogger.comment.repository.BaseRepositoryCustom;

public class BaseRepositoryImpl implements BaseRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<? extends BaseDocument> findManyByQuery(final Query query,
            final Class<? extends BaseDocument> object) {
        return mongoTemplate.find(query, object.asSubclass(BaseDocument.class));
    }

    @Override
    public BaseDocument findOneByQuery(final Query query,
            final Class<? extends BaseDocument> object) {
        return mongoTemplate.findOne(query,
                object.asSubclass(BaseDocument.class));
    }

    @Override
    public BaseDocument findAndModify(final Query query, final Update update,
            final Class<? extends BaseDocument> object) {
        return mongoTemplate.findAndModify(query, update,
                object.asSubclass(BaseDocument.class));
    }

}

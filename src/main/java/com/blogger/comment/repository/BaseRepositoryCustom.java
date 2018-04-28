package com.blogger.comment.repository;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.blogger.comment.document.BaseDocument;

public interface BaseRepositoryCustom {

    List<? extends BaseDocument> findManyByQuery(Query query,
            Class<? extends BaseDocument> object);

    BaseDocument findOneByQuery(Query query,
            Class<? extends BaseDocument> object);

    BaseDocument findAndModify(Query query, Update update,
            Class<? extends BaseDocument> object);
}

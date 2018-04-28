package com.blogger.comment.document;

import org.springframework.data.annotation.Id;

public class BaseDocument {

    @Id
    private String id;

    public BaseDocument() {
    }

    public BaseDocument(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

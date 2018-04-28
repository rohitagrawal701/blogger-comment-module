package com.blogger.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.comment.dto.CommentDto;
import com.blogger.comment.response.RESTResponse;
import com.blogger.comment.service.CommentService;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/comment", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse insertComment(@RequestBody final CommentDto commentDto) {
        return RESTResponse.ok(commentService.insertComment(commentDto));
    }

    @RequestMapping(value = "/comment/{comment-id}", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchCommentById(
            @PathVariable("comment-id") final String commentId) {
        return RESTResponse.ok(commentService.fetchCommentById(commentId));
    }

    @RequestMapping(value = "/comment", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse fetchAllComments() {
        return RESTResponse.ok(commentService.fetchAllComments());
    }

    @RequestMapping(value = "/comment/{comment-id}", method = RequestMethod.DELETE, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse deleteComment(
            @PathVariable("comment-id") final String commentId) {
        return RESTResponse.ok(commentService.deleteCommentById(commentId));
    }

    @RequestMapping(value = "/comment", method = RequestMethod.PUT, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public RESTResponse updateComment(@RequestBody final CommentDto commentDto) {
        return RESTResponse.ok(commentService.updateComment(commentDto));
    }
    
    

}

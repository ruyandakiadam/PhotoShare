package com.PhotoShare.backend.controller;

import com.PhotoShare.backend.model.Comment;
import com.PhotoShare.backend.model.Photo;
import com.PhotoShare.backend.service.CommentService;
import com.PhotoShare.backend.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Le on 4/30/2016.
 */
@RestController
@RequestMapping("/rest")
public class CommentResources {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment/add", method = RequestMethod.POST)
    public void addComment (@RequestBody Comment comment) {
        Photo photo = photoService.findByPhotoId(comment.getPhotoId());
        List<Comment> commentList=photo.getCommentList();
        comment.setPhoto(photo);
//        if (commentList==null) {
//            commentList = new ArrayList<Comment>();
//        }
//        commentList.add(comment);
//        photo.setCommentList(commentList);
//        photoService.save(photo);
        commentService.save(comment);
    }
}

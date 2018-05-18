package com.PhotoShare.backend.service.impl;

import com.PhotoShare.backend.dao.CommentDao;
import com.PhotoShare.backend.model.Comment;
import com.PhotoShare.backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Le on 4/30/2016.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    public Comment save(Comment comment) {
        return commentDao.save(comment);
    }

    public Comment findOne (Long commentId) {
        return commentDao.findOne(commentId);
    }

    public List<Comment> findByPhotoId (Long photoId) {
        return commentDao.findByPhotoId(photoId);
    }

}

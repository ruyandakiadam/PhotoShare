package com.PhotoShare.backend.controller;

import com.PhotoShare.backend.model.Photo;
import com.PhotoShare.backend.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lede on 4/29/16.
 */

@RestController
@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping("/allPhotos")
    public List<Photo> getAllPhotos () {
        return photoService.findAll();
    }

}

package com.PhotoShare.backend.dao;

import com.PhotoShare.backend.model.Photo;
import com.PhotoShare.backend.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Le on 4/24/2016.
 */
@Repository
public interface PhotoDao extends CrudRepository<Photo, Long> {
    Photo save(Photo photo);

    List<Photo> findByUser(User user);

    List<Photo> findAll();

    Photo findByPhotoId(Long photoId);
}

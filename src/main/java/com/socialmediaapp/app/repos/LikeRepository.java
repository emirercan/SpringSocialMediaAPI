package com.socialmediaapp.app.repos;

import com.socialmediaapp.app.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like,Long> {
    List<Like> findByUserIdAndPostId(Long userId, Long PostId);

    List<Like> findByUserId(Long userId);

    List<Like> findByPostId(Long postId);
}

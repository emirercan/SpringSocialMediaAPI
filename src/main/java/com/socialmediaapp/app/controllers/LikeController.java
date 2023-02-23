package com.socialmediaapp.app.controllers;

import com.socialmediaapp.app.entities.Comment;
import com.socialmediaapp.app.entities.Like;
import com.socialmediaapp.app.request.CommentUpdateRequest;
import com.socialmediaapp.app.request.LikeCreateRequest;
import com.socialmediaapp.app.services.LikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/like")
public class LikeController {
    LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping
    public List<Like> getAllLike(@RequestParam Optional<Long> userId, @RequestParam Optional<Long> postId){
        return likeService.getAllLikeWithParam(userId,postId);
    }

    @PostMapping
    public Like createOneLike(@RequestBody LikeCreateRequest likeCreateRequest){
        return likeService.createOneLike(likeCreateRequest);
    }

    @GetMapping("/{likeId}")
    public Like getOneComment(@PathVariable Long likeId){
        return likeService.getOneLikeById(likeId);
    }

    @DeleteMapping("/{likeId}")
    public void deleteOneLike(@PathVariable Long likeId){
        likeService.deleteOneLikeById(likeId);
    }
}

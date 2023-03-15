package kz.dar.academy.backend.postcoreapi.controller;

import kz.dar.academy.backend.postcoreapi.model.PostRequest;
import kz.dar.academy.backend.postcoreapi.model.PostResponse;
import kz.dar.academy.backend.postcoreapi.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }

    @PutMapping
    public PostResponse updatePost(@RequestParam String postId, @RequestBody PostRequest postRequest) {
        return postService.updatePost(postRequest);
    }

    @GetMapping
    public PostResponse getPostById(@RequestParam String postId) {
        return postService.getPostById(postId);
    }

    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }

    @DeleteMapping
    public void deletePostById(@RequestParam String postId) {
        postService.deletePostById(postId);
    }

}

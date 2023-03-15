package kz.dar.academy.backend.postcoreapi.service.post;

import kz.dar.academy.backend.postcoreapi.model.PostRequest;
import kz.dar.academy.backend.postcoreapi.model.PostResponse;

import java.util.List;

public interface PostService {
    PostResponse createPost(PostRequest postRequest);
    PostResponse updatePost(PostRequest postRequest);
    PostResponse getPostById(String postId);
    List<PostResponse>getAllPosts();
    void deletePostById(String postId);

}

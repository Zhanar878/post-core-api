package kz.dar.academy.backend.postcoreapi.service.deprecated;

import kz.dar.academy.backend.postcoreapi.model.PostModel;

import java.util.List;

public interface PostServiceOld {
    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePostById(String PostId, PostModel postModel);
    void deletePostById(String postId);
}

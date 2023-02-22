package kz.dar.academy.backend.postcoreapi;

import kz.dar.academy.backend.postcoreapi.model.PostModel;
import kz.dar.academy.backend.postcoreapi.service.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {
    private static final HashMap<String, PostModel> postMap=new HashMap<>();
    static {
        PostModel postModel1=new PostModel(UUID.randomUUID().toString(), "Client1", "Recipient1",
                "PostItem A", "On the way");
        PostModel postModel2=new PostModel(UUID.randomUUID().toString(), "Client2", "Recipient2",
                "PostItem B", "Arrived");
        PostModel postModel3=new PostModel(UUID.randomUUID().toString(), "Client3", "Recipient3",
                "PostItem C", "Ready to ship");
        postMap.put(postModel1.getPostId(),postModel1);
        postMap.put(postModel2.getPostId(),postModel2);
        postMap.put(postModel3.getPostId(),postModel3);
    }
    @Override
    public void createPost(PostModel postModel) {
postModel.setPostId(UUID.randomUUID().toString());
postMap.put(postModel.getPostId(), postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public PostModel getPostById(String postId) {
        return postMap.get(postId) ;
    }

    @Override
    public void updatePostById(String postId, PostModel postModel) {
postModel.setPostId(postId);
postMap.put(postId, postModel);
    }

    @Override
    public void deletePostById(String postId) {
postMap.remove(postId);
    }
}

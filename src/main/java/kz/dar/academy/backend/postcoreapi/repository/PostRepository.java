package kz.dar.academy.backend.postcoreapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {
    List<PostEntity> getPostEntityByPostId(String postId);

    PostEntity getPostEntityByClientId(String clientId);

    List<PostEntity> getPostEntityBy();

    @Transactional
    void deletePostEntityByPostId(String postId);
}


package kz.dar.academy.backend.postcoreapi.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name="post list")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PostEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column (unique = true)
    private String postId;
    @Column(nullable = false, length = 50)
    private String clientId;
    @Column(nullable = false, length = 50)
    private String postRecipientId;
    @Column(nullable = false, length = 50)
    private String postItem;
    @Column(nullable = false, length = 50)
    private String status;


}

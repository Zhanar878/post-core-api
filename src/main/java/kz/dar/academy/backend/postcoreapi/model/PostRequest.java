package kz.dar.academy.backend.postcoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class PostRequest {
    @NotNull(message = "The field cannot be empty")
    private String postId;
    private String clientId;
    private String postRecipientId;
    private String postItem;
    private String status;
}

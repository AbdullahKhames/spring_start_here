package ssh.demos.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ssh.demos.repositories.Comment;


@Service
@Slf4j
public class CommentService {
    public void publishComment(Comment comment){
        log.info("Publishing comment:{}", comment.getText());
    }
}

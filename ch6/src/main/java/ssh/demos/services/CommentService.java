package ssh.demos.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ssh.demos.aspects.ToLog;
import ssh.demos.repositories.Comment;


@Service
@Slf4j
public class CommentService {
    @ToLog
    public String publishComment(Comment comment){
        log.info("Publishing comment:{}", comment.getText());
        return "Success";
    }
    @ToLog
    public void deleteComment(Comment comment) {
        log.info("Deleting comment:{}", comment.getText());
    }
    public void editComment(Comment comment) {
        log.info("Editing comment:{}", comment.getText());
    }
}

package ssh.demos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ssh.demos.config.ProjectConfig;
import ssh.demos.repositories.Comment;
import ssh.demos.services.CommentService;

/**
 * Hello world!
 *
 */
@Slf4j
public class App
{
    public static void main( String[] args )
    {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        log.info(service.getClass().toString());
        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");
        service.publishComment(comment);
    }
}

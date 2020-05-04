package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    //Call the getAllComments() method in the Repository and obtain a List of all the comments in the database
    public List<Comment> getAllComments() {
        return commentRepository.getAllComments();
    }

    //The method calls the uploadComment() method in the Repository and passes the comment to be persisted in the database
    public void uploadComment(Comment comment) {
        commentRepository.uploadComment(comment);
    }


    //The method calls the getComment() method in the Repository and passes the id of the comment to be fetched
    public Comment getComment(Integer commentId) {
        return commentRepository.getComment(commentId);
    }

}

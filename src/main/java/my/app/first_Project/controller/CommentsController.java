package my.app.first_Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CommentsController {
    @GetMapping("/articles/{id}/articleComment")
    public String showAllComments(
            @PathVariable("id") int articleId,
            Model model
    ) {
        model.addAttribute("articleId", articleId);
        return "/articles/comments/comment_view";
    }

    @GetMapping("/articles/{id}/articleComments/{articlecommentId}/delete")
    public String deleteComment(
            @PathVariable("id")int articleId,
            @PathVariable("articlecommentId")int commentId,
            Model model
    ) {
        Map<String, Integer> id = new HashMap<>();
        id.put("articleId", articleId);
        id.put("commentId", commentId);
        model.addAttribute("id", id);
        return"/articles/comments/delete_ok";
    }
}

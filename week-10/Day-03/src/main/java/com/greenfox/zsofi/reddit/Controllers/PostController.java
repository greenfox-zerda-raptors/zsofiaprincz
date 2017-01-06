package com.greenfox.zsofi.reddit.Controllers;


import com.greenfox.zsofi.reddit.Entity.Post;
import com.greenfox.zsofi.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("postService", postService.listPosts());
        model.addAttribute("date_format", "dd/MM/yyyy");
        return "posts";
    }

    @GetMapping(value = "/add")
    public String addContentForm(Model model) {
        model.addAttribute("post", new Post());
        return "add";
    }

    @PostMapping(value = "/add")
    public String addContentSubmit(@ModelAttribute Post post) {
        postService.addPost(post);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{postId}/upVote", method = RequestMethod.GET)
    public String upVote(@PathVariable("postId") int id) {
        postService.upVote(id);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{postId}/downVote", method = RequestMethod.GET)
    public String downVote(@PathVariable("postId") int id) {
        postService.downVote(id);
        return "redirect:/posts/";

    }


}



package com.greenfox.zsofi.reddit.Controllers;


import com.greenfox.zsofi.reddit.Entity.Post;
import com.greenfox.zsofi.reddit.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("postService", postService.listPosts());
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
        return "redirect:/";
    }

}

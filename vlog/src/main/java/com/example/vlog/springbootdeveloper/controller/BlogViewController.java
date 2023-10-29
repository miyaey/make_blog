package com.example.vlog.springbootdeveloper.controller;

import com.example.vlog.springbootdeveloper.dto.ArticleListViewResponse;
import com.example.vlog.springbootdeveloper.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Controller
public class BlogViewController { // /articles GET 요청을 처리할 코드를 작성하여 블로그 글 전체 리스트를 담은 뷰 반환
private final BlogService blogService;

@GetMapping("/articles")
    public String getArticles(Model model){  //@ModelAttribute
    List<ArticleListViewResponse> articles = blogService.findAll().stream()
            .map(ArticleListViewResponse::new)
            .collect(Collectors.toList());
    model.addAttribute("articles", articles);

    return "articleList";
}
}

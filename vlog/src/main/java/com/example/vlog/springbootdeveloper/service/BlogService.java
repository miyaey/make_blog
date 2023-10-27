package com.example.vlog.springbootdeveloper.service;

import com.example.vlog.springbootdeveloper.domain.Article;
import com.example.vlog.springbootdeveloper.dto.AddArticleRequest;
import com.example.vlog.springbootdeveloper.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service //빈으로 등록
public class BlogService {
    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}

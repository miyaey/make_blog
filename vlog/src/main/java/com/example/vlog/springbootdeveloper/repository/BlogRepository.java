package com.example.vlog.springbootdeveloper.repository;

import com.example.vlog.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

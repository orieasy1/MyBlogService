package com.mysite.myblog.repository;

import com.mysite.myblogsite.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

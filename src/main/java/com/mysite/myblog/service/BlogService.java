package com.mysite.myblog.service;

import com.mysite.myblogsite.domain.Article;
import com.mysite.myblogsite.dto.AddArticleRequest;
import com.mysite.myblogsite.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}

package com.mysite.myblog.dto;

import com.mysite.myblog.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity() {
        return  Article.builder()
                .title(title)
                .content(content)
                .build();
    }

}

/*
package njbrealla.back.controller;

import lombok.RequiredArgsConstructor;
import njbrealla.back.domain.Article;
import njbrealla.back.dto.AddArticleRequest;
import njbrealla.back.repository.BlogRepository;
import njbrealla.back.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle9@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);

    }
}
*/

package njbrealla.back.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import njbrealla.back.domain.Article;
import njbrealla.back.dto.AddArticleRequest;
import njbrealla.back.dto.ArticleResponse;

import njbrealla.back.repository.BlogRepository;
import njbrealla.back.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    // RequestBody로 요쳥 본문 값 매핑
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest
    request) {
        // '(' => '9' 를 입력했음 ;
        Article savedArticle = blogService.save(request);

        // 요청한 자원이 성공적으로 생성되었고 저장된 블로그 글 정보를 응답 객체에 담아 전송
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);

    }


    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticleResponse>>findAllArticles() {
        List<ArticleResponse> article = blogService.findAll()
                .stream()
                .map(ArticleResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(article);
    }

    @GetMapping("/api/articles/{id}")
    public ResponseEntity<ArticleResponse>findArticle(@PathVariable long id) {
        Article article = blogService.findById(id);

        return ResponseEntity.ok()
                .body( new ArticleResponse(article));
    }

}
/*
* GET 요청이 오면 글 전체를 조회하는 findALL()메서드를
* 호출한 다음 응답용 객체인 ArticleResponse로 파싱해 body에 담아
* 클라이언트에게 전송한다.*/

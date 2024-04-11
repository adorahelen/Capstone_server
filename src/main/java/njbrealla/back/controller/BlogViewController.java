package njbrealla.back.controller;

import lombok.RequiredArgsConstructor;
import njbrealla.back.domain.Article;
import njbrealla.back.dto.ArticleListViewResponse;
import njbrealla.back.dto.ArticleViewResponse;
import njbrealla.back.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model; // Model 쓸때 자동추가 안되서 찾아서 넣어줘야함
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {

        private final BlogService blogService;

        @GetMapping("/articles")
        public String getArticles(Model model) {
            List<ArticleListViewResponse> articles = blogService.findAll()
                    .stream()
                    .map(ArticleListViewResponse::new)
                    .toList();
            model.addAttribute("articles", articles);
            // 모델에 블로그 글 리스트 저장 MVC 모델에서 M : MODEL

            return "articleList";
        }

        @GetMapping("/articles/{id}")
        public String getArticle(@PathVariable Long id, Model modle) {
            Article article = blogService.findById(id);
            modle.addAttribute("article", new ArticleViewResponse(article));

            return "article";
        }
}

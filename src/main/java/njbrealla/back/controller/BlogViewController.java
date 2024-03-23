package njbrealla.back.controller;

import lombok.RequiredArgsConstructor;
import njbrealla.back.domain.Article;
import njbrealla.back.dto.ArticleListViewResponse;
import njbrealla.back.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model; // Model 쓸때 자동추가 안되서 찾아서 넣어줘야함
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

            return "articleList";
        }

}

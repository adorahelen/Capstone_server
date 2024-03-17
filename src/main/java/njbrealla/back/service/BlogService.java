/*
package njbrealla.back.service;

import lombok.RequiredArgsConstructor;
import njbrealla.back.domain.Article;
import njbrealla.back.dto.AddArticleRequest;
import njbrealla.back.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save (AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
// 빈을 생성한다. 서블릿 컨테이너에 등록한다. 데이터베이스에 저장한다.
*/
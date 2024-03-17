package njbrealla.back.repository;

import njbrealla.back.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;



    public interface BlogRepository extends JpaRepository<Article, Long> {

    }


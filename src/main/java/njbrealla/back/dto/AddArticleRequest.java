/*
package njbrealla.back.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import njbrealla.back.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
// 이 메소드는 추후 블로그 글을 추가할 때 저장할 엔티티로 변환하는 용도로 사용한다.
// DTO는 데이터를 교환하기 위해서 사용하는 객체이다.
// DAO는 데이터를 조회하고 수정하는 데 사용하는 객체이다.*/

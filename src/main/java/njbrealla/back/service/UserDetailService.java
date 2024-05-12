package njbrealla.back.service;

import lombok.RequiredArgsConstructor;
import njbrealla.back.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {
    //  상기 두 커멋이세 엔티티 작업과 리포지터리 작업을 완료 헀으니,
    // 스프링 시큐리티에서 로그인 진행할 때 사용자 정보를 가져오는 코드 작성하면 끝.

    private final UserRepository userRepository;

    // 사용자 이름 email 으로 사용자 정보를 가져오는 메서드
    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email));
    }

}

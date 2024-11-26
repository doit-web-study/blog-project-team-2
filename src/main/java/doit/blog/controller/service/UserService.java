package doit.blog.controller.service;

import doit.blog.Repository.user.UserRepository;
import doit.blog.controller.user.dto.UserSignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserSignUpRequest signUpRequest) {
        userRepository.save(signUpRequest.toEntity());
    }


}

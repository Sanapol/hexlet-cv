package io.hexlet.cv.service;

import io.hexlet.cv.dto.user.UserPasswordDto;
import io.hexlet.cv.handler.exception.MatchingPasswordsException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String passwordChange(UserPasswordDto userPasswordDto) {
        //сравнение старого пароля на корректность//

        if (!userPasswordDto.getNewPassword().equals(
                userPasswordDto.getRepeatNewPassword())) {
            throw new MatchingPasswordsException("passwords must match");
        } else {
            return "";//Сохранение в репозиторий//
        }
    }

}

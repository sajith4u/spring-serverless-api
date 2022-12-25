package com.mobiclabs.demo.api.functions;

import com.mobiclabs.demo.api.domain.User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FileProcessController {

  private List<User> allUsers = new ArrayList<>();

  @Bean
  public Supplier<List<User>> getAllUsers() {
    log.info("REQUEST | Get All Request");
    return () -> allUsers;
  }

  @Bean
  public Consumer<User> addUser() {
    log.info("REQUEST | Add User Request ");
    return (user) -> allUsers.add(user);
  }


}

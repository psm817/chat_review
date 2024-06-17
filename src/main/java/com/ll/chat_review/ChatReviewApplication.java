package com.ll.chat_review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing	// @CreatedDate, @ModifiedDate 사용하기 위해서
public class ChatReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatReviewApplication.class, args);
	}

}

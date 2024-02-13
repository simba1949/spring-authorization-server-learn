package vip.openpark.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @since 2024/2/6 21:53
 */
@RestController
public class MessageController {
	@GetMapping("/messages")
	public String[] getMessages() {
		return new String[]{"Message 1", "Message 2", "Message 3"};
	}
}
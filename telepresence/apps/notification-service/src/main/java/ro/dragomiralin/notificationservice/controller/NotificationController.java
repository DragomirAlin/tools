package ro.dragomiralin.notificationservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.dragomiralin.notificationservice.domain.Notification;
import ro.dragomiralin.notificationservice.domain.NotificationRequest;

import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {

    @PostMapping
    public ResponseEntity<Notification> sendNotification(@RequestBody NotificationRequest notification) {
        log.info("Notification has been sent to account with email={}", notification.getEmail());
        return ResponseEntity.ok(Notification.builder()
                .id(new Random().nextLong())
                .email(notification.getEmail())
                .message(notification.getMessage())
                .status(Notification.Status.SENT)
                .build());
    }
}

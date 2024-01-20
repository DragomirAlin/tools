package ro.dragomiralin.notificationservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Notification {
    private Long id;
    private String message;
    private String email;
    private Status status;

    public enum Status {
        PENDING,
        SENT,
        FAILED
    }
}

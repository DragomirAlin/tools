package ro.dragomiralin.deposit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.dragomiralin.deposit.domain.Notification;
import ro.dragomiralin.deposit.domain.NotificationRequest;

@FeignClient(value = "notification", url = "http://notification-service:8882")
public interface NotificationClient {

    @RequestMapping(method = RequestMethod.POST, value = "/notifications", produces = "application/json")
    Notification send(@RequestBody NotificationRequest notificationRequest);
}

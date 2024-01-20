package ro.dragomiralin.deposit.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.dragomiralin.deposit.client.AccountClient;
import ro.dragomiralin.deposit.client.NotificationClient;
import ro.dragomiralin.deposit.domain.*;

@Slf4j
@RestController
@RequestMapping("/deposits")
@RequiredArgsConstructor
public class DepositController {
    private final AccountClient accountClient;
    private final NotificationClient notificationClient;

    @PostMapping
    public ResponseEntity<Deposit> makeDeposit(@RequestBody DepositRequest depositRequest) {
        Account account = accountClient.getByAccountId(depositRequest.getAccountId());

        log.info("Deposit has been made to account with id={}", account);
        notificationClient.send(NotificationRequest.builder()
                .email(account.getEmail())
                .message("Deposit has been made to account with IBAN " + account.getIban())
                .build());

        return ResponseEntity.ok(Deposit.builder()
                .id(account.getId())
                .accountId(account.getId())
                .amount(depositRequest.getAmount())
                .status(Deposit.Status.DEPOSITED)
                .build());
    }
}

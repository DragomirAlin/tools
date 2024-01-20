package ro.dragomiralin.accountservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.dragomiralin.accountservice.domain.Account;

@Slf4j
@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable String id) {
        log.info("Account with id={} has been retrieved.", id);
        return ResponseEntity.ok(Account.builder()
                .id(Long.valueOf(id))
                .name("Dragomir Alin")
                .email("test@da.io")
                .iban("RO123456789")
                .build());
    }

}

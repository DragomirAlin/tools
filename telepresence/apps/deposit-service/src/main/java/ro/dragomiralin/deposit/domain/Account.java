package ro.dragomiralin.deposit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Account {
    private Long id;
    private String name;
    private String email;
    private String iban;
}


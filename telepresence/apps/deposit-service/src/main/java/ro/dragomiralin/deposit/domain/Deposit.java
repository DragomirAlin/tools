package ro.dragomiralin.deposit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Deposit {
    private Long id;
    private Long accountId;
    private Double amount;
    private Status status;

    public enum Status {
        PENDING,
        DEPOSITED,
        FAILED
    }
}

package ro.dragomiralin.deposit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.dragomiralin.deposit.domain.Account;

@FeignClient(value = "account", url = "http://localhost:8880")
public interface AccountClient {

    @RequestMapping(method = RequestMethod.GET, value = "/accounts/{accountId}", produces = "application/json")
    Account getByAccountId(@PathVariable("accountId") Long accountId);
}

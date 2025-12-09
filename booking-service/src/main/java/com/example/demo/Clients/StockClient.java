
package com.example.demo.Clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Training Project.
 *
 * @author Luis López
 * @see <a href="https://github.com/luislopez-dev">https://github.com/luislopez-dev</a>
 */
@FeignClient(name = "stock-microservice")
public interface StockClient {

    @RequestMapping("api/stock/{code}")
    boolean stockAvailable(@PathVariable String code);
}

package tk.gushizone.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.gushizone.dubbo.api.ProductService;
import tk.gushizone.dubbo.pojo.Product;

/**
 * @author gushizone@gmail.com
 * @date 2020-11-01 00:34
 */
@RestController
public class ConsumerController {

    @Reference
    private ProductService productService;

    @GetMapping("/publish")
    public Product publish(@RequestParam String name) {

        Product product = new Product();
        product.setName(name);

        return productService.publish(product);
    }


}

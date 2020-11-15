package tk.gushizone.dubbo.provider.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import tk.gushizone.dubbo.api.ProductService;
import tk.gushizone.dubbo.pojo.Product;

/**
 *
 * @author gushizone@gmail.com
 * @date 2020-11-01 00:23
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product publish(Product product) {

        log.warn("product publish");
        return product;
    }
}
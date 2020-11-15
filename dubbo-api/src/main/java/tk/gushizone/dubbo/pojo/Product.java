package tk.gushizone.dubbo.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * FIXME：一定要实现 Serializable 接口
 * @author gushizone@gmail.com
 * @date 2020-11-01 00:04
 */
@Data
public class Product implements Serializable {

    private String name;
    private BigDecimal price;

}

package org.example.product;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.maxBy;

public class ProductStreams {

    public Map<String, Optional<Product>> task26(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        maxBy(Comparator.comparing(Product::getPrice))
                ));
    }

    public List<Product> task27(List<Product> products, int n){
        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(n)
                .collect(Collectors.toList());
    }

}

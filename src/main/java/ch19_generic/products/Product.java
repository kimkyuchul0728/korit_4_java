package ch19_generic.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
// @ToString   //  @Data를 달아서 해결하는 방법, alt + ins를 통해 toString() 메서드를 재정의하는 방법도 있습니다.
public class Product<T> {
    private String productName;
    private T productInfo;

    @Override
    public String toString() {
        return "Product(" +
                "productName=" + productName + ", productInfo=" + productInfo +
                ')';
    }
}

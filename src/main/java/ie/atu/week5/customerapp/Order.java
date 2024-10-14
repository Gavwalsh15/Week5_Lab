package ie.atu.week5.customerapp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "orders")
public class Order {

    @Id
    private String id;
    @PositiveOrZero
    private int orderCode;
    @NotBlank
    private String orderDetails;
    private String orderDate;
    @NotBlank
    private String customerId; // Reference to the associated customer
}

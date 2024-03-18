package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HomePageItemDTO {
    private Long notificationId;
    private String itemNo;
    private String itemCode;
    private String description;
    private Double quantity;
    private Double estimatedPrice;
    private String purchasingGroup;
    private String status;
    private String action;

    // Constructors

}


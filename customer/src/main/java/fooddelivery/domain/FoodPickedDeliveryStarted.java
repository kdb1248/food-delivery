package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodPickedDeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String address;
}

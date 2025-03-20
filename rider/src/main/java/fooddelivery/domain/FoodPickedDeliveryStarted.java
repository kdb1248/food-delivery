package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FoodPickedDeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String address;

    public FoodPickedDeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public FoodPickedDeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event

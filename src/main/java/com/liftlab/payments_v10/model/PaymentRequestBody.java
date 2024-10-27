package com.liftlab.payments_v10.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentRequestBody {

    private String paymentMethodId;
    private String partyId;
    private double amount;

}

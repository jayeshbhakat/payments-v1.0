package com.liftlab.payments_v10.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponseBody {

    private String paymentId;
    private String message;
}

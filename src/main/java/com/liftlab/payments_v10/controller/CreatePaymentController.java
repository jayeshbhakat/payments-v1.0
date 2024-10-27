package com.liftlab.payments_v10.controller;

import com.liftlab.payments_v10.model.PaymentRequestBody;
import com.liftlab.payments_v10.model.PaymentResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
public class CreatePaymentController {

    @PostMapping
    public PaymentResponseBody createPayment(@RequestBody PaymentRequestBody paymentRequestBody){
        return PaymentResponseBody.builder()
                .paymentId("1234")
                .message("payment done!")
                .build();
    }
}

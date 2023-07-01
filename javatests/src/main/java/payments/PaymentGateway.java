package payments;

import payments.PaymentResponse;

public interface PaymentGateway {

    PaymentResponse requestPayment(com.platzi.javatests.payments.PaymentRequest request);
}
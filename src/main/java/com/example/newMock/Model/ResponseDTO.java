package com.example.newMock.Model;
import lombok.*;

import java.math.BigDecimal;


@Data

public class ResponseDTO {
    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private int balance;
    private BigDecimal maxLimit;

}

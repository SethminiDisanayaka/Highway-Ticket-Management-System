package com.example.payment_service.convert;


import com.example.payment_service.dto.PaymentDTO;
import com.example.payment_service.entity.PaymentEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataConvert {

    private final ModelMapper modelMapper;



    public PaymentDTO paymentEntityConvertPaymentDTO(PaymentEntity paymentEntity){
        return modelMapper.map(paymentEntity, PaymentDTO.class);
    }

    public PaymentEntity paymentDTOConvertPaymentEntity(PaymentDTO paymentDTO){
        return modelMapper.map(paymentDTO, PaymentEntity.class);
    }

}

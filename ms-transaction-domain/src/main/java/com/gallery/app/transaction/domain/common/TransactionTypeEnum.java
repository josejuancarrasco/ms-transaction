package com.gallery.app.transaction.domain.common;



import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionTypeEnum {
	
    COMPRA("COMPRA"),
    
    VENTA("VENTA"),
    
    OFERTA("OFERTA");

    private final String value;

}

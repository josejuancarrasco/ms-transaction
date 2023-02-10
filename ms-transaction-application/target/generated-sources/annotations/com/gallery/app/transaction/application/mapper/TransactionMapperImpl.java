package com.gallery.app.transaction.application.mapper;

import com.gallery.app.transaction.domain.common.TransactionTypeEnum;
import com.gallery.app.transaction.domain.model.TransactionDomain;
import com.transaction.app.application.rest.model.TransactionDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-10T14:48:57+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDto toDto(TransactionDomain transactionDomain) {
        if ( transactionDomain == null ) {
            return null;
        }

        TransactionDto transactionDto = new TransactionDto();

        if ( transactionDomain.getArtworkId() != null ) {
            transactionDto.setArtworkId( transactionDomain.getArtworkId() );
        }
        if ( transactionDomain.getDate() != null ) {
            transactionDto.setDate( transactionDomain.getDate() );
        }
        if ( transactionDomain.getPrice() != null ) {
            transactionDto.setPrice( transactionDomain.getPrice() );
        }
        if ( transactionDomain.getTransactionId() != null ) {
            transactionDto.transactionId( transactionDomain.getTransactionId() );
        }
        if ( transactionDomain.getTransactionType() != null ) {
            transactionDto.transactionType( transactionTypeEnumToTransactionTypeEnum( transactionDomain.getTransactionType() ) );
        }

        return transactionDto;
    }

    @Override
    public TransactionDomain toDomain(TransactionDto trasactionDto) {
        if ( trasactionDto == null ) {
            return null;
        }

        TransactionDomain transactionDomain = new TransactionDomain();

        if ( trasactionDto.getArtworkId() != null ) {
            transactionDomain.setArtworkId( trasactionDto.getArtworkId() );
        }
        if ( trasactionDto.getDate() != null ) {
            transactionDomain.setDate( trasactionDto.getDate() );
        }
        if ( trasactionDto.getPrice() != null ) {
            transactionDomain.setPrice( trasactionDto.getPrice() );
        }
        if ( trasactionDto.getTransactionId() != null ) {
            transactionDomain.setTransactionId( trasactionDto.getTransactionId() );
        }
        if ( trasactionDto.getTransactionType() != null ) {
            transactionDomain.setTransactionType( transactionTypeEnumToTransactionTypeEnum1( trasactionDto.getTransactionType() ) );
        }

        return transactionDomain;
    }

    @Override
    public List<TransactionDto> asListDto(List<TransactionDomain> transactionDomainList) {
        if ( transactionDomainList == null ) {
            return null;
        }

        List<TransactionDto> list = new ArrayList<TransactionDto>( transactionDomainList.size() );
        for ( TransactionDomain transactionDomain : transactionDomainList ) {
            list.add( toDto( transactionDomain ) );
        }

        return list;
    }

    protected com.transaction.app.application.rest.model.TransactionDto.TransactionTypeEnum transactionTypeEnumToTransactionTypeEnum(TransactionTypeEnum transactionTypeEnum) {
        if ( transactionTypeEnum == null ) {
            return null;
        }

        com.transaction.app.application.rest.model.TransactionDto.TransactionTypeEnum transactionTypeEnum1;

        switch ( transactionTypeEnum ) {
            case COMPRA: transactionTypeEnum1 = com.transaction.app.application.rest.model.TransactionDto.TransactionTypeEnum.COMPRA;
            break;
            case OFERTA: transactionTypeEnum1 = com.transaction.app.application.rest.model.TransactionDto.TransactionTypeEnum.OFERTA;
            break;
            case VENTA: transactionTypeEnum1 = com.transaction.app.application.rest.model.TransactionDto.TransactionTypeEnum.VENTA;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + transactionTypeEnum );
        }

        return transactionTypeEnum1;
    }

    protected TransactionTypeEnum transactionTypeEnumToTransactionTypeEnum1(com.transaction.app.application.rest.model.TransactionDto.TransactionTypeEnum transactionTypeEnum) {
        if ( transactionTypeEnum == null ) {
            return null;
        }

        TransactionTypeEnum transactionTypeEnum1;

        switch ( transactionTypeEnum ) {
            case COMPRA: transactionTypeEnum1 = TransactionTypeEnum.COMPRA;
            break;
            case OFERTA: transactionTypeEnum1 = TransactionTypeEnum.OFERTA;
            break;
            case VENTA: transactionTypeEnum1 = TransactionTypeEnum.VENTA;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + transactionTypeEnum );
        }

        return transactionTypeEnum1;
    }
}

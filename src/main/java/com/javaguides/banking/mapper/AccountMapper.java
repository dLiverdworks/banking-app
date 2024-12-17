package com.javaguides.banking.mapper;

import com.javaguides.banking.dto.AccountDto;
import com.javaguides.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getPhoneNumber(),
                accountDto.getBalance()
        );
    }

    public static AccountDto mapToAccountDto(Account account){
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getPhoneNumber(),
                account.getBalance()
        );
    }

}

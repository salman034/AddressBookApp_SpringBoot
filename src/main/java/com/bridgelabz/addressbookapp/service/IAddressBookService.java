package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressRecord();

    AddressBookData getAddressRecordById(Integer id);

    AddressBookData addAddressRecord(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressRecordById(Integer id, AddressBookDTO addressBookDTO);

    void deleteAddressRecordById(Integer id);


}

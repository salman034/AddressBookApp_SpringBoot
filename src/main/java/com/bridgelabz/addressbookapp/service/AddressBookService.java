package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class AddressBookService implements IAddressBookService{

    private final AtomicLong counter = new AtomicLong();

    List<AddressBookData> addressBookList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressRecord() {
        return addressBookList;
    }

    @Override
    public AddressBookData getAddressRecordById(Integer id) {
        return addressBookList.get(id-1);
    }

    @Override
    public AddressBookData addAddressRecord(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData((int)counter.incrementAndGet(), addressBookDTO);
        addressBookList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressRecordById(Integer id, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookList.get(id-1);
        addressBookData.setName(addressBookDTO.name);
        addressBookData.setlName(addressBookDTO.lName);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookData.setEmail(addressBookDTO.email);
        addressBookData.setZip(addressBookDTO.zip);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);

        addressBookList.set(id-1, addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressRecordById(Integer id) {
        addressBookList.remove(id-1);
    }

}

package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addressList = addressBookService.getAddressRecord();
        ResponseDTO responseDTO = new ResponseDTO("Get call successfully Done", addressList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("id") int id) {
        AddressBookData addressBookData = addressBookService.getAddressRecordById(id);
        ResponseDTO responseDTO = new ResponseDTO("Get call by Id successfully Done", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addAddressBook(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.addAddressRecord(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Add call successfully Done", addressBookData);
        return new ResponseEntity<ResponseDTO> (responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookById(@PathVariable("id") int id, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.updateAddressRecordById(id, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Update call successfully Done", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookById(@PathVariable("id") int id) {
        addressBookService.deleteAddressRecordById(id);
        ResponseDTO responseDTO = new ResponseDTO("Delete call successfully Done",
                "Deleted Id : " + id);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }



}
//https://screenrec.com/share/32YUswpAD7
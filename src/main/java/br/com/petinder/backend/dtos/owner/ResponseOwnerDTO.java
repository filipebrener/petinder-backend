package br.com.petinder.backend.dtos.owner;

import br.com.petinder.backend.domains.Owner;
import br.com.petinder.backend.dtos.address.ResponseAddressDTO;

import java.util.Date;

public class ResponseOwnerDTO {

    private Long id;

    private String cpf;

    private String name;

    private String celNumber;

    private String email;

    private Date birthDate;

    private ResponseAddressDTO address;

    public ResponseOwnerDTO(Owner owner) {
        this.id = owner.getId();
        this.name = owner.getName();
        this.cpf = owner.getCpf();
        this.email = owner.getEmail();
        this.celNumber = owner.getCelNumber();
        this.address = owner.getAddress() != null ? new ResponseAddressDTO(owner.getAddress()) : null;
        this.birthDate = owner.getBirthDate();
    }

    public ResponseOwnerDTO() {
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(String celNumber) {
        this.celNumber = celNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ResponseAddressDTO getAddress() {
        return address;
    }

    public void setAddress(ResponseAddressDTO address) {
        this.address = address;
    }
}

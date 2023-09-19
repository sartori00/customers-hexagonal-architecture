package br.com.sartori.customers.adapters.in.controller.dto;

public record CustomerResponse(String name, String cpf, Boolean isValidCpf, CustomerAddressResponse address) {
}
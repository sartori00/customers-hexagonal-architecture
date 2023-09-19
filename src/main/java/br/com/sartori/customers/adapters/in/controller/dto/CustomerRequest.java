package br.com.sartori.customers.adapters.in.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record CustomerRequest(@NotBlank String name,
                              @NotBlank String cpf,
                              @NotBlank String zipCode) {
}

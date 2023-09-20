package br.com.sartori.customers.application.ports.out;

public interface SendCpfForValidationOutputPort {

    void send(final String cpf);
}

package com.ramondev.CadastroAPI.service;

import com.ramondev.CadastroAPI.entity.Cliente;
import com.ramondev.CadastroAPI.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }


}

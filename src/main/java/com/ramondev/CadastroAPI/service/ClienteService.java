package com.ramondev.CadastroAPI.service;

import com.ramondev.CadastroAPI.entity.Cliente;
import com.ramondev.CadastroAPI.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getFindCliente(){
        return clienteRepository.findAll();
    }

}

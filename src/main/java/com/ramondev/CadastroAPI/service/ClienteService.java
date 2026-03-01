package com.ramondev.CadastroAPI.service;

import com.ramondev.CadastroAPI.entity.Cliente;
import com.ramondev.CadastroAPI.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Cliente> byFindId(Long id){
        return clienteRepository.findById(id);
    }

}

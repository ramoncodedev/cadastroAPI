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

    public void removeById(Long id){
        clienteRepository.deleteById(id);
    }

    public Cliente updateCliente(Long id, Cliente dadosAtualizados){
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Cliente não encontrado"));
        cliente.setNome(dadosAtualizados.getNome());
        cliente.setEmail(dadosAtualizados.getEmail());
        cliente.setTelefone(dadosAtualizados.getTelefone());

        return clienteRepository.save(cliente);
    }

}

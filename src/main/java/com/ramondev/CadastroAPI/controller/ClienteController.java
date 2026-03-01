package com.ramondev.CadastroAPI.controller;


import com.ramondev.CadastroAPI.entity.Cliente;
import com.ramondev.CadastroAPI.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public Cliente createCliente( @RequestBody Cliente cliente){
        return service.saveCliente(cliente);
    }

    @GetMapping
    public List<Cliente> findList(){
        return service.getFindCliente();
    }
}

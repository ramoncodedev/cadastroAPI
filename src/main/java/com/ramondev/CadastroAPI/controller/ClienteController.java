package com.ramondev.CadastroAPI.controller;


import com.ramondev.CadastroAPI.entity.Cliente;
import com.ramondev.CadastroAPI.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public Cliente createCliente( @RequestBody Cliente cliente){
        return service.saveCliente(cliente);
    }
}

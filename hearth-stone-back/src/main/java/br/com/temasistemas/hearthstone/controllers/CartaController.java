package br.com.temasistemas.hearthstone.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.temasistemas.hearthstone.dtos.CartaDTO;
import br.com.temasistemas.hearthstone.services.CartaService;

@CrossOrigin
@RestController
@RequestMapping("/carta")
public class CartaController {
    @Autowired
    private CartaService service;
    
    @GetMapping
    public ResponseEntity<List<CartaDTO>> procurar(
        @PathParam("id") Long id,
        @PathParam("nome") String nome,
        @PathParam("descricao") String descricao,
        @PathParam("ataque") Integer ataque,
        @PathParam("defesa") Integer defesa,
        @PathParam("tipo") String tipo,
        @PathParam("classe") String classe
    ){
        return ResponseEntity.ok().body(service.procurarPorParametros(id,nome,descricao,ataque,defesa,tipo,classe));
    }
}

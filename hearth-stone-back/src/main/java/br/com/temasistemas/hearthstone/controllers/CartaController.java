package br.com.temasistemas.hearthstone.controllers;

import static java.util.Objects.isNull;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

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

    @PostMapping
    public ResponseEntity<CartaDTO> salvar(@RequestBody @Valid CartaDTO carta,UriComponentsBuilder uriBuilder){
        CartaDTO dto = service.salvar(carta); 
        return ResponseEntity.created(uriBuilder.path("/carta/:id").buildAndExpand(dto.id).toUri()).body(dto);
    }

    @PutMapping
    public ResponseEntity<CartaDTO> atualizar(@RequestBody @Valid CartaDTO carta,UriComponentsBuilder uriBuilder){
        CartaDTO dto = service.salvar(carta); 
        return ResponseEntity.created(uriBuilder.path("/carta/:id").buildAndExpand(dto.id).toUri()).body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        if(isNull(id)){
            return ResponseEntity.badRequest().build();
        }
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}

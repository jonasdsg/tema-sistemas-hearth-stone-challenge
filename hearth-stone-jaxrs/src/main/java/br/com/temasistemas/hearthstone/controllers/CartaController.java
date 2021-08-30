package br.com.temasistemas.hearthstone.controllers;

import static java.util.Objects.isNull;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import br.com.temasistemas.hearthstone.dtos.CartaDTO;
import br.com.temasistemas.hearthstone.services.CartaService;

@Path("/carta")
public class CartaController {

	private CartaService service;

	public CartaController() {
		this.service = new CartaService();
	}

	@GET
	@Path("/{id}")
	public Response procurarPorId(@PathParam("id") Long id) {
		if (isNull(id)) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok()
				.type(APPLICATION_JSON)
				.entity(service.procurarPorId(id))
				.build();
	}

	@GET
	@Produces(APPLICATION_JSON)
	public Response procurar(
			@QueryParam("id") Long id, 
			@QueryParam("nome") String nome,
			@QueryParam("descricao") String descricao,
			@QueryParam("ataque") Integer ataque,
			@QueryParam("defesa") Integer defesa, 
			@QueryParam("tipo") String tipo, 
			@QueryParam("classe") String classe) {
		return Response.ok()
				.entity(service.procurarPorParametros(id, nome, descricao, ataque, defesa, tipo, classe))
				.type(APPLICATION_JSON)
				.build();
	}

	@POST
	public Response salvar(@Valid CartaDTO carta) {
		if(isNull(carta)) {
			return Response.status(Response.Status.BAD_REQUEST)
					.build();
		}
		return Response.status(Response.Status.CREATED)
				.type(APPLICATION_JSON)
				.entity(service.salvar(carta))
				.build();
	}

	@PUT
	public Response atualizar(@Valid CartaDTO carta) {
		return Response.status(Response.Status.CREATED)
				.entity(service.atualizar(carta))
				.type(APPLICATION_JSON)
				.build();
	}

	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") Long id) {
		if (isNull(id)) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		service.delete(id);
		return Response.ok().build();
	}
}

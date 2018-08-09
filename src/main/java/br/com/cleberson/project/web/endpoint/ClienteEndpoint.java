package br.com.cleberson.project.web.endpoint;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleberson.project.domain.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteEndpoint {

	@GetMapping(produces = { MediaTypes.HAL_JSON_VALUE })
	public List<Cliente> recuperaCliente() {
		return Arrays.asList(new Cliente("José", 35), new Cliente("Maria", 31));
	}
}

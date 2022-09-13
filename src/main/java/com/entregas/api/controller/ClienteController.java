package com.entregas.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entregas.api.domain.modal.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/cliente")
	public List<Cliente> getList() {

		Cliente cc = new Cliente();
		Cliente cc1 = new Cliente();
		cc.setId(1L);
		cc.setName("Belmiro");
		cc.setEmail("hhh@hhh.com");
		cc.setTelefone("111122-8899");

		cc1.setId(2L);
		cc1.setName("Belmiro TTTTT");
		cc1.setEmail("hhh@hhh.com");
		cc1.setTelefone("111122-8899123123123123");
		return Arrays.asList(cc, cc1);

	}

}

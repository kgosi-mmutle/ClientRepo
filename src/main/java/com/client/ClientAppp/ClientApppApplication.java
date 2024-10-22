package com.client.ClientAppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.client.model.Client;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@RestController
@RequestMapping
public class ClientApppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApppApplication.class, args);
		System.out.println("GO!!!");
	}

	@GetMapping("/getClientByID/{id}")
	public EntityResponse<Client> getClientByID(@PathVariable Long id) {

		Client client = new Client();

		client.setFirstName("K");
		client.setIdNumber(7);
		client.setLastName("M");
		client.setMobileNumber(10);
		client.setPhysicalAddress("PTA");

		try {
			if (client.getIdNumber() == 78) {
				//return new ResponseEntity<>("Hello World!", HttpStatus.OK);
				//return new ResponseEntity<>("Hello World!", HttpStatus.OK);
			}

		} catch (Exception e) {
			// return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;
	}

	@PostMapping
	public EntityResponse<Client> createClient() {
		return null;
	}

	@PutMapping
	public /* EntityResponse<Client> */String updateClientByID() {
		return "Update client!";
	}

}

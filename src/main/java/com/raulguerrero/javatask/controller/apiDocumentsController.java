package com.raulguerrero.javatask.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulguerrero.javatask.models.Agreement;
import com.raulguerrero.javatask.models.Product;
import com.raulguerrero.javatask.models.Responses;
import com.raulguerrero.javatask.models.TransactionNbr;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/javatask/agremments/")
public class apiDocumentsController {

	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

	private static final Logger LOGGER = LoggerFactory.getLogger(apiDocumentsController.class);
	public static final String CONTENT_TYPE_JSON = "application/json";
	public static final String CORRECT_MGS = "Agreement was created succesfully!";
	public static final String MENSAJE_ERROR = "PDF no generado, revisar log para más información";
	public static final String MENSAJE_DATOS_NO_ENCONTRADOS = "PDF no generado por falta de informacion";

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "/generateagrement", produces = MediaType.APPLICATION_JSON_VALUE)

	@ApiOperation(value = "Receive document ", notes = "This API will produce a Agremment document with the products belong")


	public ResponseEntity<String> obtenerFactura(@RequestBody Agreement agreement) throws IOException {

		Responses respuestas = new Responses();
		TransactionNbr transaction = new TransactionNbr();

		List<Product> lines = agreement.getProducts();

		String fecha = formatter.format(new java.util.Date());

		agreement.setName("Agreement " + fecha + ".txt");

		BufferedWriter output = null;

		String nameFIle = agreement.getName();
		transaction.setArchivo(nameFIle);

		try {
			File file = new File(nameFIle);
			output = new BufferedWriter(new FileWriter(file, true));
			output.write("Signed by: " + agreement.getSigned_by());
			output.newLine();
			output.write("Products: " + lines.toString());
			output.newLine();

			respuestas.setFunctionalMessage(CORRECT_MGS);
			respuestas.setPayload(transaction);

		} catch (IOException e) {
			respuestas.setSuccessful(false);
			respuestas.setPayload(transaction);
			respuestas.setFunctionalMessage(MENSAJE_ERROR);
		} finally {
			if (output != null) {
				output.close();
			}
		}

		return new ResponseEntity(respuestas, HttpStatus.OK);
	}

}

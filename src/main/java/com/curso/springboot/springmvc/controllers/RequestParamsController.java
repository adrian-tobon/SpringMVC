package com.curso.springboot.springmvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springmvc.models.dto.ParamDTO;
import com.curso.springboot.springmvc.models.dto.ParamsDTO;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
	
	/*
	 * parametros de @RequestParams
	 * - required indica si es obligatorio o no el parametro
	 * - defaultValue indica el valor por defecto si no no viene informacion en la url
	 * - name indica el nombre que debe tener el parametro en la url, si no esta configuracion
	 * el nombre del parametro de la url debe coincidir con el del parametro de la funcion
	 */
	
	@GetMapping("/foo")
	public ParamDTO foo(@RequestParam(required = false, defaultValue="mensaje nulo",
						name = "mensaje") String message) {
		
		ParamDTO paramDto = new ParamDTO();
		paramDto.setMessage(message);
		return paramDto;			
	}
	
	@GetMapping("/bar")
	public ParamsDTO bar(@RequestParam String text, @RequestParam Integer code) {
		
		ParamsDTO params = new ParamsDTO();
		params.setText(text);
		params.setCode(code);
		return params;
		
	}
	
	@GetMapping("/request")
	public ParamsDTO request(HttpServletRequest request) {

		Integer code = 0;
		ParamsDTO params = new ParamsDTO();
		params.setText(request.getParameter("text"));
		
		try {
			
			code = Integer.parseInt(request.getParameter("code"));

		} catch (NumberFormatException e) {}
		
		params.setCode(code);
		return params;

	}

}

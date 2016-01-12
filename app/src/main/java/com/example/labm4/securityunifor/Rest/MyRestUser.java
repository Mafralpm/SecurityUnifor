package com.example.labm4.securityunifor.Rest;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Rest(rootUrl = "http://services-dev.unifor.br/services-dev/estacionamento/consulta/", converters = {MappingJackson2HttpMessageConverter.class})
public interface MyRestUser {

    @Get("acesso?matricula={matricula}&nrViaValida={via}&token={token}")
    @Accept(MediaType.APPLICATION_JSON_VALUE)
    Object getUser(int matricula, int via, String token);

}

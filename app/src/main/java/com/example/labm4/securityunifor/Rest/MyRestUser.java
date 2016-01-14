package com.example.labm4.securityunifor.Rest;

import com.example.labm4.securityunifor.Model.ResponseUser;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;

import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Rest(rootUrl = "http://services-dev.unifor.br/services-dev/estacionamento/consulta", converters = {FormHttpMessageConverter.class, ByteArrayHttpMessageConverter.class, MappingJackson2HttpMessageConverter.class})
public interface MyRestUser {

    @Get("/acesso?matricula={matricula}&nrViaValida={via}&token={token}&estabelecimento={estabelecimento}")
    @Accept(MediaType.APPLICATION_JSON_VALUE)
    ResponseUser searchUser(String matricula, String via, String token, String estabelecimento);

    @Get("/acesso/placa?token={token}&placa={placa}")
    @Accept(MediaType.APPLICATION_JSON_VALUE)
    ResponseUser searchUserBoard(String token, String placa);

    @Get("/acesso/paginado?token={token}&rangeInicial={rangeInicial}&rangeFinal={rangeFinal}")
    @Accept(MediaType.APPLICATION_JSON_VALUE)
    ResponseUser searchUsers(String token, String rangeInicial, String rangeFinal);

}

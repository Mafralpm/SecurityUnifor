package com.example.labm4.securityunifor.Rest;

import com.example.labm4.securityunifor.Model.ResponseLogin;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Rest(rootUrl = "http://services-dev.unifor.br/services-dev/acesso/", converters = {MappingJackson2HttpMessageConverter.class})
public interface MyRestUser {

    @Get("login/?matricula={matricula}&senha={senha}&origem=ANDROID&deviceId=1234")
    @Accept(MediaType.APPLICATION_JSON_VALUE)
    ResponseLogin login(String matricula, String senha);

}

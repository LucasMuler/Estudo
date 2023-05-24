package com.ms.email.controller;

import com.ms.email.dtos.EmailDTO;
import com.ms.email.model.EmailModel;
import com.ms.email.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    /**
     * Recebe a requisição do tipo POTS na URI abaixo e cria um Email model a partir do DTO
     * recebido, com isso é enviado para a classe de serviço para poder ser feito o envio do mesmo
     * @param emailDTO
     * @return
     */
    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEamil(@RequestBody @Valid EmailDTO emailDTO){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDTO,emailModel);
        emailService.sendEmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }

}

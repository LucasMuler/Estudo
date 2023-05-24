package com.ms.email.services;

import com.ms.email.enums.StatusEmail;
import com.ms.email.model.EmailModel;
import com.ms.email.repositories.EmailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired
    private EmailRepository repository;

    @Autowired
    private JavaMailSender emailSender;

    /**
     * Este é o comando responsive por fazer todo o gerenciamento de envio de email e persistence,
     * depois de fazer toda a logica de envio de email é retornado que o email foi enviado com sucesso
     * e feito a persistencia do mesmo no banco de dados para poder verificar posteriormente.
     * @param emailModel
     * @return
     */
    @Transactional
    public EmailModel sendEmail(EmailModel emailModel) {
        emailModel.setSendDateEmail(LocalDateTime.now()); // este bloco seta a data de enviou com a de agora
        try{
            //bloco de envio de email
            //----------------------------------------------------
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            emailSender.send(message);
            //----------------------------------------------------

            emailModel.setStatusEmail(StatusEmail.SENT); // retorno positivo da operação
        } catch (MailException e){
            emailModel.setStatusEmail(StatusEmail.ERROR); // retorno negativo da operação
        } finally {
            return repository.save(emailModel); // persistencia das informações no DB
        }
        }


}

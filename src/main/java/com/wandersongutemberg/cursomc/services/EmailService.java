package com.wandersongutemberg.cursomc.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.wandersongutemberg.cursomc.domain.Pedido;

@Service
public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
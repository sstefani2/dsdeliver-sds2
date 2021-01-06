package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.repositories.OrderRepository;
/*será um componente registrado que vamos injetar no controlador,
 *  por isso a notation @service
 *  
 *  A notation @Autowired realiza a injeção de dependência de forma transparente*/
@Service	
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		/*Precisa transformar a lista de Product para ProductDTO*/
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
		
	} 
}

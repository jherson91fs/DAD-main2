package com.example.mspedido.feign;

import com.example.mspedido.dto.ClienteDto;
import com.example.mspedido.dto.ProductoDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cliente-service", path = "/cliente")
public interface ClienteFeign {
    @GetMapping("/{id}")
    @CircuitBreaker(name = "clienteListarPorIdCB", fallbackMethod = "fallBackCliente")
    public ResponseEntity<ClienteDto> listById(@PathVariable(required = true) Integer id);
    default ResponseEntity<ClienteDto>fallBackCliente(Integer id, Exception e) {

        return  ResponseEntity.ok(new ClienteDto());
    }
}

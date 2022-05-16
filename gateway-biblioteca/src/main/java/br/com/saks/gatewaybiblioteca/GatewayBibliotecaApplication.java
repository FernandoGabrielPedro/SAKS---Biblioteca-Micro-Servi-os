package br.com.saks.gatewaybiblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayBibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayBibliotecaApplication.class, args);
	}

}

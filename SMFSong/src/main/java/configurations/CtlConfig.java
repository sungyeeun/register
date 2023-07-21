package configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.HomeController;
import controller.ProductController;

@Configuration
public class CtlConfig {

	@Bean
	public HomeController homeController() {
		return new HomeController();
	}
	
	@Bean ProductController productController() {
		return new ProductController();
	}
}

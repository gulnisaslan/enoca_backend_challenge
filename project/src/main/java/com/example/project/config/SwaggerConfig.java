package com.example.project.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Value("${apiMajorVersion}")
	private String apiMajorVersion;
	@Value("${apiMinorVersion}")
	private String apiMinorVersion;
	@Value("${apiTimeStamp}")
	private long apiTimeStamp;

	@Value("${server.address}")
	private String host;
	@Value("${server.port}")
	private Long port;
	
	@Bean
    public Docket customDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.project"))
                .paths(PathSelectors.regex("/api/.*"))
                .build().apiInfo(apiInfo());
    }
	


	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Enoca")
				.description("<b>BackEnd REST API</b><br /><br />Updated: [" 
						+ (new Date(apiTimeStamp)).toString()
						+ " ]" + " <script>document.title = \"Enoca\";"
						+ " document.getElementById('header').remove();" + "</script>")
				.version(apiMajorVersion + "." + apiMinorVersion)
				.build();
	}
      

}

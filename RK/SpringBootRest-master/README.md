# SpringBootRest
Spring Boot Rest API with Swagger

## Dependencies Required-

spring-boot-starter-web, h2, spring-boot-starter-data-jpa,springfox-swagger2, springfox-swagger-ui, spring-boot-devtools, spring-boot-starter-test

spring-boot-maven-plugin

<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.9.2</version>
	</dependency>

	<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.9.2</version>
	</dependency>
	
 ## Create SwaggerConfig
 
 
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(basePackage("com.app.minfo.controller"))
				.paths(regex("/.*"))
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Spring Boot REST API")
				.description("STUDENT  REST API")
				.contact(new Contact("Yogendra Kumar Dixit", "weburl", "yogendra.java86@gmail.com"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("1.0.0")
				.build();
	}
}

## And create Full Rest Module use with POJI-POJO desgin

## Output

URL: http://localost:8888/swagger-ui.html

![Snap](https://github.com/yogendrajava86/SpringBootRest/blob/master/SpringBootRestWithSwagger.png)



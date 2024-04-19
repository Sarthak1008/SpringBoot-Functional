package com.example.SpringBoot.Functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootFunctionalApplication {

	/*
	 * Spring Cloud Function is a project with the following high-level goals:
	 * 
	 * Promote the implementation of business logic via functions.
	 * 
	 * Decouple the development lifecycle of business logic from any specific
	 * runtime target so that the same code can run as a web endpoint, a stream
	 * processor, or a task.
	 * 
	 * Support a uniform programming model across serverless providers, as well as
	 * the ability to run standalone (locally or in a PaaS).
	 * 
	 * Enable Spring Boot features (auto-configuration, dependency injection,
	 * metrics) on serverless providers.
	 * 
	 * It abstracts away all of the transport details and infrastructure, allowing
	 * the developer to keep all the familiar tools and processes, and focus firmly
	 * on business logic.
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFunctionalApplication.class, args);

	}

	/*
	 * Write Your Functions: Define your functions as Spring beans. You can create
	 * them as separate classes or inline using lambdas. These functions should
	 * implement the appropriate functional interface based on their input and
	 * output types (e.g., Function, Consumer, Supplier).
	 */

	// Bean definition for Function
	@Bean
	/*
	 * Function - Represents a function that accepts one argument and produces a
	 * result.
	 * 
	 * This is a functional interface whose functional method is apply(Object).
	 * 
	 * Type Parameters:
	 * the type of the input to the function
	 * the type of the result of the function
	 */
	public Function<String, String> reverse() {
		// Lambda expression to define the behavior of the function
		return (input) -> new StringBuilder(input).reverse().toString();
	}

	// Bean definition for Supplier
	@Bean
	/*
	 * Supplier - Represents a supplier of results.
	 * 
	 * There is no requirement that a new or distinct result be returned each time
	 * the supplier is invoked.
	 * 
	 * This is a functional interface whose functional method is get().
	 * 
	 * Type Parameters:
	 * the type of results supplied by this supplier
	 */
	public Supplier<Book> getBook() {
		// Lambda expression to define the behavior of the supplier
		return () -> new Book(101, "Core Java");
	}

	// Bean definition for Consumer
	/*
	 * Consumer - Represents an operation that accepts a single input argument and
	 * returns no result.
	 * Unlike most other functional interfaces, Consumer is expected to operate via
	 * side-effects.
	 * 
	 * This is a functional interface whose functional method is accept(Object).
	 * 
	 * Type Parameters:
	 * the type of the input to the operation
	 */
	@Bean
	public Consumer<String> printMessage() {
		// Lambda expression to define the behavior of the consumer
		return (input) -> System.out.println(input);
	}

}

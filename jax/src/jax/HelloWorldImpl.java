package jax;

import javax.jws.WebService;

@WebService(endpointInterface = "jax.HelloWorld")
public class HelloWorldImpl
{
	public String getHelloWorldAsString(String name)
	{
		return "Hello World JAX-WS "+name;
	}
}

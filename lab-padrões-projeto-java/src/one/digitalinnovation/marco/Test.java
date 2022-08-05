package one.digitalinnovation.marco;

import one.digitalinnovation.marco.Facade.Facade;
import one.digitalinnovation.marco.Strategy.ComportamentAgressivo;
import one.digitalinnovation.marco.Strategy.Comportamento;
import one.digitalinnovation.marco.Strategy.ComportamentoDefensivo;
import one.digitalinnovation.marco.Strategy.ComportamentoNormal;
import one.digitalinnovation.marco.Strategy.Robo;
import one.digitalinnovation.marco.singleton.SigletonLazyHolder;
import one.digitalinnovation.marco.singleton.SingietonEager;
import one.digitalinnovation.marco.singleton.SingietonLazy;

public class Test {

	public static void main(String[] args) {
		
		// Singleton:
		
		SingietonLazy lazy = SingietonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingietonLazy.getInstancia();
		System.out.println(lazy);
	
	
	SingietonEager eager = SingietonEager.getInstancia();
	System.out.println(eager);
	eager = SingietonEager.getInstancia();
	System.out.println(eager);
	
	SigletonLazyHolder LazyHolder = SigletonLazyHolder.getInstancia();
	System.out.println(LazyHolder);
	LazyHolder = SigletonLazyHolder.getInstancia();
	System.out.println(LazyHolder);
	
	//Strategy
	
	Comportamento defensivo = new ComportamentoDefensivo();
	Comportamento normal = new ComportamentoNormal();
	Comportamento agressivo = new ComportamentAgressivo();
	
	Robo robo = new Robo();
	robo.setComportamento(normal);
	robo.mover();
	robo.mover();
	robo.setComportamento(defensivo);
	robo.mover();
	robo.setComportamento(agressivo);
	robo.mover();
	robo.mover();
	robo.mover();
	
	// Facade
	
	Facade facade = new Facade();
	facade.migrarCliente("Marco", "61801788");
	

}
}

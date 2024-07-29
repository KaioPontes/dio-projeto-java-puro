package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.strategy.*;

public class Test {
	
	// Singleton

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInsntancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInsntancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInsntancia();
		System.out.println(eager);
		eager = SingletonEager.getInsntancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInsntancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInsntancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
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
		
		Facade facade = new Facade ();
		facade.migrarCliente("Kaio","1483281");

	}

}

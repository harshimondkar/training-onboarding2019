package com.amdocs;

import java.util.ArrayList;

public class PaperWala implements IObservable {

	private ArrayList<IObservable> subscribers;
	private String name;
	
	public PaperWala(String name) {
		this.name=name;
		subscribers = new ArrayList<IObservable>();
	}
	
	public PaperWala() {
		subscribers = new ArrayList<IObservable>();
		
	}

	public void addSubscriber(IObserver observer) {
		subscribers.add((IObservable) observer);
	}

	public void removeSubscriber(IObserver observer) {
		subscribers.remove(observer);

	}

	public void notifyAllSubcribers(String msg) {
		for(IObserver customer : subscribers)
		customer.update(msg);

	}

}

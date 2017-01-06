package com.mypattern.command;

import com.mypattern.command.impls.ConcreteCommand;

public class Client {

	public static void main(String[] args) {
		Receiver receiver_ = new Receiver();
		Command command_ = new ConcreteCommand(receiver_);
		Invoker invoker = new Invoker(command_);
		
		invoker.invoke();

	}

}

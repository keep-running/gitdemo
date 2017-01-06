package com.mypattern.command;

public class Invoker {
	private Command command;

	public Invoker(Command command_) {
		this.command = command_;
	}

	public void invoke() {
		command.execute();
	}
}

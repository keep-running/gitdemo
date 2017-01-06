package com.mypattern.command.impls;

import com.mypattern.command.Command;
import com.mypattern.command.Receiver;

public class ConcreteCommand implements Command {
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver_) {
		this.receiver = receiver_;
	}
	
	@Override
	public void execute() {
		receiver.action();
	}

}

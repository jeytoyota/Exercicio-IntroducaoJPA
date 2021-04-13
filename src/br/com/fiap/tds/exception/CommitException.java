package br.com.fiap.tds.exception;

public class CommitException extends Exception {

	public CommitException() {
		super("Não foi possível dar commit");
		
	}
	
	public CommitException(String msg) {
		super(msg);
		
	}
		

}

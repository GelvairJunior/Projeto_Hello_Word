package edu.ContaBanco;

public class ContaBanco {
	private int numConta;
	private String agencia;
	private String nomeCliente;
	private double saldo = 0;
	
	public void setNumConta(int conta) {
		numConta = conta;
	}
	
	public void setAgencia(String agen) {
		agencia = agen;
	}
	
	public void setNomeCliente(String nome) {
		nomeCliente = nome;
	}
	
	public void setSaldo(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void mensagem() {
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo é de " + saldo + ", já está disponível para saque.");
	}
	
}

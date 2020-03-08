package br.lionani07.coursejpa.entities.enums;

public enum OrderStatus {
	
	WAITING_PAGAMENT("Waiting pagament"),
	PAID("Paid"),
	SHIPPED("Shipped"),
	DELIVERED("Delivered"),
	CANCELED("Canceled");
	
	private String descricao;
	
	private OrderStatus(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}

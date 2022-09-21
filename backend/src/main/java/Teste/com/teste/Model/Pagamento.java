package Teste.com.teste.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pagamento")
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 2545315511960121133L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "forma_pagamento", length = 90, nullable = false)
	private String forma_pagamento;
	
	@OneToMany(mappedBy = "pagamento")
	private List<Venda> vendas = new ArrayList<>();
	
	public Pagamento() {		
	}

	public Pagamento(Long id, String forma_pagamento) {
		this.id = id;
		this.forma_pagamento = forma_pagamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	
	public List<Venda> getVendas() {
		return vendas;
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", forma_pagamento=" + forma_pagamento + "]";
	}
}

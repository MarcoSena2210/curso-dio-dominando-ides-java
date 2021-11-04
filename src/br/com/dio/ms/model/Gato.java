package br.com.dio.ms.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private Integer idade;

	public Gato() {
	}

	/*
	 * PARA CRIAR O CONSTRUCTOR AUTOMATICO teclar <CTRL + 3> digatr constru
	 */

	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/*
	 * PARA CRIAR O GETS E SETTER AUTOMATICO teclar <CTRL + 3> CLICLAR EM GENERETE
	 * GETS E SETTER
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/*
	 * pARA MUADER O LOCAL DO BLOCO DE CODIGO Seleciona o bloco e <ALT + SETA UP ou
	 * SETA DOWN>
	 * 
	 */

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/*
	 * public Gato(String nome, String cor, Integer idade) { this.nome = nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}

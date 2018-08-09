package br.com.cleberson.project.domain;

public class Cliente {

  private String nome;
  private Integer idade;
  private String uri;

  public Cliente(final String nome, final Integer idade) {
    this.nome = nome;
    this.idade = idade;
    this.uri = "http://" + nome + ".com.br/" + idade;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(final String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return this.idade;
  }

  public void setIdade(final Integer idade) {
    this.idade = idade;
  }

  public String getUri() {
	return this.uri;
  }
}

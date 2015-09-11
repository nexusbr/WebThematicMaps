package geopixel.model.legacy.dto;

import java.io.Serializable;

/**
 * Model class of app_endereco.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Endereco implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** end_id. */
	private Integer endId;

	/** logradouro. */
	private String logradouro;

	/** numero. */
	private String numero;

	/** complemento. */
	private String complemento;

	/** cep. */
	private String cep;

	/** bairro. */
	private String bairro;

	/** cidade. */
	private String cidade;

	/** uf. */
	private String uf;

	/** app_usuario. */
	private Usuario appUsuario;

	/**
	 * Constructor.
	 */
	public Endereco() {
	}

	/**
	 * Set the end_id.
	 * 
	 * @param endId
	 *            end_id
	 */
	public void setEndId(Integer endId) {
		this.endId = endId;
	}

	/**
	 * Get the end_id.
	 * 
	 * @return end_id
	 */
	public Integer getEndId() {
		return this.endId;
	}

	/**
	 * Set the logradouro.
	 * 
	 * @param logradouro
	 *            logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * Get the logradouro.
	 * 
	 * @return logradouro
	 */
	public String getLogradouro() {
		return this.logradouro;
	}

	/**
	 * Set the numero.
	 * 
	 * @param numero
	 *            numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Get the numero.
	 * 
	 * @return numero
	 */
	public String getNumero() {
		return this.numero;
	}

	/**
	 * Set the complemento.
	 * 
	 * @param complemento
	 *            complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Get the complemento.
	 * 
	 * @return complemento
	 */
	public String getComplemento() {
		return this.complemento;
	}

	/**
	 * Set the cep.
	 * 
	 * @param cep
	 *            cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Get the cep.
	 * 
	 * @return cep
	 */
	public String getCep() {
		return this.cep;
	}

	/**
	 * Set the bairro.
	 * 
	 * @param bairro
	 *            bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Get the bairro.
	 * 
	 * @return bairro
	 */
	public String getBairro() {
		return this.bairro;
	}

	/**
	 * Set the cidade.
	 * 
	 * @param cidade
	 *            cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Get the cidade.
	 * 
	 * @return cidade
	 */
	public String getCidade() {
		return this.cidade;
	}

	/**
	 * Set the uf.
	 * 
	 * @param uf
	 *            uf
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * Get the uf.
	 * 
	 * @return uf
	 */
	public String getUf() {
		return this.uf;
	}

	/**
	 * Set the app_usuario.
	 * 
	 * @param appUsuario
	 *            app_usuario
	 */
	public void setAppUsuario(Usuario appUsuario) {
		this.appUsuario = appUsuario;
	}

	/**
	 * Get the app_usuario.
	 * 
	 * @return app_usuario
	 */
	public Usuario getAppUsuario() {
		return this.appUsuario;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endId == null) ? 0 : endId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Endereco other = (Endereco) obj;
		if (endId == null) {
			if (other.endId != null) {
				return false;
			}
		} else if (!endId.equals(other.endId)) {
			return false;
		}
		return true;
	}

}

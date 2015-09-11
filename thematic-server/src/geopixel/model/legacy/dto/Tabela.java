package geopixel.model.legacy.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of app_tabela.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Tabela implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** tbl_id. */
	private Integer tblId;

	/** nome. */
	private String nome;

	/** url_conexao_banco. */
	private String urlConexaoBanco;

	/** The set of app_dicionario_dado. */
	private Set<DicionarioDado> appDicionarioDadoSet;

	/** The set of app_documento_digital. */
	private Set<DocumentoDigital> appDocumentoDigitalSet;

	/**
	 * Constructor.
	 */
	public Tabela() {
		this.appDicionarioDadoSet = new HashSet<DicionarioDado>();
		this.appDocumentoDigitalSet = new HashSet<DocumentoDigital>();
	}

	/**
	 * Set the tbl_id.
	 * 
	 * @param tblId
	 *            tbl_id
	 */
	public void setTblId(Integer tblId) {
		this.tblId = tblId;
	}

	/**
	 * Get the tbl_id.
	 * 
	 * @return tbl_id
	 */
	public Integer getTblId() {
		return this.tblId;
	}

	/**
	 * Set the nome.
	 * 
	 * @param nome
	 *            nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Get the nome.
	 * 
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Set the url_conexao_banco.
	 * 
	 * @param urlConexaoBanco
	 *            url_conexao_banco
	 */
	public void setUrlConexaoBanco(String urlConexaoBanco) {
		this.urlConexaoBanco = urlConexaoBanco;
	}

	/**
	 * Get the url_conexao_banco.
	 * 
	 * @return url_conexao_banco
	 */
	public String getUrlConexaoBanco() {
		return this.urlConexaoBanco;
	}

	/**
	 * Set the set of the app_dicionario_dado.
	 * 
	 * @param appDicionarioDadoSet
	 *            The set of app_dicionario_dado
	 */
	public void setAppDicionarioDadoSet(Set<DicionarioDado> appDicionarioDadoSet) {
		this.appDicionarioDadoSet = appDicionarioDadoSet;
	}

	/**
	 * Add the app_dicionario_dado.
	 * 
	 * @param appDicionarioDado
	 *            app_dicionario_dado
	 */
	public void addAppDicionarioDado(DicionarioDado appDicionarioDado) {
		this.appDicionarioDadoSet.add(appDicionarioDado);
	}

	/**
	 * Get the set of the app_dicionario_dado.
	 * 
	 * @return The set of app_dicionario_dado
	 */
	public Set<DicionarioDado> getAppDicionarioDadoSet() {
		return this.appDicionarioDadoSet;
	}

	/**
	 * Set the set of the app_documento_digital.
	 * 
	 * @param appDocumentoDigitalSet
	 *            The set of app_documento_digital
	 */
	public void setAppDocumentoDigitalSet(Set<DocumentoDigital> appDocumentoDigitalSet) {
		this.appDocumentoDigitalSet = appDocumentoDigitalSet;
	}

	/**
	 * Add the app_documento_digital.
	 * 
	 * @param appDocumentoDigital
	 *            app_documento_digital
	 */
	public void addAppDocumentoDigital(DocumentoDigital appDocumentoDigital) {
		this.appDocumentoDigitalSet.add(appDocumentoDigital);
	}

	/**
	 * Get the set of the app_documento_digital.
	 * 
	 * @return The set of app_documento_digital
	 */
	public Set<DocumentoDigital> getAppDocumentoDigitalSet() {
		return this.appDocumentoDigitalSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tblId == null) ? 0 : tblId.hashCode());
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
		Tabela other = (Tabela) obj;
		if (tblId == null) {
			if (other.tblId != null) {
				return false;
			}
		} else if (!tblId.equals(other.tblId)) {
			return false;
		}
		return true;
	}

}

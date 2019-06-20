package ci.sealog.transit.helper.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import ci.sealog.transit.dao.entity.Societe;
@JsonInclude(Include.NON_NULL)

public class PortDto {

	private Integer idPort;
	private String codePort;
	private String libellePort;
	private Societe societe;
	
	public Integer getIdPort() {
		return idPort;
	}
	public void setIdPort(Integer idPort) {
		this.idPort = idPort;
	}
	public String getCodePort() {
		return codePort;
	}
	public void setCodePort(String codePort) {
		this.codePort = codePort;
	}
	public String getLibellePort() {
		return libellePort;
	}
	public void setLibellePort(String libellePort) {
		this.libellePort = libellePort;
	}
	public Societe getSociete() {
		return societe;
	}
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	
	
	
	
	
}

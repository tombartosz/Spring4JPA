package priv.bartek.spring4.jpa.tutorial.model.common;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

@Embeddable
public class Metadata implements Serializable {
	
	private String description;
	private Date creationDate;
	private Date modyficationDate;
	private static final long serialVersionUID = 1L;

	public Metadata() {
		super();
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}   
	public Date getModyficationDate() {
		return this.modyficationDate;
	}

	public void setModyficationDate(Date modyficationDate) {
		this.modyficationDate = modyficationDate;
	}
   
}

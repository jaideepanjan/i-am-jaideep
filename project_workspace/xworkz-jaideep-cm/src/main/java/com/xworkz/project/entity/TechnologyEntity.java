package com.xworkz.project.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "technology_table")
//@NamedQuery(name = "searchTech", query = "select enty from TechnologyEntity enty where enty.name=:t_name or  enty.language=: t_lang or  enty.version=:t_version or  enty.owner=:t_owner or  enty.supportFrom=:t_suppoetfrom or  enty.supportTo=:t_suppoetTo or  enty.license=:t_licenseNo or  enty.openSource=:t_openSource or  enty.osType=:t_osType or  enty.ProjectEntity.userId=:t_UserId")
@NamedQuery(name="searchTech", query="select ent from TechnologyEntity ent where ent.name=:t_name or ent.language=:t_lang or ent.version=:t_version or ent.owner=:t_owner or ent.supportFrom=:t_suppoetfrom or ent.supportTo=:t_suppoetTo or ent.license=:t_licenseNo or ent.openSource=:t_openSource or ent.osType=:t_osType and ent.projectEntity.userId=:t_UserId")

public class TechnologyEntity {

	@Id
	@Column(name = "t_Id")
	private int tId;

	@Column(name = "t_name")
	private String name;

	@Column(name = "language")
	private String language;

	@Column(name = "version")
	private String version;
	@Column(name = "owner")
	private String owner;
	@Column(name = "supportFrom")
	private String supportFrom;

	@Column(name = "supportTo")
	private String supportTo;

	@Column(name = "license")
	private String license;
	@Column(name = "openSource")
	private String openSource;
	@Column(name = "os_Type")
	private String osType;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDate")
	private LocalDateTime createdDate;

	@Column(name = "updatedBy")
	private String updatedBy;

	@Column(name = "updatedDate")
	private LocalDateTime updatedDate;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private ProjectEntity projectEntity;

}

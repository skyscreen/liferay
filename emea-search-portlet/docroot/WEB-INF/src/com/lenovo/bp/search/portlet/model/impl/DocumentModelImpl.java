/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lenovo.bp.search.portlet.model.impl;

import com.lenovo.bp.search.portlet.model.Document;
import com.lenovo.bp.search.portlet.model.DocumentModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Document service. Represents a row in the &quot;journalarticle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lenovo.bp.search.portlet.model.DocumentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocumentImpl}.
 * </p>
 *
 * @author siyan
 * @see DocumentImpl
 * @see com.lenovo.bp.search.portlet.model.Document
 * @see com.lenovo.bp.search.portlet.model.DocumentModel
 * @generated
 */
@JSON(strict = true)
public class DocumentModelImpl extends BaseModelImpl<Document>
	implements DocumentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a document model instance should use the {@link com.lenovo.bp.search.portlet.model.Document} interface instead.
	 */
	public static final String TABLE_NAME = "journalarticle";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "createDate", Types.VARCHAR },
			{ "articleId", Types.BIGINT },
			{ "version", Types.DOUBLE },
			{ "title", Types.VARCHAR },
			{ "content", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table journalarticle (id_ LONG not null primary key,createDate VARCHAR(75) null,articleId LONG,version DOUBLE,title VARCHAR(75) null,content VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table journalarticle";
	public static final String ORDER_BY_JPQL = " ORDER BY document.id_ ASC";
	public static final String ORDER_BY_SQL = " ORDER BY journalarticle.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lenovo.bp.search.portlet.model.Document"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lenovo.bp.search.portlet.model.Document"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.lenovo.bp.search.portlet.model.Document"));

	public DocumentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id_;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Document.class;
	}

	@Override
	public String getModelClassName() {
		return Document.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_", getId_());
		attributes.put("createDate", getCreateDate());
		attributes.put("articleId", getArticleId());
		attributes.put("version", getVersion());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_ = (Long)attributes.get("id_");

		if (id_ != null) {
			setId_(id_);
		}

		String createDate = (String)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long articleId = (Long)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		Double version = (Double)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@JSON
	@Override
	public long getId_() {
		return _id_;
	}

	@Override
	public void setId_(long id_) {
		_id_ = id_;
	}

	@JSON
	@Override
	public String getCreateDate() {
		if (_createDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _createDate;
		}
	}

	@Override
	public void setCreateDate(String createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public long getArticleId() {
		return _articleId;
	}

	@Override
	public void setArticleId(long articleId) {
		_articleId = articleId;
	}

	@JSON
	@Override
	public double getVersion() {
		return _version;
	}

	@Override
	public void setVersion(double version) {
		_version = version;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Document.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Document toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Document)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DocumentImpl documentImpl = new DocumentImpl();

		documentImpl.setId_(getId_());
		documentImpl.setCreateDate(getCreateDate());
		documentImpl.setArticleId(getArticleId());
		documentImpl.setVersion(getVersion());
		documentImpl.setTitle(getTitle());
		documentImpl.setContent(getContent());

		documentImpl.resetOriginalValues();

		return documentImpl;
	}

	@Override
	public int compareTo(Document document) {
		long primaryKey = document.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Document)) {
			return false;
		}

		Document document = (Document)obj;

		long primaryKey = document.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Document> toCacheModel() {
		DocumentCacheModel documentCacheModel = new DocumentCacheModel();

		documentCacheModel.id_ = getId_();

		documentCacheModel.createDate = getCreateDate();

		String createDate = documentCacheModel.createDate;

		if ((createDate != null) && (createDate.length() == 0)) {
			documentCacheModel.createDate = null;
		}

		documentCacheModel.articleId = getArticleId();

		documentCacheModel.version = getVersion();

		documentCacheModel.title = getTitle();

		String title = documentCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			documentCacheModel.title = null;
		}

		documentCacheModel.content = getContent();

		String content = documentCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			documentCacheModel.content = null;
		}

		return documentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id_=");
		sb.append(getId_());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", content=");
		sb.append(getContent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.lenovo.bp.search.portlet.model.Document");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_</column-name><column-value><![CDATA[");
		sb.append(getId_());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Document.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Document.class
		};
	private long _id_;
	private String _createDate;
	private long _articleId;
	private double _version;
	private String _title;
	private String _content;
	private Document _escapedModel;
}
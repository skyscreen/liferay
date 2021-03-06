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

import com.lenovo.bp.search.portlet.model.LangContent;
import com.lenovo.bp.search.portlet.model.LangContentModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LangContent service. Represents a row in the &quot;search_LangContent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lenovo.bp.search.portlet.model.LangContentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LangContentImpl}.
 * </p>
 *
 * @author siyan
 * @see LangContentImpl
 * @see com.lenovo.bp.search.portlet.model.LangContent
 * @see com.lenovo.bp.search.portlet.model.LangContentModel
 * @generated
 */
@JSON(strict = true)
public class LangContentModelImpl extends BaseModelImpl<LangContent>
	implements LangContentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lang content model instance should use the {@link com.lenovo.bp.search.portlet.model.LangContent} interface instead.
	 */
	public static final String TABLE_NAME = "search_LangContent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "locals", Types.VARCHAR },
			{ "content", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table search_LangContent (locals VARCHAR(75) not null primary key,content VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table search_LangContent";
	public static final String ORDER_BY_JPQL = " ORDER BY langContent.locals ASC";
	public static final String ORDER_BY_SQL = " ORDER BY search_LangContent.locals ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lenovo.bp.search.portlet.model.LangContent"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lenovo.bp.search.portlet.model.LangContent"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.lenovo.bp.search.portlet.model.LangContent"));

	public LangContentModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _locals;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setLocals(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _locals;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return LangContent.class;
	}

	@Override
	public String getModelClassName() {
		return LangContent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("locals", getLocals());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String locals = (String)attributes.get("locals");

		if (locals != null) {
			setLocals(locals);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@JSON
	@Override
	public String getLocals() {
		if (_locals == null) {
			return StringPool.BLANK;
		}
		else {
			return _locals;
		}
	}

	@Override
	public void setLocals(String locals) {
		_locals = locals;
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
	public LangContent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LangContent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LangContentImpl langContentImpl = new LangContentImpl();

		langContentImpl.setLocals(getLocals());
		langContentImpl.setContent(getContent());

		langContentImpl.resetOriginalValues();

		return langContentImpl;
	}

	@Override
	public int compareTo(LangContent langContent) {
		String primaryKey = langContent.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LangContent)) {
			return false;
		}

		LangContent langContent = (LangContent)obj;

		String primaryKey = langContent.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<LangContent> toCacheModel() {
		LangContentCacheModel langContentCacheModel = new LangContentCacheModel();

		langContentCacheModel.locals = getLocals();

		String locals = langContentCacheModel.locals;

		if ((locals != null) && (locals.length() == 0)) {
			langContentCacheModel.locals = null;
		}

		langContentCacheModel.content = getContent();

		String content = langContentCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			langContentCacheModel.content = null;
		}

		return langContentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{locals=");
		sb.append(getLocals());
		sb.append(", content=");
		sb.append(getContent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.lenovo.bp.search.portlet.model.LangContent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>locals</column-name><column-value><![CDATA[");
		sb.append(getLocals());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LangContent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LangContent.class
		};
	private String _locals;
	private String _content;
	private LangContent _escapedModel;
}
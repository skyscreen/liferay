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

import com.lenovo.bp.search.portlet.model.LangTitle;
import com.lenovo.bp.search.portlet.model.LangTitleModel;

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
 * The base model implementation for the LangTitle service. Represents a row in the &quot;search_LangTitle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lenovo.bp.search.portlet.model.LangTitleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LangTitleImpl}.
 * </p>
 *
 * @author siyan
 * @see LangTitleImpl
 * @see com.lenovo.bp.search.portlet.model.LangTitle
 * @see com.lenovo.bp.search.portlet.model.LangTitleModel
 * @generated
 */
@JSON(strict = true)
public class LangTitleModelImpl extends BaseModelImpl<LangTitle>
	implements LangTitleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lang title model instance should use the {@link com.lenovo.bp.search.portlet.model.LangTitle} interface instead.
	 */
	public static final String TABLE_NAME = "search_LangTitle";
	public static final Object[][] TABLE_COLUMNS = {
			{ "locals", Types.VARCHAR },
			{ "title", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table search_LangTitle (locals VARCHAR(75) not null primary key,title VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table search_LangTitle";
	public static final String ORDER_BY_JPQL = " ORDER BY langTitle.locals ASC";
	public static final String ORDER_BY_SQL = " ORDER BY search_LangTitle.locals ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lenovo.bp.search.portlet.model.LangTitle"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lenovo.bp.search.portlet.model.LangTitle"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.lenovo.bp.search.portlet.model.LangTitle"));

	public LangTitleModelImpl() {
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
		return LangTitle.class;
	}

	@Override
	public String getModelClassName() {
		return LangTitle.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("locals", getLocals());
		attributes.put("title", getTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String locals = (String)attributes.get("locals");

		if (locals != null) {
			setLocals(locals);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
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

	@Override
	public LangTitle toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LangTitle)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LangTitleImpl langTitleImpl = new LangTitleImpl();

		langTitleImpl.setLocals(getLocals());
		langTitleImpl.setTitle(getTitle());

		langTitleImpl.resetOriginalValues();

		return langTitleImpl;
	}

	@Override
	public int compareTo(LangTitle langTitle) {
		String primaryKey = langTitle.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LangTitle)) {
			return false;
		}

		LangTitle langTitle = (LangTitle)obj;

		String primaryKey = langTitle.getPrimaryKey();

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
	public CacheModel<LangTitle> toCacheModel() {
		LangTitleCacheModel langTitleCacheModel = new LangTitleCacheModel();

		langTitleCacheModel.locals = getLocals();

		String locals = langTitleCacheModel.locals;

		if ((locals != null) && (locals.length() == 0)) {
			langTitleCacheModel.locals = null;
		}

		langTitleCacheModel.title = getTitle();

		String title = langTitleCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			langTitleCacheModel.title = null;
		}

		return langTitleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{locals=");
		sb.append(getLocals());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.lenovo.bp.search.portlet.model.LangTitle");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>locals</column-name><column-value><![CDATA[");
		sb.append(getLocals());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LangTitle.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LangTitle.class
		};
	private String _locals;
	private String _title;
	private LangTitle _escapedModel;
}
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

package com.lenovo.bp.search.portlet.service.persistence;

import com.lenovo.bp.search.portlet.model.LangTitle;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the lang title service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author siyan
 * @see LangTitlePersistenceImpl
 * @see LangTitleUtil
 * @generated
 */
public interface LangTitlePersistence extends BasePersistence<LangTitle> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LangTitleUtil} to access the lang title persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the lang title in the entity cache if it is enabled.
	*
	* @param langTitle the lang title
	*/
	public void cacheResult(
		com.lenovo.bp.search.portlet.model.LangTitle langTitle);

	/**
	* Caches the lang titles in the entity cache if it is enabled.
	*
	* @param langTitles the lang titles
	*/
	public void cacheResult(
		java.util.List<com.lenovo.bp.search.portlet.model.LangTitle> langTitles);

	/**
	* Creates a new lang title with the primary key. Does not add the lang title to the database.
	*
	* @param locals the primary key for the new lang title
	* @return the new lang title
	*/
	public com.lenovo.bp.search.portlet.model.LangTitle create(
		java.lang.String locals);

	/**
	* Removes the lang title with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param locals the primary key of the lang title
	* @return the lang title that was removed
	* @throws com.lenovo.bp.search.portlet.NoSuchLangTitleException if a lang title with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lenovo.bp.search.portlet.model.LangTitle remove(
		java.lang.String locals)
		throws com.lenovo.bp.search.portlet.NoSuchLangTitleException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lenovo.bp.search.portlet.model.LangTitle updateImpl(
		com.lenovo.bp.search.portlet.model.LangTitle langTitle)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lang title with the primary key or throws a {@link com.lenovo.bp.search.portlet.NoSuchLangTitleException} if it could not be found.
	*
	* @param locals the primary key of the lang title
	* @return the lang title
	* @throws com.lenovo.bp.search.portlet.NoSuchLangTitleException if a lang title with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lenovo.bp.search.portlet.model.LangTitle findByPrimaryKey(
		java.lang.String locals)
		throws com.lenovo.bp.search.portlet.NoSuchLangTitleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lang title with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param locals the primary key of the lang title
	* @return the lang title, or <code>null</code> if a lang title with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lenovo.bp.search.portlet.model.LangTitle fetchByPrimaryKey(
		java.lang.String locals)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lang titles.
	*
	* @return the lang titles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lenovo.bp.search.portlet.model.LangTitle> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lang titles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lenovo.bp.search.portlet.model.impl.LangTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lang titles
	* @param end the upper bound of the range of lang titles (not inclusive)
	* @return the range of lang titles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lenovo.bp.search.portlet.model.LangTitle> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lang titles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lenovo.bp.search.portlet.model.impl.LangTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lang titles
	* @param end the upper bound of the range of lang titles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lang titles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lenovo.bp.search.portlet.model.LangTitle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the lang titles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lang titles.
	*
	* @return the number of lang titles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
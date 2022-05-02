
package org.owasp.webgoat.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/***************************************************************************************************
 * 
 * 
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details,
 * please see http://www.owasp.org/
 * 
 * Copyright (c) 2002 - 20014 Bruce Mayhew
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 * 
 * Getting Source ==============
 * 
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for
 * free software projects.
 * 
 * For details, please see http://webgoat.github.io
 */
@Component
public class BeanProvider implements ApplicationContextAware
{
	private static ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		ctx = applicationContext;

	}

	/**
	 * Get access to managed beans from id.
	 * 
	 * @param beanName
	 *            the id of the searched bean
	 * @param beanClass
	 *            the type of tye searched bean
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(final String beanName, final Class<T> beanClass)
	{
		return (T) ctx.getBean(beanName);
	}
}

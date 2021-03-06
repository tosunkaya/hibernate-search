/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.util.common.logging.impl;

/**
 * Used with JBoss Logging's {@link org.jboss.logging.annotations.FormatWith} to display {@link Class} names in log
 * messages.
 *
 * @author Gunnar Morling
 */
public final class ClassFormatter {

	private final Class<?> clazz;

	public ClassFormatter(Class<?> clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return clazz != null ? clazz.getName() : "null";
	}
}

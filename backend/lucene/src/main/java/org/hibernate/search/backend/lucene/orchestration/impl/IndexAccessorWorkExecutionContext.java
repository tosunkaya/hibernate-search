/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.backend.lucene.orchestration.impl;

import java.io.IOException;

import org.hibernate.search.backend.lucene.lowlevel.index.impl.IndexAccessor;
import org.hibernate.search.backend.lucene.lowlevel.writer.impl.IndexWriterDelegator;
import org.hibernate.search.backend.lucene.work.impl.IndexManagementWorkExecutionContext;
import org.hibernate.search.backend.lucene.work.impl.IndexingWorkExecutionContext;
import org.hibernate.search.util.common.reporting.EventContext;

public class IndexAccessorWorkExecutionContext
		implements IndexingWorkExecutionContext, IndexManagementWorkExecutionContext {

	private final EventContext eventContext;
	private final IndexAccessor indexAccessor;

	IndexAccessorWorkExecutionContext(EventContext eventContext, IndexAccessor indexAccessor) {
		this.eventContext = eventContext;
		this.indexAccessor = indexAccessor;
	}

	@Override
	public EventContext getEventContext() {
		return eventContext;
	}

	@Override
	public IndexWriterDelegator getIndexWriterDelegator() throws IOException {
		return indexAccessor.getIndexWriterDelegator();
	}

	@Override
	public IndexAccessor getIndexAccessor() {
		return indexAccessor;
	}
}

/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.backend.elasticsearch.search.query.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.search.backend.elasticsearch.search.query.ElasticsearchSearchResult;
import org.hibernate.search.engine.search.aggregation.AggregationKey;
import org.hibernate.search.engine.search.query.spi.SimpleSearchResult;

class ElasticsearchSearchResultImpl<H> extends SimpleSearchResult<H>
		implements ElasticsearchSearchResult<H> {
	ElasticsearchSearchResultImpl(long hitCount, List<H> hits, Map<AggregationKey<?>, ?> aggregationResults) {
		super( hitCount, hits, aggregationResults );
	}
}
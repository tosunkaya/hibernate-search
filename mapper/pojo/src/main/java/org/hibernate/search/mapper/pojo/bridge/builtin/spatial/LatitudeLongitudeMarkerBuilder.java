/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.mapper.pojo.bridge.builtin.spatial;

import org.hibernate.search.mapper.pojo.bridge.mapping.MarkerBuilder;

/**
 * A builder of markers that mark a property as the latitude or longitude
 * for a {@link GeoPointBridgeBuilder GeoPoint bridge}.
 *
 * @see org.hibernate.search.mapper.pojo.bridge.builtin.spatial.annotation.Latitude
 * @see org.hibernate.search.mapper.pojo.bridge.builtin.spatial.annotation.Longitude
 * @see GeoPointBridgeBuilder#latitude()
 * @see GeoPointBridgeBuilder#longitude()
 */
public interface LatitudeLongitudeMarkerBuilder extends MarkerBuilder {

	/**
	 * @param markerSet The name of the "marker set".
	 * This is used to discriminate between multiple pairs of latitude/longitude markers.
	 * @return {@code this}, for method chaining.
	 * @see GeoPointBridgeBuilder#markerSet(String)
	 */
	LatitudeLongitudeMarkerBuilder markerSet(String markerSet);

}
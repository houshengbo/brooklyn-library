/*
 * Copyright 2012 by Andrew Kennedy
 */
package brooklyn.entity.nosql.cassandra;

import brooklyn.entity.java.JavaSoftwareProcessDriver;

public interface CassandraDriver extends JavaSoftwareProcessDriver {

    Integer getGossipPort();

    Integer getSslGossipPort();

    Integer getThriftPort();

    String getClusterName();

}

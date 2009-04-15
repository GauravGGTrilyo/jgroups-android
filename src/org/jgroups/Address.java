// $Id: Address.java,v 1.4 2005/07/17 11:38:05 chrislott Exp $

package org.jgroups;

import org.jgroups.util.Streamable;

import java.io.Externalizable;



/**
 * Abstract address. Used to identify members on a group to send messages to.
 * Addresses are mostly generated by the bottom-most (transport) layers (e.g. UDP, TCP, LOOPBACK).
 * @author Bela Ban
 */
public interface Address extends Externalizable, Streamable, Comparable, Cloneable { // todo: remove Externalizable

    /**
     * Checks whether this is an address that represents multiple destinations;
     * e.g., a class D address in the Internet.
     * @return true if this is a multicast address, false if it is a unicast address
     */
    boolean  isMulticastAddress();

    /** Returns serialized size of this address */
    int size();
}

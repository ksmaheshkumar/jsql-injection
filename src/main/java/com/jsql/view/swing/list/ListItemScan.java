/*******************************************************************************
 * Copyhacked (H) 2012-2016.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 * 
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 ******************************************************************************/
package com.jsql.view.swing.list;

/**
 * Basic object to avoid String incompatibility with drag and drop feature.
 */
public class ListItemScan extends ListItem {
    
    private BeanInjection beanInjection;

    public ListItemScan(BeanInjection newString) {
        super(newString.getUrl());
        this.beanInjection = newString;
    }

    public BeanInjection getBeanInjection() {
        return this.beanInjection;
    }
	
}

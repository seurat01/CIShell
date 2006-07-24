/* **************************************************************************** 
 * CIShell: Cyberinfrastructure Shell, An Algorithm Integration Framework.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Apache License v2.0 which accompanies
 * this distribution, and is available at:
 * http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 * Created on Jun 7, 2006 at Indiana University.
 * 
 * Contributors:
 *     Indiana University - Initial API
 * ***************************************************************************/
package org.cishell.framework.datamodel;

import java.io.File;
import java.util.Dictionary;

/**
 * A class that encapsulates data and its meta-data. This class is used to pass
 * data between algorithms and what algorithms optionally create when executed. 
 * 
 * @author Bruce Herr (bh2@bh2.net)
 */
public interface DataModel {
	/**
	 * Returns the meta-data associated with the data stored in this DataModel.
	 * Some standard keys are in the {@link DataModelProperty} interface.
	 * 
	 * @return The data's meta-data
	 */
    public Dictionary getMetaData();
    
    /**
     * Returns the data stored in this DataModel.
     * 
     * @return The data (a java object)
     */
    public Object getData();
    
    
    /**
     * If the data is a {@link File}, then this method returns what MIME type 
     * it is. 
     * 
     * TODO: fix this docu
     * 
     * @return The main format of the data
     */
    public String getFormat();
    
    //TODO: Consider these methods for inclusion in DataModel
    //public String getType();
    
    //public String getUID(); //may be better for specifying parent datamodels
    //public Object getDataAsType(String type);
}
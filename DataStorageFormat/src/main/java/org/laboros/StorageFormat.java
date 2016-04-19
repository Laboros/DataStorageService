package org.laboros;

import org.apache.hadoop.io.WritableComparator;

public interface StorageFormat {
	
	public WritableComparator parseData(final String inputData);

}

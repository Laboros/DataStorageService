package org.laboros;

import org.apache.hadoop.io.WritableComparable;

public interface StorageFormat {
	
	public WritableComparable parseData(final String inputData);

}

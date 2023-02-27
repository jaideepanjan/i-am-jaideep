
package com.xworkz.transformer.repositary;

import com.xworkz.transformer.entity.TransformerEntity;

public interface TransformerRepositry {
	
	
	boolean save(TransformerEntity entity);
	
	default TransformerEntity findById(int id) {
		return null;
	}

	

}

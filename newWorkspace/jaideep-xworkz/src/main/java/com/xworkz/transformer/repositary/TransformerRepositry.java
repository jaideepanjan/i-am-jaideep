
package com.xworkz.transformer.repositary;

import java.util.Collections;
import java.util.List;
import com.xworkz.transformer.entity.TransformerEntity;

public interface TransformerRepositry {

	boolean save(TransformerEntity entity);
	boolean update(TransformerEntity entity);

	default TransformerEntity findById(int id) {
		return null;
	}

	default List<TransformerEntity> findByBrand(String brand) {
		return Collections.emptyList();
	}
	
	boolean deleteById(int id);
	

}

package com.classUtility;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/**
 * class transfer
 * 
 * @author yangzf
 * @since 2017年12月10日 上午9:25:13
 */
public class TransferField {

	private TransferField() {}
	
	private volatile static TransferField transferField;
	
	public synchronized static TransferField getTransferFieldInstance() {
		if(transferField != null) {
			return transferField;
		}else {
			return new TransferField();
		}
	}
	
	/**
	 * b的值不变，把b的值赋给a<br>
	 * @author yangzf
	 * @since 2017年12月10日 上午9:24:14
	 */
	public void transferFields(Object a, Object b) {
		Field[] fields1 = a.getClass().getDeclaredFields();// a的fields
		Field[] fields2 = b.getClass().getDeclaredFields();// b的fields

		AccessibleObject.setAccessible(fields1, true);
		AccessibleObject.setAccessible(fields2, true);
		
		try {
			for (int i = 0; i < fields2.length; i++) {
				Field field2 = fields2[i];
				String f2Name = field2.getName();
				if("serialVersionUID".equals(f2Name)) continue;//如果是序列ID，进行下一次循环

				for (int j = 0; j < fields1.length; j++) {
					Field field1 = fields1[j];
					String f1Name = field1.getName();
					if (f2Name.equals(f1Name)) {
						field1.set(a, field2.get(b));
						break;
					}
				}
			}

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}

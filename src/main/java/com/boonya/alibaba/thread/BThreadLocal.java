package com.boonya.alibaba.thread;

import com.boonya.alibaba.thread.beans.Order;
/**
 * 阿里面试经常会问到ThreadLocal的原理、使用场景、使用时注意事项
 * 
 * @package com.boonya.alibaba.thread.BThreadLocal
 * @date   2017年4月1日  上午9:57:02
 * @author pengjunlin
 * @comment   
 * @update
 */
public class BThreadLocal extends ThreadLocal<Order>{

	@Override
	protected Order initialValue() {
		// TODO Auto-generated method stub
		return super.initialValue();
	}

	@Override
	public Order get() {
		// TODO Auto-generated method stub
		return super.get();
	}

	@Override
	public void set(Order value) {
		// TODO Auto-generated method stub
		super.set(value);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		super.remove();
	}
	
	

}

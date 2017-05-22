package com.boonya.alibaba.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * 并发链表队列
 * 
 * @package com.boonya.alibaba.concurrent.BConcurrentLinkedQueue
 * @date   2017年4月5日  下午2:25:39
 * @author pengjunlin
 * @comment   
 * @update
 */
public class BConcurrentLinkedQueue extends ConcurrentLinkedQueue{

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return super.offer(e);
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return super.poll();
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return super.peek();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	/**
	 * 不推荐使用此方法判断是否为空,因为需要去遍历,可以直接使用isEmpty()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return super.contains(o);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return super.remove(o);
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return super.addAll(c);
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}
	
	

}

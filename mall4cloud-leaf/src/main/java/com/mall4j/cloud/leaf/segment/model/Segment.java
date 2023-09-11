package com.mall4j.cloud.leaf.segment.model;

import lombok.Data;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuKeFan
 */
@Data
public class Segment {

	private AtomicLong value = new AtomicLong(0);

	private volatile long max;

	private volatile int step;

	private volatile int randomStep;

	private final SegmentBuffer buffer;

	public Segment(SegmentBuffer buffer) {
		this.buffer = buffer;
	}

	public long getIdle() {
		return this.getMax() - getValue().get();
	}

	@Override
	public String toString() {
		return "Segment(" + "value:" +
				value +
				",max:" +
				max +
				",step:" +
				step +
				")";
	}


}

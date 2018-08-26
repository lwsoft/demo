package com.lwsoft.api.utils;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.lwsoft.api.entity.User;

public class SerializationOptimizerImpl implements SerializationOptimizer{
	
	@Override
	public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //这里可以把所有需要进行序列化的类进行添加
        classes.add(User.class);
        return classes;
    }

}

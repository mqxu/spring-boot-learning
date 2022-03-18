package com.mqxu.boot.orm.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @description: 字段填充监听器
 * @author: mqxu
 * @date: 2022-03-18
 **/
@Component
@Slf4j
public class DataBaseAuditListener {
    /**
     * 新增数据时，填充创建时间
     */
    @PrePersist
    public void prePersist(Object object) throws IllegalArgumentException, IllegalAccessException {
        Class<?> aClass = object.getClass();
        try {
            // 填充创建时间
            addOperateTime(object, aClass, "createTime");
        } catch (NoSuchFieldException e) {
            log.error("反射获取属性异常：", e);
        }
    }

    /**
     * 更新数据时，填充更新时间
     */
    @PreUpdate
    public void preUpdate(Object object) throws IllegalArgumentException, IllegalAccessException {
        Class<?> aClass = object.getClass();
        try {
            // 填充更新时间
            addOperateTime(object, aClass, "updateTime");
        } catch (NoSuchFieldException e) {
            log.error("反射获取属性异常：", e);
        }
    }

    /**
     * 填充操作时间
     *
     * @param object       入参
     * @param aClass       反射对象
     * @param propertyName 属性名（对应实体类中的属性）
     * @throws NoSuchFieldException   异常
     * @throws IllegalAccessException 异常
     */
    protected void addOperateTime(Object object, Class<?> aClass, String propertyName) throws NoSuchFieldException, IllegalAccessException {
        Field time = aClass.getDeclaredField(propertyName);
        time.setAccessible(true);
        // 获取time值
        Object createdTimeValue = time.get(object);
        if (createdTimeValue == null) {
            // 使用当前时间进行填充
            time.set(object, new Date());
        }
    }

    /**
     * 新增数据之后的操作
     */
    @PostPersist
    public void postPersist(Object object) throws IllegalArgumentException, IllegalAccessException {

    }

    /**
     * 更新数据之后的操作
     */
    @PostUpdate
    public void postUpdate(Object object) throws IllegalArgumentException, IllegalAccessException {
    }
}

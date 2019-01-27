/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.test.h2.entity.persistent;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.test.h2.entity.SuSuperEntity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 测试用户类
 * </p>
 *
 * @author hubin sjy
 */
/* 表名 value 注解【 驼峰命名可无 】, resultMap 注解测试【 映射 xml 的 resultMap 内容 】 */
@Data
@Accessors(chain = true)
@TableName("h2user")
public class H2UserMetaObjNoPk extends SuSuperEntity implements Serializable {

    /* 表字段注解，false 表中不存在的字段，可无该注解 默认 true */
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /* 主键ID 注解，value 字段名，type 用户输入ID */
    @TableField(value = "test_id")
    private Long testId;

    /* 测试忽略验证 */
    private String name;

    private Integer age;

    /*BigDecimal 测试*/
    private BigDecimal price;

    /* 测试下划线字段命名类型, 字段填充 */
    @TableField(value = "test_type", fill = FieldFill.INSERT)
    private Integer testType;

    private String desc;

    @Version
    private Integer version;
//    @TableField(value = "last_updated_dt",fill = FieldFill.UPDATE)
//    private Timestamp lastUpdatedDt;


    public H2UserMetaObjNoPk() {

    }

    public H2UserMetaObjNoPk(String name) {
        this.name = name;
    }

    public H2UserMetaObjNoPk(Integer testType) {
        this.testType = testType;
    }

    public H2UserMetaObjNoPk(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public H2UserMetaObjNoPk(Long id, String name) {
//        this.setId(id);
        this.name = name;
    }

    public H2UserMetaObjNoPk(Long id, Integer age) {
//        this.setId(id);
        this.age = age;
    }

    public H2UserMetaObjNoPk(Long id, String name, Integer age, Integer testType) {
//        this.setId(id);
        this.name = name;
        this.age = age;
        this.testType = testType;
    }

    public H2UserMetaObjNoPk(String name, Integer age, Integer testType) {
        this.name = name;
        this.age = age;
        this.testType = testType;
    }

}
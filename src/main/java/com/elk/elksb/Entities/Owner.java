package com.elk.elksb.Entities;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
public class Owner {
    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "age", type = FieldType.Integer)
    private Integer age;

    @Field(name = "isActive", type = FieldType.Boolean)
    private Boolean isActive;
}

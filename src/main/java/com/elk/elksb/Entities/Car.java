package com.elk.elksb.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Data
@Document(indexName = "car")
public class Car {
    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "yearOfRelease", type = FieldType.Integer)
    private Integer yearOfRelease;

    @Field(name = "brand", type = FieldType.Text)
    private String brand;

    @Field(name = "owners", type = FieldType.Nested)
    private List<Owner> owners;
}

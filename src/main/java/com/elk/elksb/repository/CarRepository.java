package com.elk.elksb.repository;

import com.elk.elksb.Entities.Car;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends ElasticsearchRepository<Car,String> {
}

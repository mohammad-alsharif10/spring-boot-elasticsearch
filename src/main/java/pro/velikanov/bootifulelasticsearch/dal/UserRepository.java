package pro.velikanov.bootifulelasticsearch.dal;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import pro.velikanov.bootifulelasticsearch.model.User;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {
}

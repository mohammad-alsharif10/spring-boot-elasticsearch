package pro.velikanov.bootifulelasticsearch.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Repository;
import pro.velikanov.bootifulelasticsearch.model.User;

import java.util.List;

@Repository
public class UserDALImpl implements UserDAL {

    @Autowired
    private ElasticsearchTemplate esTemplate;

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(String userId) {
        return null;
    }

    @Override
    public User addNewUser(User user) {
        return null;
    }

    @Override
    public Object getAllUserSettings(String userId) {
        return null;
    }

    @Override
    public String getUserSetting(String userId, String key) {
        return null;
    }

    @Override
    public String addUserSetting(String userId, String key, String value) {
        return null;
    }
}

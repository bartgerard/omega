package be.gerard.user.service.mapping;

import be.gerard.user.service.model.UserRecord;
import be.gerard.user.shared.v1.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * UserMapper
 *
 * @author bartgerard
 * @version v0.0.1
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User convert(UserRecord userRecord);

    UserRecord convert(User user);

}

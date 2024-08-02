package dev.elijahao.stock_trading_exchange;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends org.springframework.data.mongodb.repository.MongoRepository<User, ObjectId>{
    Optional<User> findUserByEmail(String email);
}
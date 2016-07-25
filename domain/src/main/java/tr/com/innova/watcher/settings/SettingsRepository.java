package tr.com.innova.watcher.settings;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

/**
 * Created by tozyurek on 17.06.2016.
 */
public interface SettingsRepository extends MongoRepository<PersistentSettings, BigInteger> {
    PersistentSettings findBySettingsName(String settingsName);
}

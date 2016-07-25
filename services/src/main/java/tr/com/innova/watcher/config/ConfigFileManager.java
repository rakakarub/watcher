package tr.com.innova.watcher.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.innova.watcher.settings.ConfigurationSettings;
import tr.com.innova.watcher.settings.PersistentSettings;
import tr.com.innova.watcher.settings.SettingsRepository;

/**
 * Created by mersoy on 07.04.2016.
 */

@Component
public class ConfigFileManager {
    @Autowired
    private SettingsRepository repository;

    public void writeConfigSettings(ConfigurationSettings settings) {
        PersistentSettings persistentSettings = repository.findBySettingsName(getSettingsClassName(settings.getClass()));
        if(persistentSettings != null){
            persistentSettings.setSettings(settings);
        } else {
            persistentSettings = new PersistentSettings(getSettingsClassName(settings.getClass()),settings);
        }
        repository.save(persistentSettings);
    }

    public <T extends ConfigurationSettings> T readConfigSettings(Class<T> type) {
        PersistentSettings persistentSettings = repository.findBySettingsName(getSettingsClassName(type));
        if(persistentSettings == null){
            try {
                return type.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return (T) persistentSettings.getSettings();
    }

    private <T> String getSettingsClassName(Class<T> type) {
        return type.getSimpleName().replace("Settings", "").toLowerCase();
    }
}

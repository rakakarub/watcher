package tr.com.innova.watcher.icra;

import org.springframework.stereotype.Service;

/**
 * Created by mersoy on 29.04.2016.
 */

@Service
public class IcraOlusturServiceImpl implements IcraOlusturService {


    @Override
    public IcraOlusturResponse icraOlustur(IcraOlustur parameters) {
        IcraOlusturResponse icraOlusturResponse = new IcraOlusturResponse();
        icraOlusturResponse.setIslemSonucu("basarılı");
        return icraOlusturResponse;
    }
}

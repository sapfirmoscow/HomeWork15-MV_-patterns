package ru.sberbank.homework15.mvvm;

import java.io.IOException;
import java.util.List;

import ru.sberbank.homework15.model.Picture;
import ru.sberbank.homework15.net.retrofit.ApiMapper;
import ru.sberbank.homework15.net.retrofit.RetrofitHelper;

public class MyModel {

    private final static int COUNT_OF_PICTURES = 18;//max 30
    private final ApiMapper apiMapper;
    private List<Picture> pictures;


    public MyModel() {
        apiMapper = new ApiMapper(new RetrofitHelper());
    }

    public List<Picture> getPictures() {
        try {
            return apiMapper.getPhotosSync(COUNT_OF_PICTURES);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

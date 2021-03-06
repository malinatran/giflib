package com.malinatran.giflib.data;

import com.malinatran.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "malina", true),
            new Gif("ben-and-mike", LocalDate.of(2015,2,13), "malina", false),
            new Gif("book-dominos", LocalDate.of(2015,2,13), "malina", true),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "malina", true),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "malina", false)
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }

        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}

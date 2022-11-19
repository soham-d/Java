package com.amazon.atlas22.railwaycrossingapp.db;

import java.util.Map;

public interface DAO {
    // Database Access Object --> Design Pattern
    boolean set(Object object);
    boolean delete(Object object);
    Map<String, ?> retrieve(Object object);
    Object retrieve(String key);
}

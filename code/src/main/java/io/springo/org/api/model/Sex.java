package io.springo.org.api.model;

/**
 * Created by qinzaizhen on 2017/7/3.
 */
public enum Sex {
    MALE {
        int code() {
            return 1;
        }
    },FAMALE {
        int code() {
            return 0;
        }
    };
    abstract int code();
}

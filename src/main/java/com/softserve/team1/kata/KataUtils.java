package com.softserve.team1.kata;

import com.softserve.team1.kata.impl.BaseKata;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class KataUtils {

    public static final String KATA_DIRECTORY_PATH = "com.softserve.team1.kata.impl";

    private KataUtils() {
    }

    public static Map<String, Class<? extends BaseKata>> getKataMap() {
        Reflections reflections = new Reflections(KATA_DIRECTORY_PATH);

        Set<Class<? extends BaseKata>> kataClasses = reflections.getSubTypesOf(BaseKata.class);

        Map<String, Class<? extends BaseKata>> kataMap = new HashMap<>();

        for(Class<? extends BaseKata> kataClass : kataClasses) {
            kataMap.put(extractClassNameWithoutPackages(kataClass.getName()), kataClass);
        }

        return kataMap;
    }

    public static void printKataNames(Map<String, Class<? extends BaseKata>> kataMap) {
        System.out.println("List of available kata names ------------------------------------------------------");
        System.out.println("");

        for(Map.Entry<String, Class<? extends BaseKata>> kataEntry : kataMap.entrySet()) {
            System.out.println(kataEntry.getKey());
        }

        System.out.println("");
        System.out.println("End of list -----------------------------------------------------------------------");
    }

    public static void runKataByName(Map<String, Class<? extends BaseKata>> kataMap, String kataName) {
        Class<? extends BaseKata> kataClass = kataMap.get(kataName);

        Constructor<? extends BaseKata> constructor = null;

        if(Objects.nonNull(kataClass)) {
            try {
                constructor = kataClass.getConstructor();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            BaseKata kataInstance = null;

            if(Objects.nonNull(constructor)) {
                try {
                    kataInstance = constructor.newInstance();
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

            if(Objects.nonNull(kataInstance)) {
                kataInstance.test();
            } else {
                System.out.printf("Can`t instantiate kata with name : '%s' %n", kataName);
            }
        } else {
            System.out.printf("Kata with name: '%s' not exists. Please check and try again. %n", kataName);
        }
    }

    private static String extractClassNameWithoutPackages(String nameWithPackages) {
        String[] dividedClassNameParts = nameWithPackages.split(("\\."));

        return dividedClassNameParts[dividedClassNameParts.length - 1];
    }
}

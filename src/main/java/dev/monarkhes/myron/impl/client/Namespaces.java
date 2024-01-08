package dev.monarkhes.myron.impl.client;

import com.google.common.collect.Sets;

import java.util.Set;

public class Namespaces
{
    private static final Set<String> VALID_NAMESPACES = Sets.newHashSet();

    public static void register(String namespace)
    {
        VALID_NAMESPACES.add(namespace);
    }

    public static boolean check(String namespace)
    {
        return VALID_NAMESPACES.contains(namespace);
    }
}

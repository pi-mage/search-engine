package com.pimage.searchengine.util;

import java.io.File;

public class Paths {

    public static final String pathWorkingDir = getAbsolutePath("workdir");
    public static final String pathIndexes = pathWorkingDir + "/indexes";
    public static final String pathIndex1 = pathIndexes + "/index1";

    public static final String pathResources = getAbsolutePath("src/main/resources");
    public static final String pathDataSets = pathResources + "/datasets";
    public static final String pathExempleCorpus = pathDataSets + "/example_corpus.gz";

    private static String getAbsolutePath(String path) {
        File f = new File(path);
        return f.getAbsolutePath().replace('\\', '/');
    }

    public static String ensureDirectoryExists(String path) {
        new File(path).mkdirs();
        return path;
    }

    public static String ensureParentDirectoryExists(String path) {
        new File(path).getParentFile().mkdirs();
        return path;
    }
}

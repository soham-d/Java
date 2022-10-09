package com.amazon.atlas22.fileio;

public class CopyFileContentsApp {

    static void copyContents(File sourceFile, File destinitionFile) {

        // Copy the contents of sourceFile into the destinitionFile
        // Condition: Do Not Copy Single Line Comments or Multi Line Comments

    }

    public static void main(String[] args) {

        // File1 Exists
        File file1 = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/com/amazon/atlas22/fileio/FileDemo.java");

        // File2 Does Not Exists
        File file2 = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/com/amazon/atlas22/fileio/FileAPIDemo.java");

        copyContents(file1, file2);

    }

}
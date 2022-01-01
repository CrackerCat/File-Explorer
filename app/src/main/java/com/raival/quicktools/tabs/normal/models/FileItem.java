package com.raival.quicktools.tabs.normal.models;

import android.graphics.drawable.Drawable;

import java.io.File;

public class FileItem {
    File file;
    String details;
    Drawable icon;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getName() {
        return file.getName();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public FileItem(File file, String details){
        this.file = file;
        this.details = details;
    }
}

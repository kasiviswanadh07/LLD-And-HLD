package com.viswa.patterns.behavioralpatterns.memento;

public class ApplicationConfiguration {
    private String theme;
    private int fontSize;
    private boolean notificationsEnabled;
    private String language;

    public ApplicationConfiguration(String theme, int fontSize, boolean notificationsEnabled, String language) {
        this.theme = theme;
        this.fontSize = fontSize;
        this.notificationsEnabled = notificationsEnabled;
        this.language = language;
    }
    public ConfigurationMemento save(){
        System.out.println("[+] Saving configuration state...");
        return  new ConfigurationMemento(theme, fontSize,
                notificationsEnabled, language);
    }
     // Restore state from memento
             public void restore(ConfigurationMemento memento) {
         this.theme = memento.getTheme();
         this.fontSize = memento.getFontSize();
         this.notificationsEnabled = memento.isNotificationsEnabled();
         this.language = memento.getLanguage();
        System.out.println("[+] Restored Previous Configuration State");
                 }

    public String getLanguage() {
        return language;
    }

    public boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Applicationconfiguration{" +
                "theme='" + theme + '\'' +
                ", fontSize=" + fontSize +
                ", notificationsEnabled=" + notificationsEnabled +
                ", language='" + language + '\'' +
                '}';
    }
}

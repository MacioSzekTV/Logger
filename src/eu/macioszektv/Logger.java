package eu.macioszektv;

public class Logger {
    private String projectName;
    private String className;

    public Logger(String projectName, String className){
        this.projectName = projectName;
        this.className = className;
    }

    private String logStructure = " [" + projectName + "] " + "[" + className + "] ";

    public String getProjectName(Logger this){
        return(this.projectName);
    }

    public void setProjectName(Logger this, String newName){
        this.projectName = newName;
    }

    public String getClassName(Logger this){
        return(this.className);
    }

    public void setClassName(Logger this, String newName){
        this.className = newName;
    }

    public void info(Logger this, String msg){
        System.out.println("[INFO]" + logStructure + msg);
    }

    public void alert(Logger this, String msg){
        System.out.println("[ALERT]" + logStructure + msg);
    }

    public void warn(Logger this, String msg){
        System.out.println("[WARN]" + logStructure + msg);
    }

    public void debug(Logger this, String msg){
        System.out.println("[DEBUG]" + logStructure + msg);
    }
}

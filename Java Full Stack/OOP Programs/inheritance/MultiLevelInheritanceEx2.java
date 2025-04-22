package inheritance;

import java.util.ArrayList;

class FileManager {
    private String managerName;
    private String osType;

    public FileManager() {
    	super();
    }

    public FileManager(String managerName, String osType) {
        this.managerName = managerName;
        this.osType = osType;
    }

    public void displayFileManager() {
        System.out.println("File Manager: " + managerName);
        System.out.println("Operating System: " + osType);
        System.out.println();
    }
}

class Drive extends FileManager {
    private String driveName1;
    private String driveName2;
    private String driveType;
    private int totalSize;
    private int usedSize;
    private String fileSystem;

    public Drive() {
        super();
    }

    public Drive(String managerName, String osType, String driveName1, String driveName2, String driveType,
                 int totalSize, int usedSize, String fileSystem) {
        super(managerName, osType);
        this.driveName1 = driveName1;
        this.driveName2 = driveName2;
        this.driveType = driveType;
        this.totalSize = totalSize;
        this.usedSize = usedSize;
        this.fileSystem = fileSystem;
    }

    public void displayDrives() {
        System.out.println("Drive 1: " + driveName1);
        System.out.println("Drive 2: " + driveName2);
        System.out.println("Drive Type: " + driveType);
        System.out.println("Total Size: " + totalSize + " GB");
        System.out.println("Used Size: " + usedSize + " GB");
        System.out.println("File System: " + fileSystem);
        System.out.println();
    }
}

class Folder extends Drive {
    private ArrayList<String> folderNames = new ArrayList<>();
    private String createdBy;
    private int folderSize;
    private boolean isHidden;

    public Folder() {
        super();
    }

    public Folder(String managerName, String osType, String driveName1, String driveName2, String driveType,
                  int totalSize, int usedSize, String fileSystem,
                  ArrayList<String> folderNames, String createdBy, int folderSize, boolean isHidden) {
        super(managerName, osType, driveName1, driveName2, driveType, totalSize, usedSize, fileSystem);
        this.folderNames = folderNames;
        this.createdBy = createdBy;
        this.folderSize = folderSize;
        this.isHidden = isHidden;
    }

    public void displayFolder() {
        System.out.println("Folders: " + folderNames);
        System.out.println("Created By: " + createdBy);
        System.out.println("Folder Size: " + folderSize + " MB");
        System.out.println("Hidden: " + (isHidden ? "Yes" : "No"));
        System.out.println();
    }
}

class Files extends Folder {
    private ArrayList<String> fileNames = new ArrayList<>();
    private String fileType;
    private int fileSize;
    private String createdDate;
    private boolean isReadOnly;

    public Files() {
        super();
    }

    public Files(String managerName, String osType, String driveName1, String driveName2, String driveType,
                 int totalSize, int usedSize, String fileSystem,
                 ArrayList<String> folderNames, String createdBy, int folderSize, boolean isHidden,
                 ArrayList<String> fileNames, String fileType, int fileSize, String createdDate, boolean isReadOnly) {
        super(managerName, osType, driveName1, driveName2, driveType, totalSize, usedSize, fileSystem,
              folderNames, createdBy, folderSize, isHidden);
        this.fileNames = fileNames;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.createdDate = createdDate;
        this.isReadOnly = isReadOnly;
    }

    public void displayFile() {
        System.out.println("Files: " + fileNames);
        System.out.println("File Type: " + fileType);
        System.out.println("File Size: " + fileSize + " KB");
        System.out.println("Created Date: " + createdDate);
        System.out.println("Read-Only: " + (isReadOnly ? "Yes" : "No"));
        System.out.println();
    }
}

public class MultiLevelInheritanceEx2 {
    public static void main(String[] args) {

        ArrayList<String> folders = new ArrayList<>();
        folders.add("Documents");
        folders.add("Pictures");
        folders.add("Music");
        folders.add("Videos");
        folders.add("Downloads");

        ArrayList<String> files = new ArrayList<>();
        files.add("resume.docx");
        files.add("photo.png");
        files.add("song.mp3");
        files.add("movie.mp4");
        files.add("software.zip");

        Files myFiles = new Files(
                "Windows File Manager", "Windows 11", "C:", "D:", "SSD",
                512, 300, "NTFS",
                folders, "Roshan", 1024, false,
                files, ".docx", 125, "2025-04-22", false
        );

        myFiles.displayFileManager();
        myFiles.displayDrives();
        myFiles.displayFolder();
        myFiles.displayFile();
    }
}

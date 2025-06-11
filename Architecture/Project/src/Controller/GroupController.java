package Controller;

import Model.Group;
import Model.User;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GroupController {

    public void createGroup(List<User> students, User supervisor, String projectTitle) {
        Group group = new Group(students, supervisor, projectTitle);
        
        // Write the group data to the group.txt file
        writeGroupToFile(group);
    }

    private void writeGroupToFile(Group group) {
        try {
            FileWriter writer = new FileWriter(new File("group.txt"), true);
            String groupData = "Group ID: " + group.getGroupId() + "\n";
            groupData += "Students: " + String.join(", ", group.getStudents()) + "\n";
            groupData += "Supervisor: " + group.getSupervisor().getName() + "\n";
            groupData += "Project Title: " + group.getProjectTitle() + "\n";
            groupData += "-----------------------------\n";
            
            writer.write(groupData);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

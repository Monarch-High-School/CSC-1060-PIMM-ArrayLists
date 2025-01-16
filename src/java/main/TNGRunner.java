/**
 * Runs the TeamNameGenerator class. In general you shouldn't need to change this.
 * @author J. Cihlar
 * @version 1.0
 * @since 2025-01
 */

public class TNGRunner {
    
    public static void main(String[] args) {
        TeamNameGenerator tng = new TeamNameGenerator(5);
        tng.addToPool("apple");
        tng.addToPool("table");
        tng.addToPool("penny");
        tng.addToPool("silly");
        tng.addToPool("reticulated");
        tng.addToPool("vascularization");

        String teamName = tng.createTeamName(2);
        System.out.println(teamName);

        teamName = tng.createTeamName(3);
        System.out.println(teamName);

        tng.removeFromPool(0);
        tng.removeFromPool("silly");
        tng.removeFromPool("Herculean");
        tng.removeFromPool(10);

        teamName = tng.createTeamName(3);
        System.out.println(teamName);
    }


}

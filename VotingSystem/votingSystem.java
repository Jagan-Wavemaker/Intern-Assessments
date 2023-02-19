import java.util.*;

public class votingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create a map to store the nominees and their vote counts
        Map<String, Integer> nominees = new HashMap<>();
        
        //List to store the users and their votes
        List<String> users = new ArrayList<>();
        while(true){
        System.out.println("1-->To enter number of nominees followed with names and id's");
        System.out.println("2-->Enter number of users voting followed with names and userid's");
        System.out.println("3-->to vote, enter required details");
        System.out.println("4-->Know the winner");
        System.out.println("Choose any options from the above mentioned:");
        int val = input.nextInt();
        switch(val){
            case 1:
        //Number of nominees
        System.out.print("Enter the number of nominees: ");
        int numNominees = input.nextInt();
        
        // Taking inputs of Name and ID of each nominee
        for (int i = 1; i <= numNominees; i++) {
            System.out.print("Enter nominee " + i + " name: ");
            String nomineeName = input.next();
            System.out.print("Enter nominee " + i + " ID: ");
            String nomineeID = input.next();
            nominees.put(nomineeName + " (" + nomineeID + ")", 0);
        }
        break;
        case 2:
        // Number of users to vote
        System.out.print("Enter the number of users: ");
        int numUsers = input.nextInt();
        
        // Taking Name and ID of each user
        for (int i = 1; i <= numUsers; i++) {
            System.out.print("Enter user " + i + " name: ");
            String userName = input.next();
            System.out.print("Enter user " + i + " ID: ");
            String userID = input.next();
            users.add(userName + " (" + userID + ")");
        }
        break;
        case 3:
        // Allow users to vote
        for (String user : users) {
            System.out.println("User " + user + ", please enter the name and ID of the nominee to whom you want to vote");
            String nomineeName = input.next();
            String nomineeID = input.next();
            String key = nomineeName + " (" + nomineeID + ")";
            // containskey used to check whether a particular key is being mapped into the HashMap or not
            if (nominees.containsKey(key)) {
                nominees.put(key, nominees.get(key) + 1);
                System.out.println("User " + user + " voted for " + nomineeName + " (" + nomineeID + ")");
            } else {
                System.out.println("Invalid Nominee Details.");
            }
        }
        break;
        case 4:
        // Calculating winner
        String winner = null;
        int maxVotes = -1;
        for (Map.Entry<String, Integer> entry : nominees.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
                System.out.println("Winner is " + winner + " with " + maxVotes + " votes.");
                // System.out.println(entry);
            }
        }
        // System.out.println("Winner is " + winner + " with " + maxVotes + " votes.");
        break;
    default: System.out.println("Choosen Invalid Option");
    break;
        }
    }
}
}

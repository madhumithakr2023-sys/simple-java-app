import java.util.HashSet;
import java.util.Set;

public class VotingSystem {

    private Set<String> voters = new HashSet<>();
    private int voteCount = 0;

    public String vote(String voterId) {
        if (voterId == null || voterId.isEmpty()) {
            return "Invalid voter ID";
        }

        if (voters.contains(voterId)) {
            return "Duplicate vote not allowed";
        }

        voters.add(voterId);
        voteCount++;
        return "Vote successful";
    }

    public int getVoteCount() {
        return voteCount;
    }
}

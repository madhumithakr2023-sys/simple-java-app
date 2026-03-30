import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VotingSystemTest {

    @Test
    void testValidVote() {
        VotingSystem vs = new VotingSystem();
        assertEquals("Vote successful", vs.vote("user1"));
    }

    @Test
    void testDuplicateVote() {
        VotingSystem vs = new VotingSystem();
        vs.vote("user1");
        assertEquals("Duplicate vote not allowed", vs.vote("user1"));
    }

    @Test
    void testInvalidVote() {
        VotingSystem vs = new VotingSystem();
        assertEquals("Invalid voter ID", vs.vote(""));
    }
}

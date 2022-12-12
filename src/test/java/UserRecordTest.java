import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRecordTest {
    @Test
    void name() {
        UserRecord saga = new UserRecord(1, "saga");
        assertThat(saga.id()).isEqualTo(1);
        assertThat(saga.toString()).isEqualTo("UserRecord[id=1, name=saga]");
    }
}
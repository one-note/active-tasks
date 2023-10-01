package org.collection1.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.EnumMap;

// Since this is a Enum type we don't need a main method, and we can write the Junit Test cases here

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public class EnumMapEx {

        @Test
        public void testEnumMap() {

            EnumMap<Days, String> tasks = new EnumMap<>(Days.class);


            tasks.put(Days.MONDAY, "Work on project in Monday");
            tasks.put(Days.TUESDAY, "Meet with the team on Tuesday");
            tasks.put(Days.WEDNESDAY, "Prepare presentation");
            tasks.put(Days.THURSDAY, "Review code on Friday");
            tasks.put(Days.FRIDAY, "Test new features");


            assertEquals("Work on project in Monday", tasks.get(Days.MONDAY));
            assertEquals("Meet with the team on Tuesday", tasks.get(Days.TUESDAY));
            assertEquals("Prepare presentation", tasks.get(Days.WEDNESDAY));
            assertEquals("Review code on Friday", tasks.get(Days.THURSDAY));
            assertEquals("Test new features", tasks.get(Days.FRIDAY));


            assertNull(tasks.get(Days.SATURDAY));
            assertNull(tasks.get(Days.SUNDAY));
        }


    }



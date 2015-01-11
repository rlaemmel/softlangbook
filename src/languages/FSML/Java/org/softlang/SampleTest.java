package org.softlang;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SampleTest {
		
	String[] input = {"ticket", "ticket", "pass", "pass", "ticket", "mute", "release"};
	String[] output = {"collect", "eject", "alarm", "eject"};
	
	@Test
	public void runSample() {
		assertArrayEquals(output, new FsmlSimulator(Sample.sample).run(input));
	}
}

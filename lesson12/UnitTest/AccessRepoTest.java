import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccessRepoTest {

	@Test
	void testGetGroup() {
		Group groupTest = new Group("Архитектура ПО");
		AccessRepo accessRepoTest = new AccessRepo(new User("Алексей"), groupTest);
		assertEquals(groupTest, accessRepoTest.getGroup());
	}

	@Test
	void testGetUser() {
		User userTest = new User("Алексей");
		AccessRepo accessRepoTest = new AccessRepo(userTest, new Group("Архитектура ПО"));
		assertEquals(userTest, accessRepoTest.getUser());
	}

	@Test
	void testSetGroup() {
		AccessRepo accessRepoTest = new AccessRepo(new User("Алексей"), new Group("Архитектура ПО"));
		Group groupTest = new Group("Парадигмы");
		accessRepoTest.setGroup(groupTest);
		assertEquals(groupTest, accessRepoTest.getGroup());
	}

	@Test
	void testSetUser() {
		AccessRepo accessRepoTest = new AccessRepo(new User("Алексей"), new Group("Архитектура ПО"));
		User userTest = new User("Алексей Баринов");
		accessRepoTest.setUser(userTest);
		assertEquals(userTest, accessRepoTest.getUser());
	}
}

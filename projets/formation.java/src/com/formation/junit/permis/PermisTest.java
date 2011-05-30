package com.formation.junit.permis;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value={
CandidatTest.class,
CandidatServiceTest.class,
CandidatDAOConnectionTest.class,
CandidatDAOTest.class,
})
public class PermisTest {
}
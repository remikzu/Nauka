package pl.sda.ModyfikatoryDostepu.Nauka.Public;

public class MaliciousUser {

    public void countMyVisit(PublicVisitCounter counter) {
        counter.increment();
        counter.userCount = -10;
    }

}

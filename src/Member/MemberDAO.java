package Member;

public abstract class MemberDAO {

    // DAO는 회원 객체를 받아 저장 동작만 정의하도록 단순하게 정리했다.
    public abstract void addMember(Member member);
}

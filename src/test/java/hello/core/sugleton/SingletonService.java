package hello.core.sugleton;

public class SingletonService {

    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    //2. 외부에서는 이것만 이용
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자는 외부에서 호출 못하게 막고
    private SingletonService() {}
    
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}

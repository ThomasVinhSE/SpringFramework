package vinhnq27.springframework.springbootapplication;

public class SomeController {
    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}

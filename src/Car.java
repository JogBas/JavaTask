public class Car //extends Motor
{

    private String model;

    //композиция
    private Motor motor;
    //добавляем конструктор для motor и model
    public Car(String model, Motor motor) {
        this.model = model;
        this.motor = motor;
    }

    public void start() {
        motor.start();

    }
    public void stop(){
        motor.stop();
    }


    //наследование не корретно необходимо использовать композицию
    //@Override
    //public void start() {
    //    super.start();
    //}

    //@Override
    //public void stop() {
    //    super.stop();
    //}

}

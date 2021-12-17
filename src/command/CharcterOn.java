package command;


public class CharcterOn implements Command {
    Character charcter =new Character();
    @Override
    public void excute() {
        charcter.charcterOnBoat();
    }

    @Override
    public void unexcute() {
        charcter.charcterOffBoat();
    }
}

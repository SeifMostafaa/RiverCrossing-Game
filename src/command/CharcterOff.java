package command;




public class CharcterOff implements Command {
    Character charcter =new Character();
    @Override
    public void excute() {
        charcter.charcterOffBoat();
    }

    @Override
    public void unexcute() {
        charcter.charcterOnBoat();
    }
}

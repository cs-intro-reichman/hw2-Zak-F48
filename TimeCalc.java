public class TimeCalc {
    public static void main(String[] args) {
        String givenTime = args[0]; 
        int addedMinutes = Integer.parseInt(args[1]);
        String[] timeParts = givenTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int totalMinutes = (hours * 60 ) + minutes + addedMinutes;
        int totalHours = (totalMinutes / 60 );
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        System.out.print(newHours + ":" + newMinutes);

    }
}

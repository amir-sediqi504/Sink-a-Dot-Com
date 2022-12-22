public class Main {
    public static void main(String[] args) {
        int numOfGUesses = 0;
        Gamehelper helper = new Gamehelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int locations[] = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Enter a number: ");
            System.out.println("u guesed : " + guess);
            String result = theDotCom.checkYourself(guess);
            numOfGUesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("you took " + numOfGUesses + " guesses");
            }

        }
    }
}
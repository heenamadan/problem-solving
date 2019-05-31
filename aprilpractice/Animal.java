package aprilpractice;


 abstract class Animal {

    protected boolean isMammel;
    protected  boolean isCarnivore;

    public Animal(boolean isMammel, boolean isCarnivore){
        this.isCarnivore= isCarnivore;
        this.isMammel= isMammel;

    }

    public abstract String getGreeting();

    public boolean getIsCarnivore(){
        return this.isCarnivore;
    }

    public boolean getIsMammel(){
        return this.isMammel;
    }

    public void  printAnimal(String name){
        System.out.println("A " + name + " says" + this.getGreeting() +"is" +
                (this.getIsCarnivore() ? "" :" not") +" carnivorus and is " +(this.getIsMammel()?"" :"not") + " a Mammel");
    }


}

package com.tjplaysnow.ecgj.game.main;

public class Transition
{
    public int Reward;//To be erased
    public String Name;
    public double Probability;//To be erased

    public Transition(String Name, int Reward,  double Probability)
    {
        this.Reward = Reward;//To be erased
        this.Name = Name;
        if(Probability > 1.0)//To be erased
            this.Probability = 1.0;
        this.Probability = Probability;//To be erased
    }

}

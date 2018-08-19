//package com.tjplaysnow.ecgj.game.main;
//
//import java.util.ArrayList;
//
//public class Scenes
//{
//    public ArrayList<Scenes> Node = new ArrayList<>();//This will keep track of which scenes the user can move from this one
//    public ArrayList<Transition> NextNode = new ArrayList<>();//This will be use to identify which action can move you to the
//    //next scene (Node and NextNode need to match. example-> "action go to the mines" would be in index 0 of nextnode and
//    // "scene mine" would be in index 0 of Node
//    public ArrayList<String> States = new ArrayList<>();//This is for debugging purposes
//    private String Time;//to be deleted
//    private String Name;//Name of the scene
//    private int Index;//which number this scene is . Example mines would be 5 and house 1
//
//    public Scenes(String Name, String Time, int Index)
//    {
//        this.Time = Time;
//        this.Name = Name;
//        this.Index = Index;
//    }
//
//    public void AddNode(Scenes node, Transition NewNode)//which node is next to this node
//    {
//        NextNode.add(NewNode);
//        Node.add(node);
//        if(!States.contains(NewNode.Name))
//        {
//            States.add(NewNode.Name);
//        }
//    }
//
//    public String NodeName()//Quick and secure access to the name
//    {
//    {
//        return Name;
//    }
//
//    public String NodeTime()//to be deleted
//    {
//        return Time;
//    }
//
//    public int NodeIndex()//Quick and secure access to the index
//    {
//        return Index;
//    }
//
//
//
//}
//
//
//
//
//

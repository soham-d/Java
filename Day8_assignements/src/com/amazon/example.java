package com.amazon.atlas.casestudy;

interface Notification{

    void notifyUser(String message);
}

// Reference Variable of Notification can refer to the Object of User 😊
class User implements Notification{

    String name;
    String phone;
    String email;

    public User(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public User() {

    }

    public void notifyUser(String message)
    {
        System.out.println("Hello "+message);
    }
}

class YoutubeChannel extends User{

    String channelName;
    int numberOfSubscribedUsers;
    int totalVideos;

    public YoutubeChannel(String channelName, int numberOfSubscribedUsers, int totalVideos) {
        super();
        this.channelName = channelName;
        this.numberOfSubscribedUsers = numberOfSubscribedUsers;
        this.totalVideos = totalVideos;
    }

    public YoutubeChannel() {

        this("NA",0,0);
    }

    void subscribe(User user) {

        notifyUser(user.name+","+channelName+" Subscribed Successfully");

    }

    public void uploadVideo(String videoName, User user) {

        System.out.println("Video "+ videoName+" uploaded successfully");
        notifyUser(user.name+"New Video Uploaded");
    }

}

public class example {

    public static void main(String[] args) {


        YoutubeChannel channel = new YoutubeChannel("Amazing Videos Channel",1000,10);
        User user = new User("Sheeraz","1234567890","sheeraz@gmail.com");

        channel.subscribe(user);

        channel.uploadVideo("How to get rich?",user);


    }

}
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class Dropdown extends JFrame {
    private String [] emotions ={"Happy", "Sad", "Angry", "Stressed","Hip Hop", "Teen Pop", "Classical", "Pop"};

    private JTextField heading = new JTextField("Your Mood Today: ");

    private JTextField SelectedEmotionField = new JTextField(35);

    private JComboBox boxOfEmotions = new JComboBox();

    private JTextField HappySongs = new JTextField(30);

    private JTextField HappySong = new JTextField(30);

    private String [] Happy = {"Happy by Pharell Williams","Best day of my life by One Republic", "Best Song Ever by One Direction", "Johnny B. Goode by Chuck Berry" +
            " I got a feeling by Black Eyed Peas", " Shake it Off by Taylor Swift", "Firework by Katy Perry", "I Don't Care by Ed Sheeran and Justin Bieber",
            "Feels by Calvin Harris","One Dance by Drake"};
    private String [] Sad = {"Before you go by Lewis Capaldi","Supermarket Flowers by Ed Sheeran", "Falling by Harry Styles", "Someone Like You by Adele",
            "When The Party Is Over by Billie Eilish", "The Scientist by Coldplay", "Let Her Go by Passenger", "Falling Like the Stars by James Arthur",
            "Say Something by A Great Big World", " If the World was Ending by JP Saxe, Julia Michaels", "See You Again by Wiz Khalifa ft. Charlie Puth"};
    private String [] Angry = {"IDGAF by Dua Lipa","Numb by Linkin Park", "So What by P!nk", " Somebody that I used to know by Gotye", "The Four Horsemen by Metallica"};
    private String [] Stressed = {"Stressed out by 21 Pilots","Bye Bye Bye by NSYNC", "Viva La Vida by Coldplay", "The Lazy Song by Bruno Mars",
            "Everything has Changed by Taylor Swift and Ed Sheeran", "Eye of the Tiger by Survivor", "Let it Be by the Beatles",
            "Hymn for the Weekend by Coldplay","Fireflies by Owl City", "Safe and Sound by Capital Cities"};
    private String [] HipHop = {"Holy Grail by Jay-Z ft. Justin Timberlake", "Wake up in the Sky by Gucci Mane, Bruno Mars, and Kodak Black",
            "XO Tour Llif 3 by Lil Uzi Vert", "The Race by Tay-K", "Feeling by Juice WRLD", "Bad and Boujee by Migos", "Broke in a Minute by Torey Lanez"
            ,"Mood by 24kGoldn", "FN by Lil TJay", "Stargazing by Travis Scott"};
    private String [] TeenPop= {"What Makes You Beautiful by One Direction", "She Looks so Perfect by 5 Seconds of Summer",
            "I want it that way by Backstreet Boys", "Broken by Lovely The Band", "Call me Maybe by Carly Rae Jepsen", "Baby by Justin Bieber",
            "Burning Up by The Jonas Brothers", "Party in the USA by Miley Cyrus", "Classic by MKTO", "Dynamite by BTS"};
    private String [] Classical= {"Introduction and Rondo Capriccioso by Camille Saint-Saens", "Symphony No.25 by W.A Mozart",
            "Symphony No.5 by Franz Schubert", "Polonaise Brilliante by Henryk Wienwaski", "Symphony No.5 by Beethoven","Winter Wind by Chopin","Cello Concerto No.1 by Haydn",
            "The Blue Danube by Strauss", "Violin Concerto No.1 by Paganini", "Symphony No.5 by Shostakovich"
    };
    private String [] Pop= {"Alive by FMLBND", "Just the Way You Are by Bruno Mars", "We Found Love by Rihanna ft. Calvin Harris","Payphone by Maroon 5",
            "Wake Me Up by Avicii", "Bang Bang by Nicki Minaj, Ariana Grande, and Jessie J", "PILLOWTALK by Zayn", "Shape of You by Ed Sheeran",
            "Havana by Camila Cabello", "bad guy by Billie Eilish", "Stitches by Shawn Mendes"};

    private enum Emotions {
        HAPPY,
        SAD,
        STRESSED,
        ANGRY,
        HIPHOP,
        TEENPOP,
        CLASSICAL,
        POP
    }
    private Emotions currentEmotion;



    public Dropdown() {


        for (int i = 0; i < emotions.length; i++) {
            boxOfEmotions.addItem(emotions[i]);
        }

        HappySongs.setEditable(false);
        HappySong.setEditable(false);
        heading.setEditable(false);
        SelectedEmotionField.setEditable(false);



        boxOfEmotions.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent event) {
                                                SelectedEmotionField.setText("I take it that you want to listen to some " + ((JComboBox) event.getSource()).getSelectedItem() + " songs/pieces today");
                                            }
                                        }
        );

        this.setLayout(new FlowLayout());
        this.add(heading);
        this.add(SelectedEmotionField);
        this.add(boxOfEmotions);

        boxOfEmotions.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (boxOfEmotions.getSelectedItem().equals("Happy")){
                    currentEmotion=Emotions.HAPPY;
                    int i = (int) (Math.random() * 9);
                    HappySong.setText(Happy[i]);
                    HappySongs.setText("Listen to this Happy Song: ");

                }
                else if (boxOfEmotions.getSelectedItem().equals("Sad")) {
                    currentEmotion = Emotions.SAD;
                    int k = (int) (Math.random() * 10);
                    HappySong.setText(Sad[k]);
                    HappySongs.setText("Listen to this Sad Song: ");
                }
                else if (boxOfEmotions.getSelectedItem().equals("Angry")) {
                    currentEmotion = Emotions.ANGRY;
                    int j = (int) (Math.random() * 3);
                    HappySong.setText(Angry[j]);
                    HappySongs.setText("Listen to this Raging Song: ");
                }
                else if (boxOfEmotions.getSelectedItem().equals("Stressed")) {
                    currentEmotion=Emotions.STRESSED;
                    int k = (int) (Math.random() * 9);
                    HappySong.setText(Stressed[k]);
                    HappySongs.setText("Listen to this Stress Relieving Song: " );
                }
                else if (boxOfEmotions.getSelectedItem().equals("Hip Hop")) {
                    currentEmotion=Emotions.HIPHOP;
                    int k = (int) (Math.random() * 9);
                    HappySong.setText(HipHop[k]);
                    HappySongs.setText("Listen to this Hip Hop Song: " );
                }
                else if (boxOfEmotions.getSelectedItem().equals("Teen Pop")) {
                    currentEmotion=Emotions.TEENPOP;
                    int k = (int) (Math.random() * 9);
                    HappySong.setText(TeenPop[k]);
                    HappySongs.setText("Listen to this Teen Pop Song: " );
                }
                else if (boxOfEmotions.getSelectedItem().equals("Classical")) {
                    currentEmotion=Emotions.CLASSICAL;
                    int k = (int) (Math.random() * 9);
                    HappySong.setText(Classical[k]);
                    HappySongs.setText("Listen to this Classical Piece: " );
                }
                else if (boxOfEmotions.getSelectedItem().equals("Pop")) {
                    currentEmotion=Emotions.POP;
                    int k = (int) (Math.random() * 10);
                    HappySong.setText(Pop[k]);
                    HappySongs.setText("Listen to this Pop Song: " );
                }

            }});
        this.add(HappySongs);
        this.add(HappySong);
    }

    public static void main(String[]args){
        JFrame frame = new Dropdown();
        frame.setTitle("Song Recommender");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);
    }
}
package org.explement;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.application.Platform;

public class PrimaryController implements Initializable {
    @SuppressWarnings("exports") @FXML 
    public ImageView operatorCard;
    @SuppressWarnings("exports") @FXML
    public Label operatorName;
    @SuppressWarnings("exports") @FXML 
    public Label operatorQuote;
    @SuppressWarnings("exports") @FXML
    public Button attackerRollButton;
    @SuppressWarnings("exports")  @FXML
    public Button defenderRollButton;

    private HashMap<String, String> defQuotes = new HashMap<String, String>();
    private HashMap<String, String> atkQuotes = new HashMap<String, String>();
    
    private int previousOpIndex = 0;

    @SuppressWarnings("exports")
    public static Stage stage;

    @Override
    public void initialize(URL location, ResourceBundle resources) { // Initiliaze the hashmap's contents
        atkQuotes.put("ACE", "Hole in the wall".toUpperCase());
        defQuotes.put("ALIBI", "This is gonna be fun".toUpperCase());
        atkQuotes.put("AMARU", "I'm coming in hot".toUpperCase());
        defQuotes.put("ARUNI", "No entry".toUpperCase());
        atkQuotes.put("ASH", "Stay behind me".toUpperCase());
        defQuotes.put("AZAMI", "This wall is mine".toUpperCase());        
        
        defQuotes.put("BANDIT", "Shocking isn't it".toUpperCase());
        atkQuotes.put("BLACKBEARD", "I'm with you".toUpperCase());
        atkQuotes.put("BLITZ", "Flash incoming".toUpperCase());
        atkQuotes.put("BRAVA", "Hacking in progress".toUpperCase());
        atkQuotes.put("BUCK", "Breach and clear".toUpperCase());       

        atkQuotes.put("CAPITAO", "Fire in the hole".toUpperCase());
        defQuotes.put("CASTLE", "Barricade deployed".toUpperCase());
        defQuotes.put("CAVEIRA", "Silent steps".toUpperCase());
        defQuotes.put("CLASH", "Shield ready".toUpperCase());        

        atkQuotes.put("DEIMOS", "Fear the unknown".toUpperCase());
        defQuotes.put("DOC", "Doctor's in".toUpperCase());
        atkQuotes.put("DOKKAEBI", "Got a surprise for you".toUpperCase());

        defQuotes.put("ECHO", "Mind the Yokai".toUpperCase());
        defQuotes.put("ELA", "Concussion mine ready".toUpperCase());

        defQuotes.put("FENRIR", "Nightmare fuel".toUpperCase());
        atkQuotes.put("FINKA", "Adrenal surge incoming".toUpperCase());
        atkQuotes.put("FLORES", "Explosive delivery just for you".toUpperCase());
        defQuotes.put("FROST", "Welcome mat deployed".toUpperCase());
        atkQuotes.put("FUZE", "Cluster charge live".toUpperCase());
       
        atkQuotes.put("GLAZ", "Target in sight".toUpperCase());
        defQuotes.put("GOYO", "Fire in position".toUpperCase());
        atkQuotes.put("GRIDLOCK", "Traps deployed".toUpperCase());
        atkQuotes.put("GRIM", "Swarm unleashed".toUpperCase());
        
        atkQuotes.put("HIBANA", "Let's burn it down".toUpperCase());
        
        atkQuotes.put("IANA", "I'm seeing double".toUpperCase());        
        atkQuotes.put("IQ", "Seeing is believing".toUpperCase());
        
        atkQuotes.put("JACKAL", "Tracking a footprint".toUpperCase());
        defQuotes.put("JAGER", "Grenades are useless now".toUpperCase());
        
        defQuotes.put("KAID", "Electrified the wall".toUpperCase());
        atkQuotes.put("KALI", "Target in sight".toUpperCase());
        defQuotes.put("KAPKAN", "Trap set".toUpperCase());
        
        defQuotes.put("LESION", "Poison in place".toUpperCase());
        atkQuotes.put("LION", "Scanning the perimeter".toUpperCase());
        
        defQuotes.put("MAESTRO", "Smile for the camera".toUpperCase());
        atkQuotes.put("MAVERICK", "Torch ready".toUpperCase());
        defQuotes.put("MELUSI", "Banshee deployed".toUpperCase());
        defQuotes.put("MIRA", "Black Mirror online".toUpperCase());
        atkQuotes.put("MONTAGNE", "Shield up".toUpperCase());
        defQuotes.put("MOZZIE", "Got the drone".toUpperCase());
        defQuotes.put("MUTE", "Signal disrupted".toUpperCase());
        
        atkQuotes.put("NOKK", "Silent but deadly".toUpperCase());
        atkQuotes.put("NOMAD", "Airjab ready".toUpperCase());
        
        defQuotes.put("ORYX", "Busting through".toUpperCase());
        atkQuotes.put("OSA", "Deploying shield".toUpperCase());
        
        defQuotes.put("PULSE", "Heartbeat detected".toUpperCase());        

        atkQuotes.put("RAM", "Breacher coming in hot".toUpperCase());
        defQuotes.put("ROOK", "Time for some serious protection".toUpperCase());

        atkQuotes.put("SENS", "R.O.U projector deployed".toUpperCase());
        defQuotes.put("SENTRY", "Guarding the perimeter".toUpperCase());
        
        defQuotes.put("SKOPOS", "Healings not going to work".toUpperCase());
        atkQuotes.put("SLEDGE", "Time to break stuff".toUpperCase());
        defQuotes.put("SMOKE", "Poison cloud ready".toUpperCase());
        atkQuotes.put("SOLIS", "Eyes on the prize".toUpperCase());
        atkQuotes.put("STRIKER", "We will win this".toUpperCase());        

        defQuotes.put("TACHANKA", "LMG MOUNTED AND LOADED".toUpperCase());
        atkQuotes.put("THATCHER", "Fuckin laser sights".toUpperCase());
        atkQuotes.put("THERMITE", "A really big fucking hole coming right up".toUpperCase());
        defQuotes.put("THORN", "Surprise grenade".toUpperCase());
        defQuotes.put("THUNDERBIRD", "Healing station ready".toUpperCase());
        defQuotes.put("TUBARAO", "Slowing things down".toUpperCase());
        atkQuotes.put("TWITCH", "Shock drone deployed".toUpperCase());
        
        defQuotes.put("VALKYRIE", "I've got eyes everywhere".toUpperCase());
        defQuotes.put("VIGIL", "You can't see me".toUpperCase());
        
        defQuotes.put("WAMAI", "Magnets online".toUpperCase());
        defQuotes.put("WARDEN", "Smoke grenades are useless".toUpperCase());
        
        atkQuotes.put("YING", "Candela out".toUpperCase());
        
        atkQuotes.put("ZERO", "Intel secured".toUpperCase());
        atkQuotes.put("ZOFIA", "Time for action".toUpperCase());        

        //*  Handle configuration warnings
        if (Configuration.roll && Configuration.rollTime == 0) System.out.println("WARNING: 'Configuration.rollTime' IS SET TO 0, 'Configuration.roll' STATE DOES NOT MATTER");
        if (Configuration.rollTime < 0) System.out.println("WARNING: 'Configuration.rollTime' IS SET TO A NEGATIVE VALUE, THIS WILL CAUSE SCRIPT TO NOT BEHAVE AS INTENDED");
        if (Configuration.debug) System.out.println("WARNING: DEBUG MODE ENABLED"); 
    }

    public void selectDefender() { // Select defender
        if (Configuration.roll) { // If roll is enabled
            Timer timer = new Timer();

            TimerTask pickOp = new TimerTask() {
                public void run() {
                    pickOperator(true);
                }
            };

            TimerTask stopPick = new TimerTask() {
                public void run() {
                    pickOp.cancel();
                    timer.cancel();
                    
                    attackerRollButton.setDisable(false);
                    defenderRollButton.setDisable(false);

                    if (Configuration.debug) System.out.println("Stopped");
                }
            };

            attackerRollButton.setDisable(true);
            defenderRollButton.setDisable(true);

            stage.setOnCloseRequest(e -> {
                pickOp.cancel();
                timer.cancel();
            });

            if (Configuration.delayOperatorSelection) timer.scheduleAtFixedRate(pickOp, 0l, (long) clamp(Configuration.operatorSelectionDelay, 10, Configuration.rollTime));
            else timer.scheduleAtFixedRate(pickOp, 0, 100);

            timer.schedule(stopPick, Configuration.rollTime);
        } else { // If roll is disabled
            pickOperator(true);
        }
    }

    public void selectAttacker() { // Select attacker
        if (Configuration.roll) { // If roll is enabled
            Timer timer = new Timer();

            TimerTask pickOp = new TimerTask() {
                public void run() {
                    pickOperator(false);
                }
            };

            TimerTask stopPick = new TimerTask() {
                public void run() {
                    pickOp.cancel();
                    timer.cancel();
                    
                    attackerRollButton.setDisable(false);
                    defenderRollButton.setDisable(false);

                    if (Configuration.debug) System.out.println("Stopped");
                }
            };

            attackerRollButton.setDisable(true);
            defenderRollButton.setDisable(true);

            stage.setOnCloseRequest(e -> {
                pickOp.cancel();
                timer.cancel();
            });
            
            if (Configuration.delayOperatorSelection) timer.scheduleAtFixedRate(pickOp, 0l, (long) clamp(Configuration.operatorSelectionDelay, 10, Configuration.rollTime));
            else timer.scheduleAtFixedRate(pickOp, 0, 100);

            timer.schedule(stopPick, Configuration.rollTime);
        } else { // If roll is disabled
            pickOperator(false);
        }
    }

    public static float clamp(float val, int min, int max) { // Clamp a value between a min and maxa
        return Math.max(min, Math.min(max, val));
    }

    public void pickOperator(boolean isDefender) { // Pick operator
        if (Configuration.mergeHashMaps) { // Both attack and defense
            HashMap<String, String> merged = new HashMap<String, String>();
            merged.putAll(atkQuotes);
            merged.putAll(defQuotes);

            Random rand_op = new Random();
        
            int opIndex = rand_op.nextInt(merged.size()) + 1; 
    
            if (previousOpIndex != 0) {
                while (opIndex == previousOpIndex) {
                    opIndex = rand_op.nextInt(merged.size()) + 1;
                    if (opIndex != previousOpIndex) {
                        break;
                    }
                }
            }
    
            int i = 1;
    
            for (String key : merged.keySet()) {
                if (i == opIndex) {
                    if (Configuration.debug) System.out.println(key);
                    Platform.runLater(() -> {
                        operatorName.setText(key);
                        operatorQuote.setText("\"" + merged.get(key) + "\"");
    
                        Image cardPath = new Image(App.class.getResourceAsStream("/org/explement/operator-images/" + key.toLowerCase() + "-card.png"));
                        operatorCard.setImage(cardPath);
                    });
                    break;
                }
                i++;
            }
    
            if (Configuration.debug) System.out.println("ID: " + opIndex);
        } else if (!isDefender) { // Attacker
            Random rand_op = new Random();
        
            int opIndex = rand_op.nextInt(atkQuotes.size()) + 1; 
    
            if (previousOpIndex != 0) {
                while (opIndex == previousOpIndex) {
                    opIndex = rand_op.nextInt(atkQuotes.size()) + 1;
                    if (opIndex != previousOpIndex) {
                        break;
                    }
                }
            }
    
            int i = 1;
    
            for (String key : atkQuotes.keySet()) {
                if (i == opIndex) {
                    if (Configuration.debug) System.out.println(key);
                    Platform.runLater(() -> {
                        operatorName.setText(key);
                        operatorQuote.setText("\"" + atkQuotes.get(key) + "\"");
    
                        Image cardPath = new Image(App.class.getResourceAsStream("/org/explement/operator-images/" + key.toLowerCase() + "-card.png"));
                        operatorCard.setImage(cardPath);
                    });
                    break;
                }
                i++;
            }
    
            if (Configuration.debug) System.out.println("ID: " + opIndex);
        } else { // Defender
            Random rand_op = new Random();
        
            int opIndex = rand_op.nextInt(defQuotes.size()) + 1; 
    
            if (previousOpIndex != 0) {
                while (opIndex == previousOpIndex) {
                    opIndex = rand_op.nextInt(defQuotes.size()) + 1;
                    if (opIndex != previousOpIndex) {
                        break;
                    }
                }
            }
    
            int i = 1;
    
            for (String key : defQuotes.keySet()) {
                if (i == opIndex) {
                    if (Configuration.debug) System.out.println(key);
                    Platform.runLater(() -> {
                        operatorName.setText(key);
                        operatorQuote.setText("\"" + defQuotes.get(key) + "\"");
    
                        Image cardPath = new Image(App.class.getResourceAsStream("/org/explement/operator-images/" + key.toLowerCase() + "-card.png"));
                        operatorCard.setImage(cardPath);
                    });
                    break;
                }
                i++;
            }
    
            if (Configuration.debug) System.out.println("ID: " + opIndex);
        }
    }
}
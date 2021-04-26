import java.util.Arrays;

public class Sound {
    private int[] samples;

    public Sound(int[] s){
        samples = s;
    }

    public int limitAmplitude(int limit)
    {
        int numChanged = 0;
        for(int i = 0; i < samples.length; i++ ){
            if(samples[i] < -limit){
                samples[i] = -limit;
                numChanged++;
            }
            if (samples[i] > limit){
                samples[i] = limit;
                numChanged++;
            }
        }
        return numChanged;
    }

    public int[] trimSilenceFromBeginning(){
        int last0 = -1;
        for(int i=0;i<samples.length;i++){
            if(samples[i]==0){
                last0++;
            }
        }
        return Arrays.copyOfRange(samples, last0+1, samples.length);
    }


}

package com.example.voice_recorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class infoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView msgaboutADC = (TextView) findViewById(R.id.msgaboutADC);
        TextView msgaboutSample = (TextView) findViewById(R.id.msgaboutSample);
        TextView msgaboutAlia = (TextView) findViewById(R.id.msgaboutAlia);
        TextView msgaboutTheorem = (TextView) findViewById(R.id.msgaboutTheorem);
        TextView msgaboutQuant = (TextView) findViewById(R.id.msgaboutQuant);
        TextView msgaboutEncoder = (TextView) findViewById(R.id.msgaboutEncoder);
        TextView msgaboutHold = (TextView) findViewById(R.id.msgaboutHold);
        TextView msgaboutApp = (TextView) findViewById(R.id.msgaboutApp);



        //printing the ADC
        msgaboutADC.setText(" ADC stands for analog to digital converter. It is an electronic device used for converting an analog signal into a digital signal." +
                " The analog input signal of ADC is continuous time & continuous amplitude signal. The output of ADC is a discrete time and discrete amplitude digital signal." +
                " The analog signal is first applied to the ‘sample‘ block where it is sampled at a specific sampling frequency. The sample amplitude value is maintained and held in" +
                " the ‘hold‘ block. It is an analog value. The hold sample is quantized into discrete value by the ‘quantize‘ block. At last, the ‘encoder‘ converts the discrete amplitude " +
                " into a binary number. ");


        //printing the sampling
        msgaboutSample.setText(" The sample block function is to sample the input analog signal at a specific time interval. The samples are taken in continuous amplitude & possess real value but they are discrete with respect to time." +
                " The sampling frequency plays important role in the conversion. So it is maintained at a specific rate. The sampling rate is set according to the requirement of the system ");


        //printing the aliasing
        msgaboutAlia.setText(" If the sampling rate is very low then the resultant signal will not look anything like the original signal. In fact, it will become a different signal after reconstruction. This problem is known as aliasing.\n" +
                "\n" +
                "To avoid this problem, the sampling rate should be kept higher than twice the frequency of the input signal. Anti-aliasing filters are also used for removing the frequency components higher than one half of the sampling rate. it blocks the aliasing components from being sampled. ");


        //printing the theorem
        msgaboutTheorem.setText(" Nyquist criteria suggest the minimum possible sampling rate for an analog signal which can be reconstructed successfully. " +
                " If the highest frequency of the analog signal is f, the signal can be reconstructed successfully from its samples, if the samples are taken at" +
                " a sampling frequency greater than 2f. ");


        msgaboutQuant.setText(" This block is used for quantization. It converts the analog or continuous amplitude into discrete amplitude.\n" +
                "\n" +
                " The on hold continuous amplitude value in hold block goes through ‘quantize’ block & " +
                " becomes discrete in amplitude. The signal " +
                " is now in digital form as it has discrete time & discrete amplitude. ");

        msgaboutEncoder.setText(" The encoder block converts the digital signal into binary form i.e. into bits.\n" +
                "\n" +
                "As we know that the digital devices operate on binary signals so it is necessary to convert the digital signal into the binary form using the Encoder.\n" +
                "\n" +
                "This is the whole process of converting an Analog signal into digital form using an Analog to Digital Converter. This whole conversion occurs in a microsecond.\n" +
                "\n" +
                "Related Post: Binary Multiplier – Types & Binary Multiplication Calculator ");

        msgaboutHold.setText(" The second block used in ADC is the ‘Hold’ block. It has no function. It only holds the sample amplitude " +
                " until the next sample is taken. The hold value remains unchanged till the next sample. ");

        msgaboutApp.setText(" In the modern world of growing technology, we are dependent on digital devices. These digital devices operate on the digital signal. But not every quantity is in digital form instead they are in analog form. So an ADC is used for converting analog signals into digital signals. The applications of ADC are limitless. Some of these applications given below:\n" +
                "\n" +
                "Cell phones operate on the digital voice signal. Originally the voice is in analog form, which is converted through ADC before feeding to the cell phone transmitter.\n" +
                "Images and videos captured using camera is stored in any digital device, is also converted into digital form using ADC.\n" +
                "Medical Imaging like x-ray & MRI also uses ADC to convert images into Digital form before modification. They are then modified for better understanding.\n" +
                "Music from the cassette is also converted into the digital form such as CDs and thumb drives using ADC converters.\n" +
                "Digital Oscilloscope also contains ADC for converting Analog signal into a digital signal for display purposes & different other features.\n" +
                "Air conditioner contains temperature sensors for maintaining the room temperature. This temperature is converted into digital form using ADC so that onboard controller can read & adjust the cooling effect. ");
    }
}
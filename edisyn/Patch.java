/***
    Copyright 2020 by Sean Luke
    Licensed under the Apache License version 2.0
*/

package edisyn;
import edisyn.util.*;

/**
   Sysex data for a single patch
*/

public class Patch
    {
    public boolean bulk;
    public byte[][] sysex;
    public int synth;
    public String name = null;
    int index = 0;
    
    public Patch(int synth, byte[][] sysex, boolean bulk)
        {
        this.synth = synth;
        this.sysex = sysex;
        this.bulk = bulk;
        } 
    
    public String toString()
        {
        String s = "Patch[" + name + ", " + synth + ", " + bulk + ", " + index + ", " + sysex.length + "\n";
        for(int i = 0; i < sysex.length; i++)
            {
            s = s + ("" + i + " (" + sysex[i].length + ") ->");
            for(int j = 0; j < sysex[i].length; j++)
                {
                s = s + (" " + StringUtility.toHex(sysex[i][j]));
                }
            s = s + "\n";
            }
        return s + "\n] ";
        }
        
    }
        

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derbytest;

/**
 *
 * @author deh
 */
public class PccFinal {

public static final int NONE                    = 0;	//  No payload bytes                               
public static final int FF                      = 1;	//  [0]-[3]: Full Float                            
public static final int FF_FF                   = 2;	//  [0]-[3]: Full Float[0]; [4]-[7]: Full Float[1] 
public static final int U32                     = 3;	//  [0]-[3]: uint32_t                              
public static final int U32_U32                 = 4;	//  [0]-[3]: uint32_t[0]; [4]-[7]: uint32_t[1]     
public static final int U8_U32                  = 5;	//  [0]: uint8_t; [1]-[4]: uint32_t                
public static final int S32                     = 6;	//  [0]-[3]: int32_t                               
public static final int S32_S32                 = 7;	//  [0]-[3]: int32_t[0]; [4]-[7]: int32_t[1]       
public static final int U8_S32                  = 8;	//  [0]: int8_t; [4]-[7]: int32_t                  
public static final int HF                      = 9;	//  [0]-[1]: Half-Float                            
public static final int F34F                    = 10;	//  [0]-[2]: 3/4-Float                             
public static final int xFF                     = 11;	//  [0]:[1]-[4]: Full-Float, first   byte  skipped 
public static final int xxFF                    = 12;	//  [0]:[1]:[2]-[5]: Full-Float, first 2 bytes skipped
public static final int xxU32                   = 13;	//  [0]:[1]:[2]-[5]: uint32_t, first 2 bytes skipped
public static final int xxS32                   = 14;	//  [0]:[1]:[2]-[5]: int32_t, first 2 bytes skipped
public static final int U8_U8_U32               = 15;	//  [0]:[1]:[2]-[5]: uint8_t[0],uint8_t[1],uint32_t,
public static final int U8_U8_S32               = 16;	//  [0]:[1]:[2]-[5]: uint8_t[0],uint8_t[1], int32_t,
public static final int U8_U8_FF                = 17;	//  [0]:[1]:[2]-[5]: uint8_t[0],uint8_t[1], Full Float,
public static final int U16                     = 18;	//  [0]-[2]uint16_t                                
public static final int S16                     = 19;	//  [0]-[2] int16_t                                
public static final int LAT_LON_HT              = 20;	//  [0]:[1]:[2]-[5]: Fix type, bits fields, lat/lon/ht
public static final int U8_FF                   = 21;	//  [0]:[1]-[4]: uint8_t, Full Float               
public static final int U8_HF                   = 22;	//  [0]:[1]-[2]: uint8_t, Half Float               
public static final int U8                      = 23;	//  [0]: uint8_t                                   
public static final int UNIXTIME                = 24;	//  [0]: U8_U32 with U8 bit field stuff            
public static final int U8_U8                   = 25;	//  [0]:[1]: uint8_t[0],uint8[1]                   
public static final int U8_U8_U8_U32            = 26;	//  [0]:[1]:[2]:[3]-[5]: uint8_t[0],uint8_t[0],uint8_t[1], int32_t,
public static final int LVL2B                   = 249;	//  [2]-[5]: (uint8_t[0],uint8_t[1] cmd:Board code),[2]-[5]see table
public static final int LVL2R                   = 250;	//  [2]-[5]: (uint8_t[0],uint8_t[1] cmd:Readings code),[2]-[5]see table
public static final int UNDEF                   = 255;	//  Undefined                             
}
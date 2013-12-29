package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface ConfigInfo {

// void setMax_channels int
/**********************************************************
 * Maximum number of simultaneous channels.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setMax_channels(int val );



// int getMax_open_files
/**********************************************************
 * Maximum number of open file handles (files, sockets).
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public int getMax_open_files();



// void setName String
/**********************************************************
 * Asterisk system name.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setName(String val );



// void setSetid SetId
/**********************************************************
 * Effective user/group id for running Asterisk.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setSetid(SetId val );



// void setMax_load double
/**********************************************************
 * Maximum load avg on system.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setMax_load(double val );



// String getName
/**********************************************************
 * Asterisk system name.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public String getName();



// String getDefault_language
/**********************************************************
 * Default language for media playback.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public String getDefault_language();



// void setMax_open_files int
/**********************************************************
 * Maximum number of open file handles (files, sockets).
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setMax_open_files(int val );



// SetId getSetid
/**********************************************************
 * Effective user/group id for running Asterisk.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public SetId getSetid();



// void setDefault_language String
/**********************************************************
 * Default language for media playback.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public void setDefault_language(String val );



// double getMax_load
/**********************************************************
 * Maximum load avg on system.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public double getMax_load();



// int getMax_channels
/**********************************************************
 * Maximum number of simultaneous channels.
 * 
 * @since: ari_0_0_1
 *********************************************************/
 public int getMax_channels();


}
;
package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/**********************************************************
 * Info about Asterisk configuration
 * 
 * Defined in file: asterisk.json
 *********************************************************/

public class ConfigInfo_impl_ari_0_0_1 implements ConfigInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Default language for media playback.  */
  private String default_language;
 public String getDefault_language() {
   return default_language;
 }

 @JsonDeserialize( as=String.class )
 public void setDefault_language(String val ) {
   default_language = val;
 }

  /**  Maximum number of simultaneous channels.  */
  private int max_channels;
 public int getMax_channels() {
   return max_channels;
 }

 @JsonDeserialize( as=int.class )
 public void setMax_channels(int val ) {
   max_channels = val;
 }

  /**  Maximum load avg on system.  */
  private double max_load;
 public double getMax_load() {
   return max_load;
 }

 @JsonDeserialize( as=double.class )
 public void setMax_load(double val ) {
   max_load = val;
 }

  /**  Maximum number of open file handles (files, sockets).  */
  private int max_open_files;
 public int getMax_open_files() {
   return max_open_files;
 }

 @JsonDeserialize( as=int.class )
 public void setMax_open_files(int val ) {
   max_open_files = val;
 }

  /**  Asterisk system name.  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**  Effective user/group id for running Asterisk.  */
  private SetId setid;
 public SetId getSetid() {
   return setid;
 }

 @JsonDeserialize( as=SetId_impl_ari_0_0_1.class )
 public void setSetid(SetId val ) {
   setid = val;
 }

/** No missing signatures from interface */
}

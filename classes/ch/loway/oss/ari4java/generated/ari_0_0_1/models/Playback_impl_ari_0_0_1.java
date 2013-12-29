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
 * Object representing the playback of media to a channel
 * 
 * Defined in file: playbacks.json
 *********************************************************/

public class Playback_impl_ari_0_0_1 implements Playback, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  ID for this playback operation  */
  private String id;
 public String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(String val ) {
   id = val;
 }

  /**  For media types that support multiple languages, the language requested for playback.  */
  private String language;
 public String getLanguage() {
   return language;
 }

 @JsonDeserialize( as=String.class )
 public void setLanguage(String val ) {
   language = val;
 }

  /**  URI for the media to play back.  */
  private String media_uri;
 public String getMedia_uri() {
   return media_uri;
 }

 @JsonDeserialize( as=String.class )
 public void setMedia_uri(String val ) {
   media_uri = val;
 }

  /**  Current state of the playback operation.  */
  private String state;
 public String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(String val ) {
   state = val;
 }

  /**  URI for the channel or bridge to play the media on  */
  private String target_uri;
 public String getTarget_uri() {
   return target_uri;
 }

 @JsonDeserialize( as=String.class )
 public void setTarget_uri(String val ) {
   target_uri = val;
 }

/** No missing signatures from interface */
}

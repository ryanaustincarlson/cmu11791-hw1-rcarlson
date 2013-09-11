

/* First created by JCasGen Wed Sep 11 17:15:01 EDT 2013 */
package cmu11791.rcarlson;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** A generic NGram, which knows about its tokens and where in the text it starts and ends
 * Updated by JCasGen Wed Sep 11 17:28:07 EDT 2013
 * XML source: /Users/rcarlson/local/eclipse-workspaces/software-engineering/cmu11791-hw1-rcarlson/hw1-rcarlson/src/main/resources/hw1-rcarlson-typesystem.xml
 * @generated */
public class NGram extends SourceConfidenceAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: startIndex

  /** getter for startIndex - gets start location of the ngram in the text
   * @generated */
  public int getStartIndex() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_startIndex == null)
      jcasType.jcas.throwFeatMissing("startIndex", "cmu11791.rcarlson.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_startIndex);}
    
  /** setter for startIndex - sets start location of the ngram in the text 
   * @generated */
  public void setStartIndex(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_startIndex == null)
      jcasType.jcas.throwFeatMissing("startIndex", "cmu11791.rcarlson.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_startIndex, v);}    
   
    
  //*--------------*
  //* Feature: endIndex

  /** getter for endIndex - gets end location of the ngram in the text
   * @generated */
  public int getEndIndex() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_endIndex == null)
      jcasType.jcas.throwFeatMissing("endIndex", "cmu11791.rcarlson.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_endIndex);}
    
  /** setter for endIndex - sets end location of the ngram in the text 
   * @generated */
  public void setEndIndex(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_endIndex == null)
      jcasType.jcas.throwFeatMissing("endIndex", "cmu11791.rcarlson.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_endIndex, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets list of tokenized text, the cardinality of which determines N
   * @generated */
  public FSList getTokens() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "cmu11791.rcarlson.NGram");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets list of tokenized text, the cardinality of which determines N 
   * @generated */
  public void setTokens(FSList v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "cmu11791.rcarlson.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
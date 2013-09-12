

/* First created by JCasGen Wed Sep 11 17:15:01 EDT 2013 */
package cmu11791.rcarlson;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


import org.apache.uima.jcas.cas.StringList;


/** TextFeatures include the base text as well as unigrams, bigrams, and trigrams that help characterize the text
 * Updated by JCasGen Wed Sep 11 22:48:16 EDT 2013
 * XML source: /Users/rcarlson/local/eclipse-workspaces/software-engineering/cmu11791-hw1-rcarlson/hw1-rcarlson/src/main/resources/hw1-rcarlson-typesystem.xml
 * @generated */
public class TextFeatures extends SourceConfidenceAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextFeatures.class);
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
  protected TextFeatures() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TextFeatures(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TextFeatures(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TextFeatures(JCas jcas, int begin, int end) {
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
  //* Feature: unigrams

  /** getter for unigrams - gets single tokens (N=1)
   * @generated */
  public FSList getUnigrams() {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "cmu11791.rcarlson.TextFeatures");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_unigrams)));}
    
  /** setter for unigrams - sets single tokens (N=1) 
   * @generated */
  public void setUnigrams(FSList v) {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_unigrams == null)
      jcasType.jcas.throwFeatMissing("unigrams", "cmu11791.rcarlson.TextFeatures");
    jcasType.ll_cas.ll_setRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_unigrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bigrams

  /** getter for bigrams - gets token couples (N=2)
   * @generated */
  public FSList getBigrams() {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "cmu11791.rcarlson.TextFeatures");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_bigrams)));}
    
  /** setter for bigrams - sets token couples (N=2) 
   * @generated */
  public void setBigrams(FSList v) {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_bigrams == null)
      jcasType.jcas.throwFeatMissing("bigrams", "cmu11791.rcarlson.TextFeatures");
    jcasType.ll_cas.ll_setRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_bigrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: trigrams

  /** getter for trigrams - gets token triples (N=3)
   * @generated */
  public FSList getTrigrams() {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "cmu11791.rcarlson.TextFeatures");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_trigrams)));}
    
  /** setter for trigrams - sets token triples (N=3) 
   * @generated */
  public void setTrigrams(FSList v) {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_trigrams == null)
      jcasType.jcas.throwFeatMissing("trigrams", "cmu11791.rcarlson.TextFeatures");
    jcasType.ll_cas.ll_setRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_trigrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets the raw text from which the NGrams are extracted
   * @generated */
  public String getText() {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "cmu11791.rcarlson.TextFeatures");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets the raw text from which the NGrams are extracted 
   * @generated */
  public void setText(String v) {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "cmu11791.rcarlson.TextFeatures");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: allTokens

  /** getter for allTokens - gets a list of all tokens, which might be different from other NGram features (e.g., unigram features might exclude punctuation)
   * @generated */
  public StringList getAllTokens() {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_allTokens == null)
      jcasType.jcas.throwFeatMissing("allTokens", "cmu11791.rcarlson.TextFeatures");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_allTokens)));}
    
  /** setter for allTokens - sets a list of all tokens, which might be different from other NGram features (e.g., unigram features might exclude punctuation) 
   * @generated */
  public void setAllTokens(StringList v) {
    if (TextFeatures_Type.featOkTst && ((TextFeatures_Type)jcasType).casFeat_allTokens == null)
      jcasType.jcas.throwFeatMissing("allTokens", "cmu11791.rcarlson.TextFeatures");
    jcasType.ll_cas.ll_setRefValue(addr, ((TextFeatures_Type)jcasType).casFeatCode_allTokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
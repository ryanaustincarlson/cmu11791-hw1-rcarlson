

/* First created by JCasGen Wed Sep 11 17:15:01 EDT 2013 */
package cmu11791.rcarlson;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** every Answer must be assigned a score, based on its text features
 * Updated by JCasGen Wed Sep 11 17:28:07 EDT 2013
 * XML source: /Users/rcarlson/local/eclipse-workspaces/software-engineering/cmu11791-hw1-rcarlson/hw1-rcarlson/src/main/resources/hw1-rcarlson-typesystem.xml
 * @generated */
public class Answer extends SourceConfidenceAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets score assigned to an Answer relative to a Question
   * @generated */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cmu11791.rcarlson.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets score assigned to an Answer relative to a Question 
   * @generated */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "cmu11791.rcarlson.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answerTextFeatures

  /** getter for answerTextFeatures - gets text features (text, ngrams) characterizing the answer
   * @generated */
  public TextFeatures getAnswerTextFeatures() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerTextFeatures == null)
      jcasType.jcas.throwFeatMissing("answerTextFeatures", "cmu11791.rcarlson.Answer");
    return (TextFeatures)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_answerTextFeatures)));}
    
  /** setter for answerTextFeatures - sets text features (text, ngrams) characterizing the answer 
   * @generated */
  public void setAnswerTextFeatures(TextFeatures v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerTextFeatures == null)
      jcasType.jcas.throwFeatMissing("answerTextFeatures", "cmu11791.rcarlson.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_answerTextFeatures, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
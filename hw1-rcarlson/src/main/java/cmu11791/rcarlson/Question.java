

/* First created by JCasGen Wed Sep 11 17:15:01 EDT 2013 */
package cmu11791.rcarlson;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** every Question has some set of text features that can be analyzed, and a set of candidate answers

 * Updated by JCasGen Wed Sep 11 17:28:07 EDT 2013
 * XML source: /Users/rcarlson/local/eclipse-workspaces/software-engineering/cmu11791-hw1-rcarlson/hw1-rcarlson/src/main/resources/hw1-rcarlson-typesystem.xml
 * @generated */
public class Question extends SourceConfidenceAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: questionTextFeatures

  /** getter for questionTextFeatures - gets text features (text, ngrams) characterizing the question
   * @generated */
  public TextFeatures getQuestionTextFeatures() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionTextFeatures == null)
      jcasType.jcas.throwFeatMissing("questionTextFeatures", "cmu11791.rcarlson.Question");
    return (TextFeatures)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_questionTextFeatures)));}
    
  /** setter for questionTextFeatures - sets text features (text, ngrams) characterizing the question 
   * @generated */
  public void setQuestionTextFeatures(TextFeatures v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionTextFeatures == null)
      jcasType.jcas.throwFeatMissing("questionTextFeatures", "cmu11791.rcarlson.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_questionTextFeatures, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Answers

  /** getter for Answers - gets list of scored Answers to the Question
   * @generated */
  public FSList getAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "cmu11791.rcarlson.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_Answers)));}
    
  /** setter for Answers - sets list of scored Answers to the Question 
   * @generated */
  public void setAnswers(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "cmu11791.rcarlson.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_Answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
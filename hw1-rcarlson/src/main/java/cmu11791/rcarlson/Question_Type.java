
/* First created by JCasGen Wed Sep 11 17:15:01 EDT 2013 */
package cmu11791.rcarlson;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** every Question has some set of text features that can be analyzed, and a set of candidate answers
 * Updated by JCasGen Wed Sep 11 22:48:16 EDT 2013
 * @generated */
public class Question_Type extends SourceConfidenceAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu11791.rcarlson.Question");
 
  /** @generated */
  final Feature casFeat_questionTextFeatures;
  /** @generated */
  final int     casFeatCode_questionTextFeatures;
  /** @generated */ 
  public int getQuestionTextFeatures(int addr) {
        if (featOkTst && casFeat_questionTextFeatures == null)
      jcas.throwFeatMissing("questionTextFeatures", "cmu11791.rcarlson.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_questionTextFeatures);
  }
  /** @generated */    
  public void setQuestionTextFeatures(int addr, int v) {
        if (featOkTst && casFeat_questionTextFeatures == null)
      jcas.throwFeatMissing("questionTextFeatures", "cmu11791.rcarlson.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_questionTextFeatures, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Answers;
  /** @generated */
  final int     casFeatCode_Answers;
  /** @generated */ 
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "cmu11791.rcarlson.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Answers);
  }
  /** @generated */    
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "cmu11791.rcarlson.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_Answers, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionTextFeatures = jcas.getRequiredFeatureDE(casType, "questionTextFeatures", "cmu11791.rcarlson.TextFeatures", featOkTst);
    casFeatCode_questionTextFeatures  = (null == casFeat_questionTextFeatures) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionTextFeatures).getCode();

 
    casFeat_Answers = jcas.getRequiredFeatureDE(casType, "Answers", "uima.cas.FSList", featOkTst);
    casFeatCode_Answers  = (null == casFeat_Answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Answers).getCode();

  }
}



    
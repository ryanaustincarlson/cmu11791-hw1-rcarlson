
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

/** every Answer must be assigned a score, based on its text features
 * Updated by JCasGen Wed Sep 11 17:28:07 EDT 2013
 * @generated */
public class Answer_Type extends SourceConfidenceAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu11791.rcarlson.Answer");
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "cmu11791.rcarlson.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "cmu11791.rcarlson.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerTextFeatures;
  /** @generated */
  final int     casFeatCode_answerTextFeatures;
  /** @generated */ 
  public int getAnswerTextFeatures(int addr) {
        if (featOkTst && casFeat_answerTextFeatures == null)
      jcas.throwFeatMissing("answerTextFeatures", "cmu11791.rcarlson.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerTextFeatures);
  }
  /** @generated */    
  public void setAnswerTextFeatures(int addr, int v) {
        if (featOkTst && casFeat_answerTextFeatures == null)
      jcas.throwFeatMissing("answerTextFeatures", "cmu11791.rcarlson.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerTextFeatures, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_answerTextFeatures = jcas.getRequiredFeatureDE(casType, "answerTextFeatures", "cmu11791.rcarlson.TextFeatures", featOkTst);
    casFeatCode_answerTextFeatures  = (null == casFeat_answerTextFeatures) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerTextFeatures).getCode();

  }
}



    
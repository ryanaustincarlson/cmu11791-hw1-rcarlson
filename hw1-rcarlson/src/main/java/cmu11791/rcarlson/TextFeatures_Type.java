
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

/** TextFeatures include the base text as well as unigrams, bigrams, and trigrams that help characterize the text
 * Updated by JCasGen Wed Sep 11 17:28:07 EDT 2013
 * @generated */
public class TextFeatures_Type extends SourceConfidenceAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TextFeatures_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TextFeatures_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TextFeatures(addr, TextFeatures_Type.this);
  			   TextFeatures_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TextFeatures(addr, TextFeatures_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TextFeatures.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu11791.rcarlson.TextFeatures");
 
  /** @generated */
  final Feature casFeat_unigrams;
  /** @generated */
  final int     casFeatCode_unigrams;
  /** @generated */ 
  public int getUnigrams(int addr) {
        if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "cmu11791.rcarlson.TextFeatures");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigrams);
  }
  /** @generated */    
  public void setUnigrams(int addr, int v) {
        if (featOkTst && casFeat_unigrams == null)
      jcas.throwFeatMissing("unigrams", "cmu11791.rcarlson.TextFeatures");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bigrams;
  /** @generated */
  final int     casFeatCode_bigrams;
  /** @generated */ 
  public int getBigrams(int addr) {
        if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "cmu11791.rcarlson.TextFeatures");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bigrams);
  }
  /** @generated */    
  public void setBigrams(int addr, int v) {
        if (featOkTst && casFeat_bigrams == null)
      jcas.throwFeatMissing("bigrams", "cmu11791.rcarlson.TextFeatures");
    ll_cas.ll_setRefValue(addr, casFeatCode_bigrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_trigrams;
  /** @generated */
  final int     casFeatCode_trigrams;
  /** @generated */ 
  public int getTrigrams(int addr) {
        if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "cmu11791.rcarlson.TextFeatures");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigrams);
  }
  /** @generated */    
  public void setTrigrams(int addr, int v) {
        if (featOkTst && casFeat_trigrams == null)
      jcas.throwFeatMissing("trigrams", "cmu11791.rcarlson.TextFeatures");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "cmu11791.rcarlson.TextFeatures");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "cmu11791.rcarlson.TextFeatures");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TextFeatures_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_unigrams = jcas.getRequiredFeatureDE(casType, "unigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_unigrams  = (null == casFeat_unigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigrams).getCode();

 
    casFeat_bigrams = jcas.getRequiredFeatureDE(casType, "bigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_bigrams  = (null == casFeat_bigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bigrams).getCode();

 
    casFeat_trigrams = jcas.getRequiredFeatureDE(casType, "trigrams", "uima.cas.FSList", featOkTst);
    casFeatCode_trigrams  = (null == casFeat_trigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigrams).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

  }
}



    
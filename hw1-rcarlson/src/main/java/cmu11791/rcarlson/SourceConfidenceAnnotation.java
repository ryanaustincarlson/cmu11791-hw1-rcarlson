

/* First created by JCasGen Wed Sep 11 17:15:01 EDT 2013 */
package cmu11791.rcarlson;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Superclass of all annotations, contains source and confidence score
 * Updated by JCasGen Wed Sep 11 22:48:16 EDT 2013
 * XML source: /Users/rcarlson/local/eclipse-workspaces/software-engineering/cmu11791-hw1-rcarlson/hw1-rcarlson/src/main/resources/hw1-rcarlson-typesystem.xml
 * @generated */
public class SourceConfidenceAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SourceConfidenceAnnotation.class);
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
  protected SourceConfidenceAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SourceConfidenceAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SourceConfidenceAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SourceConfidenceAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets Name of the component that produced the annotation
   * @generated */
  public String getSource() {
    if (SourceConfidenceAnnotation_Type.featOkTst && ((SourceConfidenceAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu11791.rcarlson.SourceConfidenceAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceConfidenceAnnotation_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Name of the component that produced the annotation 
   * @generated */
  public void setSource(String v) {
    if (SourceConfidenceAnnotation_Type.featOkTst && ((SourceConfidenceAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu11791.rcarlson.SourceConfidenceAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceConfidenceAnnotation_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Confidence score assigned to the annotation by the source component
   * @generated */
  public double getConfidence() {
    if (SourceConfidenceAnnotation_Type.featOkTst && ((SourceConfidenceAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cmu11791.rcarlson.SourceConfidenceAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((SourceConfidenceAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Confidence score assigned to the annotation by the source component 
   * @generated */
  public void setConfidence(double v) {
    if (SourceConfidenceAnnotation_Type.featOkTst && ((SourceConfidenceAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cmu11791.rcarlson.SourceConfidenceAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((SourceConfidenceAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
  }

    
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.pegasys.teku.bls.impl.blst.swig;

public class fp {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected fp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(fp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        blstJNI.delete_fp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setL(SWIGTYPE_p_unsigned_long_long value) {
    blstJNI.fp_l_set(swigCPtr, this, SWIGTYPE_p_unsigned_long_long.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_long_long getL() {
    long cPtr = blstJNI.fp_l_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public fp() {
    this(blstJNI.new_fp(), true);
  }

}
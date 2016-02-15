public class Triangle {
  private Integer mSideOne;
  private Integer mSideTwo;
  private Integer mSideThree;

  public Triangle(Integer sideOne, Integer sideTwo, Integer sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public int getSideOne() {
    return mSideOne;
  }

  public int getSideTwo() {
    return mSideTwo;
  }

  public int getSideThree() {
    return mSideThree;
  }

 public boolean isEquillateral() {
   return mSideOne == mSideTwo && mSideTwo == mSideThree && mSideThree == mSideOne;
 }
 public boolean isIsosceles() {
   return this.isTriangle() == true && (mSideOne == mSideTwo || mSideTwo == mSideThree || mSideThree == mSideOne) && (mSideOne != mSideTwo || mSideTwo != mSideThree);
 }
 public boolean isScalene() {
   return this.isTriangle() == true && mSideOne != mSideTwo && mSideTwo != mSideThree && mSideThree != mSideOne;
 }
 public boolean isTriangle() {
   return (mSideOne + mSideTwo) > mSideThree && (mSideOne + mSideThree) > mSideTwo && (mSideTwo + mSideThree) > mSideOne;
 }
}

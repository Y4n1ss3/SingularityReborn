package androidx.compose.foundation.lazy.layout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyLayoutMeasuredItem {
    /* renamed from: getConstraints-msEJaDk */
    long mo870getConstraintsmsEJaDk();

    int getIndex();

    Object getKey();

    int getLane();

    int getMainAxisSizeWithSpacings();

    boolean getNonScrollableItem();

    /* renamed from: getOffset-Bjo55l4 */
    long mo871getOffsetBjo55l4(int i);

    Object getParentData(int i);

    int getPlaceablesCount();

    int getSpan();

    boolean isVertical();

    void position(int i, int i2, int i3, int i4);

    void setNonScrollableItem(boolean z);
}

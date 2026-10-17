package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i) {
        int size = mutableVector.getSize() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = ((size - i2) / 2) + i2;
            int startIndex = mutableVector.content[i3].getStartIndex();
            if (startIndex != i) {
                if (startIndex < i) {
                    i2 = i3 + 1;
                    if (i < mutableVector.content[i2].getStartIndex()) {
                    }
                } else {
                    size = i3 - 1;
                }
            }
            return i3;
        }
        return i2;
    }
}

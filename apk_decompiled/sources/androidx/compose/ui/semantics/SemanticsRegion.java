package androidx.compose.ui.semantics;

import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface SemanticsRegion {
    boolean difference(IntRect intRect);

    IntRect getBounds();

    boolean intersect(SemanticsRegion semanticsRegion);

    boolean isEmpty();

    void set(IntRect intRect);
}

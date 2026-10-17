package androidx.compose.ui.layout;

import defpackage.ky;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface MeasureResult {
    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    default ky getRulers() {
        return null;
    }

    int getWidth();

    void placeChildren();
}

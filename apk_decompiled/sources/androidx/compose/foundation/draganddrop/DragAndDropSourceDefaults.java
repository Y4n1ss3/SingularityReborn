package androidx.compose.foundation.draganddrop;

import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;
    public static final DragAndDropSourceDefaults INSTANCE = new DragAndDropSourceDefaults();
    private static final my DefaultStartDetector = new DragAndDropSourceDefaults$DefaultStartDetector$1(null);

    private DragAndDropSourceDefaults() {
    }

    public final my getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}

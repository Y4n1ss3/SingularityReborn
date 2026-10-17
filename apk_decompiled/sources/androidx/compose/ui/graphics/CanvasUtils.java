package androidx.compose.ui.graphics;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CanvasUtils {
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static Method reorderBarrierMethod;
    public static final CanvasUtils INSTANCE = new CanvasUtils();
    public static final int $stable = 8;

    private CanvasUtils() {
    }

    public final void enableZ(android.graphics.Canvas canvas, boolean z) {
        CanvasZHelper.INSTANCE.enableZ(canvas, z);
    }
}

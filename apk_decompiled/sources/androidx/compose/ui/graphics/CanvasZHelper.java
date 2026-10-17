package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CanvasZHelper {
    public static final CanvasZHelper INSTANCE = new CanvasZHelper();

    private CanvasZHelper() {
    }

    public final void enableZ(android.graphics.Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}

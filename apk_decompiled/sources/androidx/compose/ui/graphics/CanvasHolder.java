package androidx.compose.ui.graphics;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CanvasHolder {
    public static final int $stable = 8;
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public final void drawInto(android.graphics.Canvas canvas, ky kyVar) {
        android.graphics.Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(canvas);
        kyVar.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }
}

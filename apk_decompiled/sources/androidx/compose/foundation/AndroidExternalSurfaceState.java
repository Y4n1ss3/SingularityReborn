package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidExternalSurfaceState extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {
    private int lastHeight;
    private int lastWidth;

    public AndroidExternalSurfaceState(un unVar) {
        super(unVar);
        this.lastWidth = -1;
        this.lastHeight = -1;
    }

    public final int getLastHeight() {
        return this.lastHeight;
    }

    public final int getLastWidth() {
        return this.lastWidth;
    }

    public final void setLastHeight(int i) {
        this.lastHeight = i;
    }

    public final void setLastWidth(int i) {
        this.lastWidth = i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.lastWidth == i2 && this.lastHeight == i3) {
            return;
        }
        this.lastWidth = i2;
        this.lastHeight = i3;
        dispatchSurfaceChanged(surfaceHolder.getSurface(), i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.lastWidth = surfaceFrame.width();
        this.lastHeight = surfaceFrame.height();
        dispatchSurfaceCreated(surfaceHolder.getSurface(), this.lastWidth, this.lastHeight);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        dispatchSurfaceDestroyed(surfaceHolder.getSurface());
    }
}

package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    private final Matrix matrix;
    private long surfaceSize;
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(un unVar) {
        super(unVar);
        this.surfaceSize = IntSize.Companion.m7787getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m209getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!IntSize.m7780equalsimpl0(this.surfaceSize, IntSize.Companion.m7787getZeroYbymL2g())) {
            long j = this.surfaceSize;
            int i3 = (int) (j >> 32);
            i2 = (int) (j & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i3, i2);
            i = i3;
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        surface.getClass();
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!IntSize.m7780equalsimpl0(this.surfaceSize, IntSize.Companion.m7787getZeroYbymL2g())) {
            long j = this.surfaceSize;
            int i3 = (int) (j >> 32);
            i2 = (int) (j & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i3, i2);
            i = i3;
        }
        Surface surface = this.surfaceTextureSurface;
        surface.getClass();
        dispatchSurfaceChanged(surface, i, i2);
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m210setSurfaceSizeozmzZPI(long j) {
        this.surfaceSize = j;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

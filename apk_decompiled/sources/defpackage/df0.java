package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class df0 {
    public final Path a;
    public final int b;
    public final float c;
    public final float[] d;

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public df0(Path path, int i, float f) {
        path.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = path;
        this.b = i;
        this.c = f;
        this.d = new float[8];
    }

    public abstract int a(boolean z);

    public abstract boolean b();

    public abstract ff0 c(float[] fArr, int i);
}

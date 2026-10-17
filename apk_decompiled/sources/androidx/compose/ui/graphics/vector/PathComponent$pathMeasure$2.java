package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.PathMeasure;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathComponent$pathMeasure$2 extends f30 implements iy {
    public static final PathComponent$pathMeasure$2 INSTANCE = new PathComponent$pathMeasure$2();

    public PathComponent$pathMeasure$2() {
        super(0);
    }

    @Override // defpackage.iy
    public final PathMeasure invoke() {
        return AndroidPathMeasure_androidKt.PathMeasure();
    }
}

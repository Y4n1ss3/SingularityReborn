package androidx.compose.ui.graphics;

import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PathMeasure {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getSegment");
            return false;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return pathMeasure.getSegment(f, f2, path, z);
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ */
    long mo4656getPositiontuRUvjQ(float f);

    boolean getSegment(float f, float f2, Path path, boolean z);

    /* renamed from: getTangent-tuRUvjQ */
    long mo4657getTangenttuRUvjQ(float f);

    void setPath(Path path, boolean z);
}

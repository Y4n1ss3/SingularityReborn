package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidPathMeasure implements PathMeasure {
    public static final int $stable = 8;
    private final android.graphics.PathMeasure internalPathMeasure;
    private float[] positionArray;
    private float[] tangentArray;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo4656getPositiontuRUvjQ(float f) {
        float[] fArr = this.positionArray;
        if (fArr == null) {
            fArr = new float[2];
            this.positionArray = fArr;
        }
        float[] fArr2 = this.tangentArray;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.tangentArray = fArr2;
        }
        if (!this.internalPathMeasure.getPosTan(f, fArr, fArr2)) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        float[] fArr3 = this.positionArray;
        fArr3.getClass();
        float f2 = fArr3[0];
        float[] fArr4 = this.positionArray;
        fArr4.getClass();
        float f3 = fArr4[1];
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f, float f2, Path path, boolean z) {
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f, f2, ((AndroidPath) path).getInternalPath(), z);
        }
        lu0.a("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo4657getTangenttuRUvjQ(float f) {
        float[] fArr = this.positionArray;
        if (fArr == null) {
            fArr = new float[2];
            this.positionArray = fArr;
        }
        float[] fArr2 = this.tangentArray;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.tangentArray = fArr2;
        }
        if (!this.internalPathMeasure.getPosTan(f, fArr, fArr2)) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        float[] fArr3 = this.tangentArray;
        fArr3.getClass();
        float f2 = fArr3[0];
        float[] fArr4 = this.tangentArray;
        fArr4.getClass();
        float f3 = fArr4[1];
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(Path path, boolean z) {
        android.graphics.Path path2;
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                lu0.a("Unable to obtain android.graphics.Path");
                return;
            }
            path2 = ((AndroidPath) path).getInternalPath();
        }
        pathMeasure.setPath(path2, z);
    }
}

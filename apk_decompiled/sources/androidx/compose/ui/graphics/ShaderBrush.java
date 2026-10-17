package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    public static final int $stable = 0;
    private long createdSize;
    private TransformShader internalTransformShader;
    private float[] transform;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m4593getUnspecifiedNHjbRc();
    }

    private final TransformShader obtainTransformShader() {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            return transformShader;
        }
        TransformShader transformShader2 = new TransformShader();
        this.internalTransformShader = transformShader2;
        return transformShader2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo4706applyToPq9zytI(long j, Paint paint, float f) {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader == null || !Size.m4581equalsimpl0(this.createdSize, j)) {
            if (Size.m4587isEmptyimpl(j)) {
                this.internalTransformShader = null;
                this.createdSize = Size.Companion.m4593getUnspecifiedNHjbRc();
                transformShader = null;
            } else {
                transformShader = obtainTransformShader();
                float[] fArr = this.transform;
                if (fArr != null) {
                    transformShader.m5175transformQ8lPUPs(fArr);
                }
                transformShader.setShader(mo4730createShaderuvyYCjk(j));
                this.internalTransformShader = transformShader;
                this.createdSize = j;
            }
        }
        long mo4631getColor0d7_KjU = paint.mo4631getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m4762equalsimpl0(mo4631getColor0d7_KjU, companion.m4787getBlack0d7_KjU())) {
            paint.mo4637setColor8_81llA(companion.m4787getBlack0d7_KjU());
        }
        if (!q10.b(paint.getShader(), transformShader != null ? transformShader.getShader() : null)) {
            paint.setShader(transformShader != null ? transformShader.getShader() : null);
        }
        if (paint.getAlpha() == f) {
            return;
        }
        paint.setAlpha(f);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo4730createShaderuvyYCjk(long j);

    /* renamed from: getTransform-3i98HWw, reason: not valid java name */
    public final float[] m5090getTransform3i98HWw() {
        return this.transform;
    }

    /* renamed from: setTransform-Q8lPUPs, reason: not valid java name */
    public final void m5091setTransformQ8lPUPs(float[] fArr) {
        this.transform = fArr;
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            transformShader.m5175transformQ8lPUPs(fArr);
        }
    }
}

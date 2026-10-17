package androidx.compose.ui.graphics;

import android.graphics.Shader;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositeShaderBrush extends ShaderBrush {
    public static final int $stable = 0;
    private final int blendMode;
    private final ShaderBrush dstBrush;
    private final ShaderBrush srcBrush;

    private CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i) {
        this.dstBrush = shaderBrush;
        this.srcBrush = shaderBrush2;
        this.blendMode = i;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4730createShaderuvyYCjk(long j) {
        return ShaderKt.m5092CompositeShader7EN7VTw(this.dstBrush.mo4730createShaderuvyYCjk(j), this.srcBrush.mo4730createShaderuvyYCjk(j), this.blendMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeShaderBrush)) {
            return false;
        }
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) obj;
        return q10.b(this.dstBrush, compositeShaderBrush.dstBrush) && q10.b(this.srcBrush, compositeShaderBrush.srcBrush) && BlendMode.m4670equalsimpl0(this.blendMode, compositeShaderBrush.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4842getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final ShaderBrush getDstBrush() {
        return this.dstBrush;
    }

    public final ShaderBrush getSrcBrush() {
        return this.srcBrush;
    }

    public int hashCode() {
        return BlendMode.m4671hashCodeimpl(this.blendMode) + ((this.srcBrush.hashCode() + (this.dstBrush.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.dstBrush + ", srcBrush=" + this.srcBrush + ", blendMode=" + ((Object) BlendMode.m4672toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i, dq dqVar) {
        this(shaderBrush, shaderBrush2, i);
    }
}

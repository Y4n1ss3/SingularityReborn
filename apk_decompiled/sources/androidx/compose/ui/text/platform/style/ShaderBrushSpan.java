package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import defpackage.hm0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final MutableState size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4573boximpl(Size.Companion.m4593getUnspecifiedNHjbRc()), null, 2, null);
    private final State<Shader> shaderState = SnapshotStateKt.derivedStateOf(new hm0(this, 5));

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f) {
        this.shaderBrush = shaderBrush;
        this.alpha = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader shaderState$lambda$0(ShaderBrushSpan shaderBrushSpan) {
        if (shaderBrushSpan.m7349getSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m4587isEmptyimpl(shaderBrushSpan.m7349getSizeNHjbRc())) {
            return null;
        }
        return shaderBrushSpan.shaderBrush.mo4730createShaderuvyYCjk(shaderBrushSpan.m7349getSizeNHjbRc());
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m7349getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m4590unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m7350setSizeuvyYCjk(long j) {
        this.size$delegate.setValue(Size.m4573boximpl(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}

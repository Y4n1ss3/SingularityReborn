package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNodeKt;
import defpackage.dq;
import defpackage.fb0;
import defpackage.iy;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;
    private final fb0 ripples;

    private CommonRippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar) {
        super(interactionSource, z, f, colorProducer, iyVar, null);
        this.ripples = new fb0();
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM */
    public void mo1572addRipple12SF9DM(PressInteraction.Press press, long j, float f) {
        fb0 fb0Var = this.ripples;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128) {
                            int i4 = (i << 3) + i3;
                            ((RippleAnimation) objArr2[i4]).finish();
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        RippleAnimation rippleAnimation = new RippleAnimation(getBounded() ? Offset.m4505boximpl(press.m588getPressPositionF1C5BW0()) : null, f, getBounded(), null);
        this.ripples.l(press, rippleAnimation);
        p01.t(getCoroutineScope(), null, null, new CommonRippleNode$addRipple$2(rippleAnimation, this, press, null), 3);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        float f;
        int i;
        int i2;
        int i3;
        float f2;
        float pressedAlpha = ((RippleAlpha) getRippleAlpha().invoke()).getPressedAlpha();
        if (pressedAlpha == 0.0f) {
            return;
        }
        fb0 fb0Var = this.ripples;
        Object[] objArr = fb0Var.b;
        Object[] objArr2 = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                long j2 = j;
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        i = i7;
                        i2 = i6;
                        i3 = i5;
                        f2 = pressedAlpha;
                        ((RippleAnimation) objArr2[i8]).m1576draw4WTKRHQ(drawScope, Color.m4760copywmQWz5c$default(m1584getRippleColor0d7_KjU(), pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        i = i7;
                        i2 = i6;
                        i3 = i5;
                        f2 = pressedAlpha;
                    }
                    j2 >>= i3;
                    i7 = i + 1;
                    pressedAlpha = f2;
                    i6 = i2;
                    i5 = i3;
                }
                int i9 = i6;
                f = pressedAlpha;
                if (i9 != i5) {
                    return;
                }
            } else {
                f = pressedAlpha;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            pressedAlpha = f;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.ripples.f();
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.ripples.d(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    public /* synthetic */ CommonRippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar, dq dqVar) {
        this(interactionSource, z, f, colorProducer, iyVar);
    }
}

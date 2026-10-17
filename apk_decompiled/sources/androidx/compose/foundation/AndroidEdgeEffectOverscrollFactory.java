package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {
    private final Context context;
    private final Density density;
    private final long glowColor;
    private final PaddingValues glowDrawPadding;

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j, PaddingValues paddingValues, int i, dq dqVar) {
        this(context, density, (i & 4) != 0 ? AndroidOverscroll_androidKt.DefaultGlowColor : j, (i & 8) != 0 ? AndroidOverscroll_androidKt.DefaultGlowPaddingValues : paddingValues, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public OverscrollEffect createOverscrollEffect() {
        return new AndroidEdgeEffectOverscrollEffect(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidEdgeEffectOverscrollFactory.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) obj;
        return q10.b(this.context, androidEdgeEffectOverscrollFactory.context) && q10.b(this.density, androidEdgeEffectOverscrollFactory.density) && Color.m4762equalsimpl0(this.glowColor, androidEdgeEffectOverscrollFactory.glowColor) && q10.b(this.glowDrawPadding, androidEdgeEffectOverscrollFactory.glowDrawPadding);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public int hashCode() {
        return this.glowDrawPadding.hashCode() + kp0.d(this.glowColor, (this.density.hashCode() + (this.context.hashCode() * 31)) * 31, 31);
    }

    private AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j, PaddingValues paddingValues) {
        this.context = context;
        this.density = density;
        this.glowColor = j;
        this.glowDrawPadding = paddingValues;
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j, PaddingValues paddingValues, dq dqVar) {
        this(context, density, j, paddingValues);
    }
}

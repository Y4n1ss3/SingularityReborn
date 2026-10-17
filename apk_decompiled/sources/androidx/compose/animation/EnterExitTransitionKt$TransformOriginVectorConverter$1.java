package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends f30 implements ky {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    public EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m56invoke__ExYCQ(((TransformOrigin) obj).m5173unboximpl());
    }

    /* renamed from: invoke-__ExYCQ, reason: not valid java name */
    public final AnimationVector2D m56invoke__ExYCQ(long j) {
        return new AnimationVector2D(TransformOrigin.m5169getPivotFractionXimpl(j), TransformOrigin.m5170getPivotFractionYimpl(j));
    }
}

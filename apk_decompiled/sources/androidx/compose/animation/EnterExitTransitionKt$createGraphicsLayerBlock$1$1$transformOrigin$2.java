package androidx.compose.animation;

import androidx.compose.ui.graphics.TransformOrigin;
import defpackage.f30;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 extends f30 implements ky {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ TransformOrigin $transformOriginWhenVisible;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(TransformOrigin transformOrigin, EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$transformOriginWhenVisible = transformOrigin;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TransformOrigin.m5161boximpl(m58invokeLIALnN8((EnterExitState) obj));
    }

    /* renamed from: invoke-LIALnN8, reason: not valid java name */
    public final long m58invokeLIALnN8(EnterExitState enterExitState) {
        TransformOrigin transformOrigin;
        long m82getTransformOriginSzJe1aQ;
        long m82getTransformOriginSzJe1aQ2;
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i != 1) {
            transformOrigin = null;
            if (i == 2) {
                Scale scale = this.$enter.getData$animation().getScale();
                if (scale != null) {
                    m82getTransformOriginSzJe1aQ = scale.m82getTransformOriginSzJe1aQ();
                } else {
                    Scale scale2 = this.$exit.getData$animation().getScale();
                    if (scale2 != null) {
                        m82getTransformOriginSzJe1aQ = scale2.m82getTransformOriginSzJe1aQ();
                    }
                }
                transformOrigin = TransformOrigin.m5161boximpl(m82getTransformOriginSzJe1aQ);
            } else {
                if (i != 3) {
                    o.n();
                    return 0L;
                }
                Scale scale3 = this.$exit.getData$animation().getScale();
                if (scale3 != null) {
                    m82getTransformOriginSzJe1aQ2 = scale3.m82getTransformOriginSzJe1aQ();
                } else {
                    Scale scale4 = this.$enter.getData$animation().getScale();
                    if (scale4 != null) {
                        m82getTransformOriginSzJe1aQ2 = scale4.m82getTransformOriginSzJe1aQ();
                    }
                }
                transformOrigin = TransformOrigin.m5161boximpl(m82getTransformOriginSzJe1aQ2);
            }
        } else {
            transformOrigin = this.$transformOriginWhenVisible;
        }
        return transformOrigin != null ? transformOrigin.m5173unboximpl() : TransformOrigin.Companion.m5174getCenterSzJe1aQ();
    }
}

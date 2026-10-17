package androidx.compose.animation;

import defpackage.f30;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 extends f30 implements ky {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

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
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // defpackage.ky
    public final Float invoke(EnterExitState enterExitState) {
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                Fade fade = this.$enter.getData$animation().getFade();
                if (fade != null) {
                    f = fade.getAlpha();
                }
            } else {
                if (i != 3) {
                    o.n();
                    return null;
                }
                Fade fade2 = this.$exit.getData$animation().getFade();
                if (fade2 != null) {
                    f = fade2.getAlpha();
                }
            }
        }
        return Float.valueOf(f);
    }
}

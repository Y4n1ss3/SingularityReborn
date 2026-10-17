package androidx.compose.animation;

import androidx.compose.ui.graphics.Color;
import defpackage.f30;
import defpackage.ky;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VeilModifierNode$draw$veilColor$2 extends f30 implements ky {
    final /* synthetic */ VeilModifierNode this$0;

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
    public VeilModifierNode$draw$veilColor$2(VeilModifierNode veilModifierNode) {
        super(1);
        this.this$0 = veilModifierNode;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Color.m4751boximpl(m126invokevNxB06k((EnterExitState) obj));
    }

    /* renamed from: invoke-vNxB06k, reason: not valid java name */
    public final long m126invokevNxB06k(EnterExitState enterExitState) {
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            Veil veil = this.this$0.getEnter().getData$animation().getVeil();
            if (veil != null) {
                return veil.m125getTargetColor0d7_KjU();
            }
            Veil veil2 = this.this$0.getExit().getData$animation().getVeil();
            return veil2 != null ? veil2.m124getInitialColor0d7_KjU() : Color.Companion.m4796getTransparent0d7_KjU();
        }
        if (i == 2) {
            Veil veil3 = this.this$0.getEnter().getData$animation().getVeil();
            return veil3 != null ? veil3.m124getInitialColor0d7_KjU() : Color.Companion.m4796getTransparent0d7_KjU();
        }
        if (i == 3) {
            Veil veil4 = this.this$0.getExit().getData$animation().getVeil();
            return veil4 != null ? veil4.m125getTargetColor0d7_KjU() : Color.Companion.m4796getTransparent0d7_KjU();
        }
        o.n();
        return 0L;
    }
}

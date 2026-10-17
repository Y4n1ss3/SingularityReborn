package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import defpackage.u11;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;
    private final View view;

    public PlatformHapticFeedback(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo5532performHapticFeedbackCdsT49E(int i) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        u11.a(this.view, HapticFeedbackType.m5536equalsimpl0(i, companion.m5540getConfirm5zf0vsI()) ? 16 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5541getContextClick5zf0vsI()) ? 6 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5542getGestureEnd5zf0vsI()) ? 13 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5543getGestureThresholdActivate5zf0vsI()) ? 23 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5544getKeyboardTap5zf0vsI()) ? 3 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5545getLongPress5zf0vsI()) ? 0 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5546getReject5zf0vsI()) ? 17 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5547getSegmentFrequentTick5zf0vsI()) ? 27 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5548getSegmentTick5zf0vsI()) ? 26 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5549getTextHandleMove5zf0vsI()) ? 9 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5550getToggleOff5zf0vsI()) ? 22 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5551getToggleOn5zf0vsI()) ? 21 : HapticFeedbackType.m5536equalsimpl0(i, companion.m5552getVirtualKey5zf0vsI()) ? 1 : -1);
    }
}

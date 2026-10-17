package androidx.compose.ui.hapticfeedback;

import defpackage.dq;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m5533boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5535equalsimpl(int i, Object obj) {
        return (obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).m5539unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5536equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5537hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5538toStringimpl(int i) {
        Companion companion = Companion;
        return m5536equalsimpl0(i, companion.m5540getConfirm5zf0vsI()) ? "Confirm" : m5536equalsimpl0(i, companion.m5541getContextClick5zf0vsI()) ? "ContextClick" : m5536equalsimpl0(i, companion.m5542getGestureEnd5zf0vsI()) ? "GestureEnd" : m5536equalsimpl0(i, companion.m5543getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m5536equalsimpl0(i, companion.m5544getKeyboardTap5zf0vsI()) ? "KeyboardTap" : m5536equalsimpl0(i, companion.m5545getLongPress5zf0vsI()) ? "LongPress" : m5536equalsimpl0(i, companion.m5546getReject5zf0vsI()) ? "Reject" : m5536equalsimpl0(i, companion.m5547getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m5536equalsimpl0(i, companion.m5548getSegmentTick5zf0vsI()) ? "SegmentTick" : m5536equalsimpl0(i, companion.m5549getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m5536equalsimpl0(i, companion.m5550getToggleOff5zf0vsI()) ? "ToggleOff" : m5536equalsimpl0(i, companion.m5551getToggleOn5zf0vsI()) ? "ToggleOn" : m5536equalsimpl0(i, companion.m5552getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5535equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5537hashCodeimpl(this.value);
    }

    public String toString() {
        return m5538toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5539unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m5540getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5553getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m5541getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5554getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m5542getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5555getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m5543getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5556getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m5544getKeyboardTap5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5557getKeyboardTap5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m5545getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5558getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m5546getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5559getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m5547getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5560getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m5548getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5561getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m5549getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5562getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m5550getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5563getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m5551getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5564getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m5552getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5565getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return y80.E(HapticFeedbackType.m5533boximpl(m5540getConfirm5zf0vsI()), HapticFeedbackType.m5533boximpl(m5541getContextClick5zf0vsI()), HapticFeedbackType.m5533boximpl(m5542getGestureEnd5zf0vsI()), HapticFeedbackType.m5533boximpl(m5543getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m5533boximpl(m5544getKeyboardTap5zf0vsI()), HapticFeedbackType.m5533boximpl(m5545getLongPress5zf0vsI()), HapticFeedbackType.m5533boximpl(m5546getReject5zf0vsI()), HapticFeedbackType.m5533boximpl(m5547getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m5533boximpl(m5548getSegmentTick5zf0vsI()), HapticFeedbackType.m5533boximpl(m5549getTextHandleMove5zf0vsI()), HapticFeedbackType.m5533boximpl(m5550getToggleOff5zf0vsI()), HapticFeedbackType.m5533boximpl(m5551getToggleOn5zf0vsI()), HapticFeedbackType.m5533boximpl(m5552getVirtualKey5zf0vsI()));
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5534constructorimpl(int i) {
        return i;
    }
}

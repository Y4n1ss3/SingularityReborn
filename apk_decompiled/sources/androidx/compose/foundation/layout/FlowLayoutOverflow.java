package androidx.compose.foundation.layout;

import defpackage.bu;
import defpackage.dq;
import defpackage.er;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;
    private final ky collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private final ky seeMoreGetter;
    private final OverflowType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class OverflowType {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ OverflowType[] $VALUES;
        public static final OverflowType Visible = new OverflowType("Visible", 0);
        public static final OverflowType Clip = new OverflowType("Clip", 1);
        public static final OverflowType ExpandIndicator = new OverflowType("ExpandIndicator", 2);
        public static final OverflowType ExpandOrCollapseIndicator = new OverflowType("ExpandOrCollapseIndicator", 3);

        private static final /* synthetic */ OverflowType[] $values() {
            return new OverflowType[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
        }

        static {
            OverflowType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private OverflowType(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2, int i3, dq dqVar) {
        this(overflowType, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : kyVar, (i3 & 16) != 0 ? null : kyVar2, null);
    }

    public final void addOverflowComposables$foundation_layout(FlowLayoutOverflowState flowLayoutOverflowState, List<my> list) {
        ky kyVar = this.seeMoreGetter;
        my myVar = kyVar != null ? (my) kyVar.invoke(flowLayoutOverflowState) : null;
        ky kyVar2 = this.collapseGetter;
        my myVar2 = kyVar2 != null ? (my) kyVar2.invoke(flowLayoutOverflowState) : null;
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            if (myVar != null) {
                list.add(myVar);
            }
        } else {
            if (i != 2) {
                return;
            }
            if (myVar != null) {
                list.add(myVar);
            }
            if (myVar2 != null) {
                list.add(myVar2);
            }
        }
    }

    public final FlowLayoutOverflowState createOverflowState$foundation_layout() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    public final OverflowType getType$foundation_layout() {
        return this.type;
    }

    private FlowLayoutOverflow(OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
        this.seeMoreGetter = kyVar;
        this.collapseGetter = kyVar2;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2, dq dqVar) {
        this(overflowType, i, i2, kyVar, kyVar2);
    }
}

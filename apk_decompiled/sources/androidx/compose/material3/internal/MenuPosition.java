package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MenuPosition {
    public static final int $stable = 0;
    public static final MenuPosition INSTANCE = new MenuPosition();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Horizontal {
        /* renamed from: position-95KtPRI */
        int mo2877position95KtPRI(IntRect intRect, long j, int i, LayoutDirection layoutDirection);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Vertical {
        /* renamed from: position-JVtK1S4 */
        int mo2878positionJVtK1S4(IntRect intRect, long j, int i);
    }

    private MenuPosition() {
    }

    public static /* synthetic */ Vertical bottomToAnchorTop$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.bottomToAnchorTop(i);
    }

    public static /* synthetic */ Vertical bottomToWindowBottom$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.bottomToWindowBottom(i);
    }

    public static /* synthetic */ Vertical centerToAnchorTop$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.centerToAnchorTop(i);
    }

    public static /* synthetic */ Horizontal endToAnchorEnd$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.endToAnchorEnd(i);
    }

    public static /* synthetic */ Horizontal leftToWindowLeft$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.leftToWindowLeft(i);
    }

    public static /* synthetic */ Horizontal rightToWindowRight$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.rightToWindowRight(i);
    }

    public static /* synthetic */ Horizontal startToAnchorStart$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.startToAnchorStart(i);
    }

    public static /* synthetic */ Vertical topToAnchorBottom$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.topToAnchorBottom(i);
    }

    public static /* synthetic */ Vertical topToWindowTop$default(MenuPosition menuPosition, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return menuPosition.topToWindowTop(i);
    }

    public final Vertical bottomToAnchorTop(int i) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.getBottom(), companion.getTop(), i);
    }

    public final Vertical bottomToWindowBottom(int i) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getBottom(), i);
    }

    public final Vertical centerToAnchorTop(int i) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.getCenterVertically(), companion.getTop(), i);
    }

    public final Horizontal endToAnchorEnd(int i) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.getEnd(), companion.getEnd(), i);
    }

    public final Horizontal leftToWindowLeft(int i) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getLeft(), i);
    }

    public final Horizontal rightToWindowRight(int i) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getRight(), i);
    }

    public final Horizontal startToAnchorStart(int i) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.getStart(), companion.getStart(), i);
    }

    public final Vertical topToAnchorBottom(int i) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.getTop(), companion.getBottom(), i);
    }

    public final Vertical topToWindowTop(int i) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getTop(), i);
    }
}

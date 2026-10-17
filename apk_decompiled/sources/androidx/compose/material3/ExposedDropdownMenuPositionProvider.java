package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.bl;
import defpackage.dq;
import defpackage.my;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final State<w01> keyboardSignalState;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final my onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int topWindowInsets;
    private final int verticalMargin;

    public ExposedDropdownMenuPositionProvider(Density density, int i, State<w01> state, int i2, my myVar) {
        this.density = density;
        this.topWindowInsets = i;
        this.keyboardSignalState = state;
        this.verticalMargin = i2;
        this.onPositionCalculated = myVar;
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = MenuPosition.startToAnchorStart$default(menuPosition, 0, 1, null);
        this.endToAnchorEnd = MenuPosition.endToAnchorEnd$default(menuPosition, 0, 1, null);
        this.leftToWindowLeft = MenuPosition.leftToWindowLeft$default(menuPosition, 0, 1, null);
        this.rightToWindowRight = MenuPosition.rightToWindowRight$default(menuPosition, 0, 1, null);
        this.topToAnchorBottom = MenuPosition.topToAnchorBottom$default(menuPosition, 0, 1, null);
        this.bottomToAnchorTop = MenuPosition.bottomToAnchorTop$default(menuPosition, 0, 1, null);
        this.topToWindowTop = menuPosition.topToWindowTop(i2);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$1(IntRect intRect, IntRect intRect2) {
        return w01.a;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        IntRect intRect2;
        char c;
        long j3;
        int i;
        State<w01> state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long m7777constructorimpl = IntSize.m7777constructorimpl(((((int) (j & 4294967295L)) + this.topWindowInsets) & 4294967295L) | (((int) (j >> 32)) << 32));
        int i2 = (int) (m7777constructorimpl >> 32);
        int i3 = 0;
        List E = y80.E(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m7739getXimpl(intRect.m7763getCenternOccac()) < i2 / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = E.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                intRect2 = intRect;
                c = c2;
                j3 = j4;
                i = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i5 = (int) (j2 >> c);
            int i6 = size;
            int i7 = i4;
            intRect2 = intRect;
            List list = E;
            i = ((MenuPosition.Horizontal) E.get(i4)).mo2877position95KtPRI(intRect2, m7777constructorimpl, i5, layoutDirection);
            if (i7 == list.size() - 1 || (i >= 0 && i5 + i <= i2)) {
                break;
            }
            i4 = i7 + 1;
            E = list;
            size = i6;
            c2 = c;
            j4 = j3;
        }
        int i8 = (int) (m7777constructorimpl & j3);
        List E2 = y80.E(this.topToAnchorBottom, this.bottomToAnchorTop, IntOffset.m7740getYimpl(intRect2.m7763getCenternOccac()) < i8 / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = E2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int i10 = (int) (j2 & j3);
            int mo2878positionJVtK1S4 = ((MenuPosition.Vertical) E2.get(i9)).mo2878positionJVtK1S4(intRect2, m7777constructorimpl, i10);
            if (i9 == E2.size() - 1 || (mo2878positionJVtK1S4 >= 0 && i10 + mo2878positionJVtK1S4 <= i8)) {
                i3 = mo2878positionJVtK1S4;
                break;
            }
        }
        long m7733constructorimpl = IntOffset.m7733constructorimpl((i << c) | (i3 & j3));
        this.onPositionCalculated.invoke(intRect2, IntRectKt.m7772IntRectVbeCjmY(m7733constructorimpl, j2));
        return m7733constructorimpl;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final State<w01> getKeyboardSignalState() {
        return this.keyboardSignalState;
    }

    public final my getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i, State state, int i2, my myVar, int i3, dq dqVar) {
        this(density, i, (i3 & 4) != 0 ? null : state, (i3 & 8) != 0 ? density.mo361roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i2, (i3 & 16) != 0 ? new bl(28) : myVar);
    }
}

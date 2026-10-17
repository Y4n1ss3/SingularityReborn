package androidx.compose.material3.internal;

import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.bl;
import defpackage.dq;
import defpackage.j50;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final my onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    private DropdownMenuPositionProvider(long j, Density density, int i, my myVar) {
        this.contentOffset = j;
        this.density = density;
        this.verticalMargin = i;
        this.onPositionCalculated = myVar;
        int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(DpOffset.m7672getXD9Ej5fM(j));
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = menuPosition.startToAnchorStart(mo361roundToPx0680j_4);
        this.endToAnchorEnd = menuPosition.endToAnchorEnd(mo361roundToPx0680j_4);
        this.leftToWindowLeft = menuPosition.leftToWindowLeft(0);
        this.rightToWindowRight = menuPosition.rightToWindowRight(0);
        int mo361roundToPx0680j_42 = density.mo361roundToPx0680j_4(DpOffset.m7674getYD9Ej5fM(j));
        this.topToAnchorBottom = menuPosition.topToAnchorBottom(mo361roundToPx0680j_42);
        this.bottomToAnchorTop = menuPosition.bottomToAnchorTop(mo361roundToPx0680j_42);
        this.centerToAnchorTop = menuPosition.centerToAnchorTop(mo361roundToPx0680j_42);
        this.topToWindowTop = menuPosition.topToWindowTop(i);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$1(IntRect intRect, IntRect intRect2) {
        return w01.a;
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m2894copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density, int i, my myVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i2 & 4) != 0) {
            i = dropdownMenuPositionProvider.verticalMargin;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            myVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m2896copyuVxBXkw(j2, density2, i3, myVar);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        IntRect intRect2;
        long j3;
        char c;
        int i;
        int i2;
        int i3;
        char c2 = ' ';
        int i4 = (int) (j >> 32);
        int i5 = 1;
        List E = y80.E(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m7739getXimpl(intRect.m7763getCenternOccac()) < i4 / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = E.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                intRect2 = intRect;
                j3 = j;
                c = c2;
                i = 0;
                break;
            }
            MenuPosition.Horizontal horizontal = (MenuPosition.Horizontal) E.get(i6);
            int i7 = (int) (j2 >> c2);
            int i8 = size;
            c = c2;
            j3 = j;
            int i9 = i6;
            intRect2 = intRect;
            i = horizontal.mo2877position95KtPRI(intRect2, j3, i7, layoutDirection);
            if (i9 == E.size() - 1 || (i >= 0 && i7 + i <= i4)) {
                break;
            }
            i6 = i9 + 1;
            size = i8;
            c2 = c;
        }
        int i10 = (int) (j3 & 4294967295L);
        List E2 = y80.E(this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, IntOffset.m7740getYimpl(intRect2.m7763getCenternOccac()) < i10 / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = E2.size();
        int i11 = 0;
        while (i11 < size2) {
            int i12 = i5;
            int i13 = (int) (j2 & 4294967295L);
            int mo2878positionJVtK1S4 = ((MenuPosition.Vertical) E2.get(i11)).mo2878positionJVtK1S4(intRect2, j3, i13);
            if (i11 == E2.size() - i12 || (mo2878positionJVtK1S4 >= (i3 = this.verticalMargin) && i13 + mo2878positionJVtK1S4 <= i10 - i3)) {
                i2 = mo2878positionJVtK1S4;
                break;
            }
            i11++;
            i5 = i12;
        }
        i2 = 0;
        long m7733constructorimpl = IntOffset.m7733constructorimpl((i << c) | (i2 & 4294967295L));
        this.onPositionCalculated.invoke(intRect2, IntRectKt.m7772IntRectVbeCjmY(m7733constructorimpl, j2));
        return m7733constructorimpl;
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m2895component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final int component3() {
        return this.verticalMargin;
    }

    public final my component4() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m2896copyuVxBXkw(long j, Density density, int i, my myVar) {
        return new DropdownMenuPositionProvider(j, density, i, myVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m7671equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && q10.b(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && q10.b(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m2897getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final my getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return this.onPositionCalculated.hashCode() + j50.b(this.verticalMargin, (this.density.hashCode() + (DpOffset.m7676hashCodeimpl(this.contentOffset) * 31)) * 31, 31);
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m7679toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, my myVar, dq dqVar) {
        this(j, density, i, myVar);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, int i, my myVar, int i2, dq dqVar) {
        this(j, density, (i2 & 4) != 0 ? density.mo361roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i, (i2 & 8) != 0 ? new bl(27) : myVar, null);
    }
}

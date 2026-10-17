package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ed0;
import defpackage.j50;
import defpackage.jc0;
import defpackage.le0;
import defpackage.mb0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PaddingKt {
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m755PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m756PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValuesImpl(f, f2, f, f2, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m757PaddingValuesYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        return m756PaddingValuesYgX7TsA(f, f2);
    }

    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m758PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValuesImpl(f, f2, f3, f4, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m759PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m7611constructorimpl(0.0f);
        }
        return m758PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m760absolutePaddingqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, false, new le0(f, f2, f3, f4, 1), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m761absolutePaddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m7611constructorimpl(0.0f);
        }
        return m760absolutePaddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 absolutePadding_qDBjuR0$lambda$0(float f, float f2, float f3, float f4, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absolutePadding");
        j50.g(f3, j50.g(f2, j50.g(f, inspectorInfo.getProperties(), "left", inspectorInfo), "top", inspectorInfo), "right", inspectorInfo).set("bottom", Dp.m7609boximpl(f4));
        return w01.a;
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo713calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo712calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo712calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo713calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final Modifier padding(Modifier modifier, PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new mb0(paddingValues, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 padding$lambda$0(PaddingValues paddingValues, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.getProperties().set("paddingValues", paddingValues);
        return w01.a;
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m762padding3ABfNKs(Modifier modifier, float f) {
        return modifier.then(new PaddingElement(f, f, f, f, true, new jc0(f, 1), null));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m763paddingVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new PaddingElement(f, f2, f, f2, true, new ed0(f, f2, 2), null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m764paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        return m763paddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m765paddingqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, true, new le0(f, f2, f3, f4, 0), null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m766paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m7611constructorimpl(0.0f);
        }
        return m765paddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 padding_3ABfNKs$lambda$0(float f, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.setValue(Dp.m7609boximpl(f));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 padding_VpY3zN4$lambda$0(float f, float f2, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        j50.g(f, inspectorInfo.getProperties(), "horizontal", inspectorInfo).set("vertical", Dp.m7609boximpl(f2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 padding_qDBjuR0$lambda$0(float f, float f2, float f3, float f4, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        j50.g(f3, j50.g(f2, j50.g(f, inspectorInfo.getProperties(), "start", inspectorInfo), "top", inspectorInfo), "end", inspectorInfo).set("bottom", Dp.m7609boximpl(f4));
        return w01.a;
    }
}

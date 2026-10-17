package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ManageSearchKt {
    private static ImageVector _manageSearch;

    public static final ImageVector getManageSearch(Icons.Outlined outlined) {
        ImageVector imageVector = _manageSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ManageSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(7.0f, 9.0f, 2.0f, 7.0f, 5.0f);
        k4.B(f, 9.0f, 7.0f, 12.0f, 2.0f);
        k4.p(f, 2.0f, 5.0f, 12.0f);
        f.moveTo(20.59f, 19.0f);
        f.lineToRelative(-3.83f, -3.83f);
        f.curveTo(15.96f, 15.69f, 15.02f, 16.0f, 14.0f, 16.0f);
        f.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        f.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        f.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        f.curveToRelative(0.0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f);
        r6.C(f, 22.0f, 17.59f, 20.59f, 19.0f);
        f.moveTo(17.0f, 11.0f);
        f.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        f.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        f.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        f.reflectiveCurveTo(17.0f, 12.65f, 17.0f, 11.0f);
        r6.B(f, 2.0f, 19.0f, 10.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(f, 2.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageSearch = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getManageSearch$annotations(Icons.Outlined outlined) {
    }
}

package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterCenterFocusKt {
    private static ImageVector _filterCenterFocus;

    public static final ImageVector getFilterCenterFocus(Icons.TwoTone twoTone) {
        ImageVector imageVector = _filterCenterFocus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FilterCenterFocus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(5.0f, 5.0f, 4.0f, 9.0f, 3.0f);
        p.lineTo(5.0f, 3.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.D(p, 4.0f, 2.0f, 5.0f, 5.0f);
        p.moveTo(12.0f, 9.0f);
        p.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        p.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        p.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        p.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        r6.B(p, 19.0f, 3.0f, -4.0f, 2.0f);
        kf0.x(p, 4.0f, 4.0f, 2.0f);
        p.lineTo(21.0f, 5.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(p, 19.0f, 19.0f, -4.0f, 2.0f);
        p.horizontalLineToRelative(4.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.p(p, -4.0f, -2.0f, 4.0f);
        p.moveTo(5.0f, 15.0f);
        p.lineTo(3.0f, 15.0f);
        p.verticalLineToRelative(4.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(p, 4.0f, -2.0f, 5.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterCenterFocus = build;
        build.getClass();
        return build;
    }
}

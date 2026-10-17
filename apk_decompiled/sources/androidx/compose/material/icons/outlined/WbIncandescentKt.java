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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbIncandescentKt {
    private static ImageVector _wbIncandescent;

    public static final ImageVector getWbIncandescent(Icons.Outlined outlined) {
        ImageVector imageVector = _wbIncandescent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WbIncandescent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.55f, 19.09f, 1.41f, 1.41f);
        fc.C(e, 1.79f, -1.8f, -1.41f, -1.41f);
        k4.C(e, 11.0f, 20.0f, 2.0f, 3.0f);
        kp0.A(e, -2.0f, 1.0f, 11.0f, 3.0f);
        kf0.t(e, 2.0f, 1.0f, 13.0f);
        e.moveTo(13.0f, 4.05f);
        e.verticalLineToRelative(3.96f);
        e.lineToRelative(1.0f, 0.58f);
        e.curveToRelative(1.24f, 0.72f, 2.0f, 2.04f, 2.0f, 3.46f);
        e.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        e.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        e.curveToRelative(0.0f, -1.42f, 0.77f, -2.74f, 2.0f, -3.46f);
        e.lineToRelative(1.0f, -0.58f);
        e.lineTo(11.0f, 4.05f);
        e.horizontalLineToRelative(2.0f);
        e.moveToRelative(2.0f, -2.0f);
        e.lineTo(9.0f, 2.05f);
        e.verticalLineToRelative(4.81f);
        e.curveTo(7.21f, 7.9f, 6.0f, 9.83f, 6.0f, 12.05f);
        e.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        e.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        e.curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f);
        uo.l(e, 15.0f, 2.05f, 20.0f, 11.0f);
        j50.n(e, 3.0f, 2.0f, -3.0f);
        e.moveTo(17.24f, 18.71f);
        e.lineToRelative(1.79f, 1.8f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.41f, -1.41f, -1.8f, -1.79f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIncandescent = build;
        build.getClass();
        return build;
    }
}

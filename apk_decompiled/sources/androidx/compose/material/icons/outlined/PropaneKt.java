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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PropaneKt {
    private static ImageVector _propane;

    public static final ImageVector getPropane(Icons.Outlined outlined) {
        ImageVector imageVector = _propane;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Propane", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(17.0f, 6.0f, -1.0f, 5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-4.0f);
        e.curveTo(8.9f, 3.0f, 8.0f, 3.9f, 8.0f, 5.0f);
        e.verticalLineToRelative(1.0f);
        e.horizontalLineTo(7.0f);
        e.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        e.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        r6.D(e, 3.0f, 2.0f, -3.0f, 6.0f);
        kf0.z(e, 3.0f, 2.0f, -3.0f);
        e.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        e.reflectiveCurveTo(20.31f, 6.0f, 17.0f, 6.0f);
        r6.B(e, 10.0f, 5.0f, 4.0f, 1.0f);
        uo.r(e, -4.0f, 5.0f, 17.0f, 16.0f);
        e.horizontalLineTo(7.0f);
        e.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        e.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(e, 19.21f, 16.0f, 17.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _propane = build;
        build.getClass();
        return build;
    }
}

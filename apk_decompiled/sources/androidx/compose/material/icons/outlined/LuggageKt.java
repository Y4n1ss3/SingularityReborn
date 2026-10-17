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
import defpackage.af0;
import defpackage.bv;
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LuggageKt {
    private static ImageVector _luggage;

    public static final ImageVector getLuggage(Icons.Outlined outlined) {
        ImageVector imageVector = _luggage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Luggage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(9.5f, 18.0f, 8.0f, 9.0f, 1.5f);
        k4.D(f, 18.0f, 12.75f, 18.0f, -1.5f);
        c21.c(f, 9.0f, 1.5f, 18.0f);
        j50.y(f, 16.0f, 18.0f, -1.5f, 9.0f);
        bv.s(f, 16.0f, 18.0f, 17.0f, 6.0f);
        f.horizontalLineToRelative(-2.0f);
        f.verticalLineTo(3.0f);
        f.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        f.horizontalLineToRelative(-4.0f);
        f.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        f.verticalLineToRelative(3.0f);
        f.horizontalLineTo(7.0f);
        f.curveTo(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f);
        f.verticalLineToRelative(11.0f);
        f.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        f.horizontalLineToRelative(6.0f);
        f.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f.verticalLineTo(8.0f);
        f.curveTo(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f);
        af0.r(f, 10.5f, 3.5f, 3.0f, 6.0f);
        uo.r(f, -3.0f, 3.5f, 17.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(f, 7.0f, 8.0f, 10.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _luggage = build;
        build.getClass();
        return build;
    }
}

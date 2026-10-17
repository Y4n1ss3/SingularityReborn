package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AllOutKt {
    private static ImageVector _allOut;

    public static final ImageVector getAllOut(Icons.Rounded rounded) {
        ImageVector imageVector = _allOut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AllOut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(4.0f, 4.5f, 4.0f, 8.0f);
        i.lineToRelative(4.0f, -4.0f);
        i.lineTo(4.5f, 4.0f);
        i.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        k4.x(i, 16.0f, 4.0f, 4.0f, 4.0f);
        i.lineTo(20.0f, 4.5f);
        i.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        uo.l(i, 16.0f, 4.0f, 20.0f, 19.5f);
        i.lineTo(20.0f, 16.0f);
        i.lineToRelative(-4.0f, 4.0f);
        i.horizontalLineToRelative(3.5f);
        i.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        k4.r(i, 4.5f, 20.0f, 8.0f, 20.0f);
        i.lineToRelative(-4.0f, -4.0f);
        i.verticalLineToRelative(3.5f);
        i.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        i.close();
        i.moveTo(19.0f, 12.0f);
        i.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        i.reflectiveCurveToRelative(-7.0f, 3.13f, -7.0f, 7.0f);
        i.reflectiveCurveToRelative(3.13f, 7.0f, 7.0f, 7.0f);
        i.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        i.close();
        i.moveTo(12.0f, 17.0f);
        i.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        i.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        i.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allOut = build;
        build.getClass();
        return build;
    }
}

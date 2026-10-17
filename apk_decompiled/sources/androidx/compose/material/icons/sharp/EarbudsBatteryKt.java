package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EarbudsBatteryKt {
    private static ImageVector _earbudsBattery;

    public static final ImageVector getEarbudsBattery(Icons.Sharp sharp) {
        ImageVector imageVector = _earbudsBattery;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EarbudsBattery", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 7.0f, 0.0f, -1.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 1.0f);
        e.lineToRelative(-2.0f, 0.0f);
        e.lineToRelative(0.0f, 11.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 6.0f, 0.0f, 0.0f, -11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(5.38f, 16.5f, 5.38f, 16.5f);
        i.curveToRelative(-1.04f, 0.0f, -1.88f, -0.84f, -1.88f, -1.87f);
        i.verticalLineTo(10.0f);
        i.horizontalLineTo(6.0f);
        i.verticalLineTo(6.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 6.0f, 2.0f, 6.9f, 2.0f, 8.0f);
        i.verticalLineToRelative(6.63f);
        i.curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.37f, 18.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(1.86f, 0.0f, 3.37f, -1.51f, 3.37f, -3.37f);
        i.verticalLineTo(9.37f);
        i.curveToRelative(0.0f, -1.04f, 0.84f, -1.87f, 1.87f, -1.87f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(1.04f, 0.0f, 1.87f, 0.84f, 1.87f, 1.87f);
        bv.A(i, 14.0f, 10.0f, 4.0f, 2.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(9.37f);
        i.curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.63f, 6.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(8.76f, 6.0f, 7.25f, 7.51f, 7.25f, 9.37f);
        i.verticalLineToRelative(5.25f);
        i.curveTo(7.25f, 15.66f, 6.41f, 16.5f, 5.38f, 16.5f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbudsBattery = build;
        build.getClass();
        return build;
    }
}

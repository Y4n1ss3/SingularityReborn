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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.Rounded rounded) {
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberPin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 4.0f, 4.0f, 4.0f);
        i.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        i.lineTo(22.0f, 6.0f);
        i.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(9.0f, 11.5f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        i.horizontalLineToRelative(-2.0f);
        i.verticalLineToRelative(1.25f);
        i.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        i.reflectiveCurveTo(4.0f, 14.66f, 4.0f, 14.25f);
        i.lineTo(4.0f, 10.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(2.5f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        r6.l(i, 1.0f, 12.5f, 14.25f);
        i.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        i.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        i.verticalLineToRelative(-4.5f);
        i.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        i.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        r6.l(i, 4.5f, 20.0f, 14.21f);
        i.curveToRelative(0.0f, 0.44f, -0.35f, 0.79f, -0.79f, 0.79f);
        i.curveToRelative(-0.25f, 0.0f, -0.49f, -0.12f, -0.64f, -0.33f);
        i.lineToRelative(-2.31f, -3.17f);
        i.verticalLineToRelative(2.88f);
        i.curveToRelative(0.0f, 0.34f, -0.28f, 0.62f, -0.62f, 0.62f);
        i.horizontalLineToRelative(-0.01f);
        i.curveToRelative(-0.35f, 0.0f, -0.63f, -0.28f, -0.63f, -0.62f);
        i.lineTo(15.0f, 9.83f);
        i.curveToRelative(0.0f, -0.46f, 0.37f, -0.83f, 0.83f, -0.83f);
        i.curveToRelative(0.27f, 0.0f, 0.52f, 0.13f, 0.67f, 0.35f);
        i.lineToRelative(2.25f, 3.15f);
        i.lineTo(18.75f, 9.62f);
        i.curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f);
        i.horizontalLineToRelative(0.01f);
        i.curveToRelative(0.34f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        bv.m(i, 4.59f, 5.5f, 10.5f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(i, 1.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberPin = build;
        build.getClass();
        return build;
    }
}

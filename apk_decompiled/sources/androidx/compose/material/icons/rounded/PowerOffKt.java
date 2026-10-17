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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.Rounded rounded) {
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PowerOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 13.66f, 18.0f, 8.99f);
        i.curveToRelative(0.0f, -1.0f, -1.01f, -2.0f, -2.0f, -1.99f);
        i.lineTo(16.0f, 4.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        gy.C(i, 3.0f, -3.88f, 7.63f, 7.63f);
        i.curveToRelative(0.15f, -0.3f, 0.25f, -0.63f, 0.25f, -0.97f);
        i.close();
        i.moveTo(10.0f, 4.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(0.88f);
        gy.B(i, 2.0f, 2.0f, 10.0f, 4.0f);
        i.moveTo(20.15f, 19.86f);
        i.lineToRelative(-7.66f, -7.66f);
        i.lineToRelative(-5.1f, -5.1f);
        i.lineToRelative(-2.56f, -2.56f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(2.63f, 2.63f);
        i.curveToRelative(-0.03f, 0.13f, -0.05f, 0.27f, -0.05f, 0.41f);
        i.verticalLineToRelative(4.66f);
        i.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.58f, 1.41f);
        i.lineTo(9.5f, 18.0f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(3.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-2.0f);
        i.lineToRelative(0.48f, -0.48f);
        i.lineToRelative(3.76f, 3.76f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = build;
        build.getClass();
        return build;
    }
}

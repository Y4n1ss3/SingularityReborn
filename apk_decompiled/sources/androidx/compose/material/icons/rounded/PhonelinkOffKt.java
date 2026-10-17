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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkOffKt {
    private static ImageVector _phonelinkOff;

    public static final ImageVector getPhonelinkOff(Icons.Rounded rounded) {
        ImageVector imageVector = _phonelinkOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhonelinkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(24.0f, 19.0f, 9.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-6.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        k4.z(d, 3.61f, 2.0f, 2.0f, 10.0f);
        kf0.x(d, 4.0f, 7.0f, -1.61f);
        d.lineToRelative(2.93f, 2.93f);
        d.curveToRelative(0.39f, -0.13f, 0.68f, -0.49f, 0.68f, -0.93f);
        d.close();
        d.moveTo(21.0f, 6.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineTo(7.39f);
        d.lineToRelative(2.0f, 2.0f);
        d.horizontalLineTo(21.0f);
        d.close();
        d.moveTo(1.36f, 2.21f);
        d.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        d.lineToRelative(1.11f, 1.11f);
        d.curveTo(2.18f, 5.08f, 2.0f, 5.52f, 2.0f, 6.0f);
        d.verticalLineToRelative(11.0f);
        d.horizontalLineToRelative(-0.5f);
        d.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        d.reflectiveCurveTo(0.67f, 20.0f, 1.5f, 20.0f);
        d.horizontalLineToRelative(16.23f);
        d.lineToRelative(1.64f, 1.64f);
        d.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        d.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        d.lineTo(2.77f, 2.21f);
        d.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        bv.g(d, 4.0f, 17.0f, 6.27f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(d, 14.73f, 17.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkOff = build;
        build.getClass();
        return build;
    }
}

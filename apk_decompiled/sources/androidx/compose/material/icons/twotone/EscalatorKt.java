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
import defpackage.af0;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EscalatorKt {
    private static ImageVector _escalator;

    public static final ImageVector getEscalator(Icons.TwoTone twoTone) {
        ImageVector imageVector = _escalator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Escalator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 5.0f, 19.0f, 5.0f);
        kp0.v(i, 0.0f, 14.0f, 5.0f, 5.0f);
        i.horizontalLineTo(19.0f);
        i.moveTo(17.0f, 6.0f);
        i.horizontalLineToRelative(-3.3f);
        i.lineToRelative(-5.0f, 9.0f);
        i.horizontalLineTo(7.0f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        i.reflectiveCurveTo(6.17f, 18.0f, 7.0f, 18.0f);
        r6.t(i, 3.3f, 5.0f, -9.0f, 17.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 17.83f, 6.0f, 17.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(19.0f, 5.0f, 19.0f, 5.0f);
        kp0.v(i2, 0.0f, 14.0f, 5.0f, 5.0f);
        r6.z(i2, 19.0f, 19.0f, 3.0f, 5.0f);
        i2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        i2.verticalLineToRelative(14.0f);
        i2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i2.horizontalLineToRelative(14.0f);
        i2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i2.lineToRelative(0.0f, -14.0f);
        i2.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        uo.l(i2, 19.0f, 3.0f, 17.0f, 6.0f);
        r6.t(i2, -3.3f, -5.0f, 9.0f, 7.0f);
        i2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        i2.reflectiveCurveTo(6.17f, 18.0f, 7.0f, 18.0f);
        r6.t(i2, 3.3f, 5.0f, -9.0f, 17.0f);
        i2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i2, 17.83f, 6.0f, 17.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _escalator = build;
        build.getClass();
        return build;
    }
}

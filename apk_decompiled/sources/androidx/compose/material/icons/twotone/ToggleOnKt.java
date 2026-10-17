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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToggleOnKt {
    private static ImageVector _toggleOn;

    public static final ImageVector getToggleOn(Icons.TwoTone twoTone) {
        ImageVector imageVector = _toggleOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ToggleOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 8.0f, 7.0f, 8.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        i.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        i.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        i.close();
        i.moveTo(17.0f, 15.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(17.0f, 6.0f, 7.0f, 6.0f);
        i2.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        i2.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        i2.horizontalLineToRelative(10.0f);
        i2.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        i2.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        k4.r(i2, 17.0f, 16.0f, 7.0f, 16.0f);
        i2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        i2.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        i2.horizontalLineToRelative(10.0f);
        i2.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        i2.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        i2.close();
        i2.moveTo(17.0f, 9.0f);
        i2.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        i2.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        i2.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i2, -1.34f, -3.0f, -3.0f, -3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toggleOn = build;
        build.getClass();
        return build;
    }
}

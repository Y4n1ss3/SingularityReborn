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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorLensKt {
    private static ImageVector _colorLens;

    public static final ImageVector getColorLens(Icons.Sharp sharp) {
        ImageVector imageVector = _colorLens;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ColorLens", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.curveToRelative(0.0f, -0.39f, -0.15f, -0.74f, -0.39f, -1.01f);
        b.curveToRelative(-0.23f, -0.26f, -0.38f, -0.61f, -0.38f, -0.99f);
        b.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        b.lineTo(16.0f, 16.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.curveToRelative(0.0f, -4.42f, -4.03f, -8.0f, -9.0f, -8.0f);
        b.close();
        b.moveTo(6.5f, 12.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f);
        b.reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f);
        b.reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f);
        b.close();
        b.moveTo(9.5f, 8.0f);
        b.curveTo(8.67f, 8.0f, 8.0f, 7.33f, 8.0f, 6.5f);
        b.reflectiveCurveTo(8.67f, 5.0f, 9.5f, 5.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(10.33f, 8.0f, 9.5f, 8.0f);
        b.close();
        b.moveTo(14.5f, 8.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(13.67f, 5.0f, 14.5f, 5.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(15.33f, 8.0f, 14.5f, 8.0f);
        b.close();
        b.moveTo(17.5f, 12.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _colorLens = build;
        build.getClass();
        return build;
    }
}

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness7Kt {
    private static ImageVector _brightness7;

    public static final ImageVector getBrightness7(Icons.Rounded rounded) {
        ImageVector imageVector = _brightness7;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness7", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 8.69f, 20.0f, 5.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-3.69f);
        i.lineToRelative(-2.6f, -2.6f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineTo(8.69f, 4.0f);
        i.lineTo(5.0f, 4.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(3.69f);
        i.lineToRelative(-2.6f, 2.6f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineTo(4.0f, 15.3f);
        i.lineTo(4.0f, 19.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(3.69f);
        i.lineToRelative(2.6f, 2.6f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(2.6f, -2.6f);
        i.lineTo(19.0f, 20.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-3.69f);
        i.lineToRelative(2.6f, -2.6f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        uo.l(i, 20.0f, 8.69f, 12.0f, 18.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        i.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        i.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        i.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        i.close();
        i.moveTo(12.0f, 8.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        i.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        i.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -1.79f, -4.0f, -4.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness7 = build;
        build.getClass();
        return build;
    }
}

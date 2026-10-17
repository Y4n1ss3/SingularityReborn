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
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.Rounded rounded) {
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Motorcycle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.44f, 9.03f, 17.31f, 6.9f);
        i.lineToRelative(-1.6f, -1.6f);
        i.curveToRelative(-0.19f, -0.19f, -0.45f, -0.3f, -0.71f, -0.3f);
        i.horizontalLineToRelative(-3.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(2.59f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineTo(5.0f, 9.0f);
        i.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        i.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        i.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        i.horizontalLineToRelative(0.82f);
        i.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        i.lineToRelative(2.18f, -2.18f);
        i.curveToRelative(-0.2f, 0.54f, -0.31f, 1.14f, -0.31f, 1.77f);
        i.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        i.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        i.curveToRelative(0.0f, -2.65f, -1.97f, -4.77f, -4.56f, -4.97f);
        af0.l(i, 5.0f, 15.0f, 2.82f);
        i.curveTo(7.4f, 16.15f, 6.28f, 17.0f, 5.0f, 17.0f);
        i.curveToRelative(-1.63f, 0.0f, -3.0f, -1.37f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.37f, -3.0f, 3.0f, -3.0f);
        i.curveToRelative(1.28f, 0.0f, 2.4f, 0.85f, 2.82f, 2.0f);
        i.lineTo(5.0f, 13.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.close();
        i.moveTo(19.0f, 17.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = build;
        build.getClass();
        return build;
    }
}

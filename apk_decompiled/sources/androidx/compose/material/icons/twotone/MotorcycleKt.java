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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Motorcycle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(9.7f, 12.31f, 0.25f, 0.69f, 0.77f);
        b.lineToRelative(2.0f, -2.0f);
        b.horizontalLineTo(8.98f);
        b.curveToRelative(0.3f, 0.39f, 0.54f, 0.83f, 0.72f, 1.31f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.44f, 9.03f, 15.41f, 5.0f);
        af0.m(i, 11.0f, 5.0f, 2.0f, 3.59f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineTo(5.0f, 9.0f);
        i.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        i.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        i.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        i.horizontalLineToRelative(1.65f);
        i.lineToRelative(2.77f, -2.77f);
        i.curveToRelative(-0.21f, 0.54f, -0.32f, 1.14f, -0.32f, 1.77f);
        i.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        i.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        i.curveToRelative(0.0f, -2.65f, -1.97f, -4.77f, -4.56f, -4.97f);
        i.close();
        i.moveTo(7.82f, 15.0f);
        i.curveTo(7.4f, 16.15f, 6.28f, 17.0f, 5.0f, 17.0f);
        i.curveToRelative(-1.63f, 0.0f, -3.0f, -1.37f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.37f, -3.0f, 3.0f, -3.0f);
        i.curveToRelative(1.28f, 0.0f, 2.4f, 0.85f, 2.82f, 2.0f);
        kp0.x(i, 5.0f, 13.0f, 2.0f, 2.82f);
        i.moveTo(10.72f, 13.0f);
        i.horizontalLineToRelative(-0.77f);
        i.lineToRelative(-0.25f, -0.69f);
        i.curveToRelative(-0.18f, -0.48f, -0.42f, -0.92f, -0.72f, -1.31f);
        uo.w(i, 3.74f, -2.0f, 2.0f);
        i.moveTo(19.0f, 17.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = build;
        build.getClass();
        return build;
    }
}

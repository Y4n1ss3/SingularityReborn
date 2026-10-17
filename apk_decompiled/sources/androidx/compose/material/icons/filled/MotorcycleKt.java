package androidx.compose.material.icons.filled;

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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.Filled filled) {
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Motorcycle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.5f, 10.0f);
        b.curveToRelative(-0.03f, 0.0f, -0.05f, 0.01f, -0.08f, 0.01f);
        b.lineTo(13.41f, 6.0f);
        af0.m(b, 9.0f, 6.0f, 2.0f, 3.59f);
        b.lineToRelative(2.0f, 2.0f);
        b.horizontalLineToRelative(-8.1f);
        b.curveTo(4.01f, 10.0f, 2.0f, 12.02f, 2.0f, 14.5f);
        b.curveTo(2.0f, 16.99f, 4.01f, 19.0f, 6.5f, 19.0f);
        b.curveToRelative(2.22f, 0.0f, 4.06f, -1.62f, 4.42f, -3.73f);
        b.lineTo(13.04f, 14.0f);
        b.curveToRelative(-0.02f, 0.17f, -0.04f, 0.33f, -0.04f, 0.5f);
        b.curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.5f, 4.5f);
        b.reflectiveCurveToRelative(4.5f, -2.01f, 4.5f, -4.5f);
        b.reflectiveCurveToRelative(-2.01f, -4.5f, -4.5f, -4.5f);
        b.close();
        b.moveTo(8.84f, 15.26f);
        b.curveTo(8.52f, 16.27f, 7.58f, 17.0f, 6.47f, 17.0f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        b.reflectiveCurveTo(5.09f, 12.0f, 6.47f, 12.0f);
        b.curveToRelative(1.12f, 0.0f, 2.05f, 0.74f, 2.37f, 1.75f);
        b.lineTo(6.0f, 13.75f);
        uo.t(b, 1.5f, 2.84f, 0.01f);
        b.moveTo(17.47f, 17.0f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        b.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.12f, 2.5f, -2.5f, 2.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = build;
        build.getClass();
        return build;
    }
}

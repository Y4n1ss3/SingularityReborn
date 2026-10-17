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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonetizationOnKt {
    private static ImageVector _monetizationOn;

    public static final ImageVector getMonetizationOn(Icons.Filled filled) {
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MonetizationOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        k4.r(b, 13.41f, 18.09f, 13.41f, 20.0f);
        b.horizontalLineToRelative(-2.67f);
        b.verticalLineToRelative(-1.93f);
        b.curveToRelative(-1.71f, -0.36f, -3.16f, -1.46f, -3.27f, -3.4f);
        b.horizontalLineToRelative(1.96f);
        b.curveToRelative(0.1f, 1.05f, 0.82f, 1.87f, 2.65f, 1.87f);
        b.curveToRelative(1.96f, 0.0f, 2.4f, -0.98f, 2.4f, -1.59f);
        b.curveToRelative(0.0f, -0.83f, -0.44f, -1.61f, -2.67f, -2.14f);
        b.curveToRelative(-2.48f, -0.6f, -4.18f, -1.62f, -4.18f, -3.67f);
        b.curveToRelative(0.0f, -1.72f, 1.39f, -2.84f, 3.11f, -3.21f);
        fc.w(b, 10.74f, 4.0f, 2.67f, 1.95f);
        b.curveToRelative(1.86f, 0.45f, 2.79f, 1.86f, 2.85f, 3.39f);
        b.lineTo(14.3f, 9.34f);
        b.curveToRelative(-0.05f, -1.11f, -0.64f, -1.87f, -2.22f, -1.87f);
        b.curveToRelative(-1.5f, 0.0f, -2.4f, 0.68f, -2.4f, 1.64f);
        b.curveToRelative(0.0f, 0.84f, 0.65f, 1.39f, 2.67f, 1.91f);
        b.reflectiveCurveToRelative(4.18f, 1.39f, 4.18f, 3.91f);
        b.curveToRelative(-0.01f, 1.83f, -1.38f, 2.83f, -3.12f, 3.16f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monetizationOn = build;
        build.getClass();
        return build;
    }
}

package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DownhillSkiingKt {
    private static ImageVector _downhillSkiing;

    public static final ImageVector getDownhillSkiing(Icons.Outlined outlined) {
        ImageVector imageVector = _downhillSkiing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DownhillSkiing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 4.5f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f);
        k4.x(b, 15.78f, 20.9f, 0.76f, 0.27f);
        b.curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f);
        b.curveToRelative(0.84f, 0.0f, 1.65f, -0.18f, 2.38f, -0.5f);
        b.lineTo(22.0f, 22.13f);
        b.curveTo(20.95f, 22.68f, 19.76f, 23.0f, 18.5f, 23.0f);
        b.curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f);
        b.lineTo(2.0f, 17.47f);
        b.lineToRelative(0.5f, -1.41f);
        b.lineToRelative(6.9f, 2.51f);
        b.lineToRelative(1.72f, -4.44f);
        b.lineTo(7.55f, 10.4f);
        b.curveTo(6.66f, 9.46f, 6.88f, 7.93f, 8.0f, 7.28f);
        b.lineToRelative(3.48f, -2.01f);
        b.curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f);
        b.lineToRelative(0.33f, 1.08f);
        b.curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f);
        b.lineTo(18.07f, 9.0f);
        b.lineToRelative(1.43f, 0.46f);
        b.lineToRelative(-1.12f, 3.45f);
        b.curveToRelative(-2.45f, -0.4f, -4.48f, -2.07f, -5.38f, -4.32f);
        b.lineToRelative(-2.53f, 1.45f);
        b.lineToRelative(3.03f, 3.46f);
        b.lineToRelative(-2.22f, 5.76f);
        b.lineToRelative(3.09f, 1.12f);
        b.lineToRelative(2.1f, -6.44f);
        b.horizontalLineToRelative(0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 15.78f, 20.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downhillSkiing = build;
        build.getClass();
        return build;
    }
}

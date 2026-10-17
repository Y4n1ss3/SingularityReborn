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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VisibilityOffKt {
    private static ImageVector _visibilityOff;

    public static final ImageVector getVisibilityOff(Icons.Outlined outlined) {
        ImageVector imageVector = _visibilityOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VisibilityOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
        b.curveToRelative(-0.59f, 1.22f, -1.42f, 2.27f, -2.41f, 3.12f);
        b.lineToRelative(1.41f, 1.41f);
        b.curveToRelative(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        b.curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        b.lineToRelative(1.65f, 1.65f);
        b.curveTo(10.66f, 6.09f, 11.32f, 6.0f, 12.0f, 6.0f);
        k4.r(b, 10.93f, 7.14f, 13.0f, 9.21f);
        b.curveToRelative(0.57f, 0.25f, 1.03f, 0.71f, 1.28f, 1.28f);
        b.lineToRelative(2.07f, 2.07f);
        b.curveToRelative(0.08f, -0.34f, 0.14f, -0.7f, 0.14f, -1.07f);
        b.curveTo(16.5f, 9.01f, 14.48f, 7.0f, 12.0f, 7.0f);
        b.curveToRelative(-0.37f, 0.0f, -0.72f, 0.05f, -1.07f, 0.14f);
        k4.x(b, 2.01f, 3.87f, 2.68f, 2.68f);
        b.curveTo(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        b.curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        b.curveToRelative(1.52f, 0.0f, 2.98f, -0.29f, 4.32f, -0.82f);
        b.lineToRelative(3.42f, 3.42f);
        b.lineToRelative(1.41f, -1.41f);
        r6.C(b, 3.42f, 2.45f, 2.01f, 3.87f);
        b.moveTo(9.51f, 11.37f);
        b.lineToRelative(2.61f, 2.61f);
        b.curveToRelative(-0.04f, 0.01f, -0.08f, 0.02f, -0.12f, 0.02f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        b.curveToRelative(0.0f, -0.05f, 0.01f, -0.08f, 0.01f, -0.13f);
        k4.x(b, 6.11f, 7.97f, 1.75f, 1.75f);
        b.curveToRelative(-0.23f, 0.55f, -0.36f, 1.15f, -0.36f, 1.78f);
        b.curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f);
        b.curveToRelative(0.63f, 0.0f, 1.23f, -0.13f, 1.77f, -0.36f);
        b.lineToRelative(0.98f, 0.98f);
        b.curveToRelative(-0.88f, 0.24f, -1.8f, 0.38f, -2.75f, 0.38f);
        b.curveToRelative(-3.79f, 0.0f, -7.17f, -2.13f, -8.82f, -5.5f);
        b.curveToRelative(0.7f, -1.43f, 1.72f, -2.61f, 2.93f, -3.53f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibilityOff = build;
        build.getClass();
        return build;
    }
}

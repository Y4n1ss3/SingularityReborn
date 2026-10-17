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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VisibilityOffKt {
    private static ImageVector _visibilityOff;

    public static final ImageVector getVisibilityOff(Icons.Filled filled) {
        ImageVector imageVector = _visibilityOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VisibilityOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.curveToRelative(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f);
        b.lineToRelative(2.92f, 2.92f);
        b.curveToRelative(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f);
        b.curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        b.curveToRelative(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f);
        b.lineToRelative(2.16f, 2.16f);
        b.curveTo(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f);
        k4.x(b, 2.0f, 4.27f, 2.28f, 2.28f);
        b.lineToRelative(0.46f, 0.46f);
        b.curveTo(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f);
        b.curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        b.curveToRelative(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f);
        b.lineToRelative(0.42f, 0.42f);
        b.lineTo(19.73f, 22.0f);
        b.lineTo(21.0f, 20.73f);
        r6.C(b, 3.27f, 3.0f, 2.0f, 4.27f);
        b.moveTo(7.53f, 9.8f);
        b.lineToRelative(1.55f, 1.55f);
        b.curveToRelative(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.curveToRelative(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        b.lineToRelative(1.55f, 1.55f);
        b.curveToRelative(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f);
        k4.x(b, 11.84f, 9.02f, 3.15f, 3.15f);
        b.lineToRelative(0.02f, -0.16f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -0.17f, 0.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibilityOff = build;
        build.getClass();
        return build;
    }
}

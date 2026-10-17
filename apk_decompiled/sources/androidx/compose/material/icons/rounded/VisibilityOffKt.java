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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VisibilityOffKt {
    private static ImageVector _visibilityOff;

    public static final ImageVector getVisibilityOff(Icons.Rounded rounded) {
        ImageVector imageVector = _visibilityOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VisibilityOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.5f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.curveToRelative(0.0f, 0.51f, -0.1f, 1.0f, -0.24f, 1.46f);
        b.lineToRelative(3.06f, 3.06f);
        b.curveToRelative(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        b.curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        b.lineToRelative(2.17f, 2.17f);
        b.curveToRelative(0.47f, -0.14f, 0.96f, -0.24f, 1.47f, -0.24f);
        b.close();
        b.moveTo(2.71f, 3.16f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(1.97f, 1.97f);
        b.curveTo(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        b.curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        b.curveToRelative(1.52f, 0.0f, 2.97f, -0.3f, 4.31f, -0.82f);
        b.lineToRelative(2.72f, 2.72f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(4.13f, 3.16f);
        b.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        b.close();
        b.moveTo(12.0f, 16.5f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -0.77f, 0.18f, -1.5f, 0.49f, -2.14f);
        b.lineToRelative(1.57f, 1.57f);
        b.curveToRelative(-0.03f, 0.18f, -0.06f, 0.37f, -0.06f, 0.57f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.curveToRelative(0.2f, 0.0f, 0.38f, -0.03f, 0.57f, -0.07f);
        b.lineTo(14.14f, 16.0f);
        b.curveToRelative(-0.65f, 0.32f, -1.37f, 0.5f, -2.14f, 0.5f);
        b.close();
        b.moveTo(14.97f, 11.17f);
        b.curveToRelative(-0.15f, -1.4f, -1.25f, -2.49f, -2.64f, -2.64f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, 2.64f, 2.64f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibilityOff = build;
        build.getClass();
        return build;
    }
}

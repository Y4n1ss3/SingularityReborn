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
public final class AllInclusiveKt {
    private static ImageVector _allInclusive;

    public static final ImageVector getAllInclusive(Icons.Rounded rounded) {
        ImageVector imageVector = _allInclusive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AllInclusive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.22f, 6.86f);
        b.curveToRelative(-2.0f, -0.6f, -4.06f, -0.04f, -5.39f, 1.29f);
        b.lineTo(12.0f, 10.66f);
        b.lineTo(10.48f, 12.0f);
        b.horizontalLineToRelative(0.01f);
        b.lineTo(7.8f, 14.39f);
        b.curveToRelative(-0.81f, 0.81f, -1.95f, 1.15f, -3.12f, 0.92f);
        b.curveToRelative(-1.25f, -0.25f, -2.28f, -1.25f, -2.57f, -2.49f);
        b.curveToRelative(-0.52f, -2.23f, 1.16f, -4.2f, 3.29f, -4.2f);
        b.curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f);
        b.lineToRelative(0.47f, 0.41f);
        b.curveToRelative(0.38f, 0.34f, 0.95f, 0.34f, 1.33f, 0.0f);
        b.curveToRelative(0.45f, -0.4f, 0.45f, -1.1f, 0.0f, -1.5f);
        b.lineToRelative(-0.42f, -0.36f);
        b.curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f);
        b.curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f);
        b.reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f);
        b.curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f);
        b.lineToRelative(2.83f, -2.5f);
        b.lineToRelative(0.01f, 0.01f);
        b.lineTo(13.52f, 12.0f);
        b.horizontalLineToRelative(-0.01f);
        b.lineToRelative(2.69f, -2.39f);
        b.curveToRelative(0.81f, -0.81f, 1.95f, -1.15f, 3.12f, -0.92f);
        b.curveToRelative(1.25f, 0.25f, 2.28f, 1.25f, 2.57f, 2.49f);
        b.curveToRelative(0.52f, 2.23f, -1.16f, 4.2f, -3.29f, 4.2f);
        b.curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f);
        b.lineToRelative(-0.48f, -0.42f);
        b.curveToRelative(-0.38f, -0.34f, -0.95f, -0.34f, -1.33f, 0.0f);
        b.curveToRelative(-0.45f, 0.4f, -0.45f, 1.1f, 0.0f, 1.5f);
        b.lineToRelative(0.42f, 0.37f);
        b.curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f);
        b.curveToRelative(3.27f, 0.0f, 5.86f, -2.9f, 5.33f, -6.25f);
        b.curveToRelative(-0.3f, -1.99f, -1.77f, -3.69f, -3.7f, -4.26f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInclusive = build;
        build.getClass();
        return build;
    }
}

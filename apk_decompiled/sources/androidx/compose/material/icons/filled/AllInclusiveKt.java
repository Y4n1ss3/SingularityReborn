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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AllInclusiveKt {
    private static ImageVector _allInclusive;

    public static final ImageVector getAllInclusive(Icons.Filled filled) {
        ImageVector imageVector = _allInclusive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AllInclusive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.6f, 6.62f);
        b.curveToRelative(-1.44f, 0.0f, -2.8f, 0.56f, -3.77f, 1.53f);
        b.lineTo(12.0f, 10.66f);
        b.lineTo(10.48f, 12.0f);
        b.horizontalLineToRelative(0.01f);
        b.lineTo(7.8f, 14.39f);
        b.curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f);
        b.curveToRelative(-1.87f, 0.0f, -3.39f, -1.51f, -3.39f, -3.38f);
        b.reflectiveCurveTo(3.53f, 8.62f, 5.4f, 8.62f);
        b.curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f);
        b.lineToRelative(1.13f, 1.0f);
        b.lineToRelative(1.51f, -1.34f);
        b.lineTo(9.22f, 8.2f);
        b.curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f);
        b.curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f);
        b.reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f);
        b.curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f);
        b.lineToRelative(2.83f, -2.5f);
        b.lineToRelative(0.01f, 0.01f);
        b.lineTo(13.52f, 12.0f);
        b.horizontalLineToRelative(-0.01f);
        b.lineToRelative(2.69f, -2.39f);
        b.curveToRelative(0.64f, -0.64f, 1.49f, -0.99f, 2.4f, -0.99f);
        b.curveToRelative(1.87f, 0.0f, 3.39f, 1.51f, 3.39f, 3.38f);
        b.reflectiveCurveToRelative(-1.52f, 3.38f, -3.39f, 3.38f);
        b.curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f);
        b.lineToRelative(-1.14f, -1.01f);
        b.lineToRelative(-1.51f, 1.34f);
        b.lineToRelative(1.27f, 1.12f);
        b.curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f);
        b.curveToRelative(2.98f, 0.0f, 5.4f, -2.41f, 5.4f, -5.38f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -2.42f, -5.37f, -5.4f, -5.37f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInclusive = build;
        build.getClass();
        return build;
    }
}

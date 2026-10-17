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
public final class ShareKt {
    private static ImageVector _share;

    public static final ImageVector getShare(Icons.Filled filled) {
        ImageVector imageVector = _share;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Share", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 16.08f);
        b.curveToRelative(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        b.lineTo(8.91f, 12.7f);
        b.curveToRelative(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        b.reflectiveCurveToRelative(-0.04f, -0.47f, -0.09f, -0.7f);
        b.lineToRelative(7.05f, -4.11f);
        b.curveToRelative(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        b.curveToRelative(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        b.lineTo(8.04f, 9.81f);
        b.curveTo(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        b.curveToRelative(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        b.lineToRelative(7.12f, 4.16f);
        b.curveToRelative(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        b.curveToRelative(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        b.curveToRelative(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.31f, -2.92f, -2.92f, -2.92f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _share = build;
        build.getClass();
        return build;
    }
}

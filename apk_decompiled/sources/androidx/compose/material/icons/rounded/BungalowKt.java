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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BungalowKt {
    private static ImageVector _bungalow;

    public static final ImageVector getBungalow(Icons.Rounded rounded) {
        ImageVector imageVector = _bungalow;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Bungalow", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 16.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-5.21f);
        b.lineToRelative(0.57f, 0.92f);
        b.curveToRelative(0.29f, 0.47f, 0.91f, 0.61f, 1.38f, 0.32f);
        b.curveToRelative(0.47f, -0.29f, 0.61f, -0.91f, 0.32f, -1.38f);
        b.lineTo(12.85f, 4.36f);
        b.curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0.0f);
        b.lineTo(4.73f, 14.65f);
        b.curveToRelative(-0.29f, 0.47f, -0.15f, 1.09f, 0.32f, 1.38f);
        b.curveToRelative(0.47f, 0.29f, 1.08f, 0.15f, 1.38f, -0.32f);
        b.lineTo(7.0f, 14.8f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveTo(11.0f, 16.45f, 11.45f, 16.0f, 12.0f, 16.0f);
        b.close();
        b.moveTo(13.0f, 13.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.0f, 12.45f, 13.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bungalow = build;
        build.getClass();
        return build;
    }
}

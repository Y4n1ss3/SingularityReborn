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
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToysKt {
    private static ImageVector _toys;

    public static final ImageVector getToys(Icons.Filled filled) {
        ImageVector imageVector = _toys;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Toys", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 14.0f);
        b.curveToRelative(0.0f, -1.95f, -1.4f, -3.57f, -3.25f, -3.92f);
        b.lineTo(17.4f, 6.05f);
        b.curveTo(17.0f, 4.82f, 15.85f, 4.0f, 14.56f, 4.0f);
        b.horizontalLineTo(9.44f);
        b.curveTo(8.15f, 4.0f, 7.0f, 4.82f, 6.6f, 6.05f);
        b.lineTo(5.81f, 8.4f);
        b.lineTo(4.41f, 7.0f);
        b.lineToRelative(0.29f, -0.29f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(-2.0f, 2.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineTo(3.0f, 8.41f);
        b.lineToRelative(1.79f, 1.79f);
        b.curveTo(3.18f, 10.72f, 2.0f, 12.22f, 2.0f, 14.0f);
        b.curveToRelative(0.0f, 1.5f, 0.83f, 2.79f, 2.05f, 3.48f);
        b.curveTo(4.28f, 18.9f, 5.51f, 20.0f, 7.0f, 20.0f);
        b.curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        b.horizontalLineToRelative(4.37f);
        b.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        b.curveToRelative(1.49f, 0.0f, 2.72f, -1.1f, 2.95f, -2.52f);
        b.curveTo(21.17f, 16.79f, 22.0f, 15.5f, 22.0f, 14.0f);
        b.close();
        b.moveTo(7.0f, 18.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f);
        r6.g(b, 11.0f, 10.0f, 7.41f);
        b.lineTo(7.39f, 9.98f);
        b.lineToRelative(1.1f, -3.3f);
        b.curveTo(8.63f, 6.27f, 9.01f, 6.0f, 9.44f, 6.0f);
        bv.s(b, 11.0f, 10.0f, 13.0f, 6.0f);
        b.horizontalLineToRelative(1.56f);
        b.curveToRelative(0.43f, 0.0f, 0.81f, 0.27f, 0.95f, 0.68f);
        b.lineTo(16.61f, 10.0f);
        b.horizontalLineTo(13.0f);
        b.verticalLineTo(6.0f);
        b.close();
        b.moveTo(17.0f, 18.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 17.55f, 18.0f, 17.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toys = build;
        build.getClass();
        return build;
    }
}

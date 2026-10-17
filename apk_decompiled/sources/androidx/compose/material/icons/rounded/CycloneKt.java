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
import defpackage.af0;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CycloneKt {
    private static ImageVector _cyclone;

    public static final ImageVector getCyclone(Icons.Rounded rounded) {
        ImageVector imageVector = _cyclone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cyclone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 8.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveTo(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f);
        b.close();
        b.moveTo(12.0f, 14.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 6.11f, 22.0f, 6.11f);
        i.curveToRelative(0.0f, -0.46f, -0.3f, -0.86f, -0.74f, -0.97f);
        i.curveTo(19.23f, 4.6f, 16.03f, 4.0f, 12.0f, 4.0f);
        i.curveTo(9.85f, 4.0f, 7.89f, 4.86f, 6.46f, 6.24f);
        i.curveToRelative(0.1f, -0.65f, 0.28f, -1.69f, 0.62f, -2.96f);
        i.curveTo(7.25f, 2.64f, 6.78f, 2.0f, 6.11f, 2.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(5.66f, 2.0f, 5.26f, 2.3f, 5.14f, 2.74f);
        i.curveTo(4.6f, 4.77f, 4.0f, 7.97f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f);
        i.curveToRelative(-0.65f, -0.1f, -1.69f, -0.28f, -2.96f, -0.62f);
        i.curveTo(2.64f, 16.75f, 2.0f, 17.22f, 2.0f, 17.89f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f);
        i.curveTo(4.77f, 19.4f, 7.97f, 20.0f, 12.0f, 20.0f);
        i.curveToRelative(2.15f, 0.0f, 4.11f, -0.86f, 5.54f, -2.24f);
        i.curveToRelative(-0.1f, 0.65f, -0.28f, 1.69f, -0.62f, 2.96f);
        i.curveToRelative(-0.17f, 0.64f, 0.3f, 1.28f, 0.97f, 1.28f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.46f, 0.0f, 0.86f, -0.3f, 0.97f, -0.74f);
        i.curveTo(19.4f, 19.23f, 20.0f, 16.03f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f);
        i.curveToRelative(0.65f, 0.1f, 1.69f, 0.28f, 2.96f, 0.62f);
        i.curveTo(21.36f, 7.25f, 22.0f, 6.78f, 22.0f, 6.11f);
        i.close();
        i.moveTo(12.0f, 18.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        i.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        i.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 15.31f, 18.0f, 12.0f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cyclone = build;
        build.getClass();
        return build;
    }
}

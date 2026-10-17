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
import defpackage.af0;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BreakfastDiningKt {
    private static ImageVector _breakfastDining;

    public static final ImageVector getBreakfastDining(Icons.Outlined outlined) {
        ImageVector imageVector = _breakfastDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BreakfastDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 3.0f, 6.0f);
        d.curveTo(3.79f, 3.0f, 2.0f, 4.79f, 2.0f, 7.0f);
        d.curveToRelative(0.0f, 1.48f, 0.81f, 2.75f, 2.0f, 3.45f);
        d.verticalLineTo(19.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-8.55f);
        d.curveToRelative(1.19f, -0.69f, 2.0f, -1.97f, 2.0f, -3.45f);
        d.curveTo(22.0f, 4.79f, 20.21f, 3.0f, 18.0f, 3.0f);
        k4.r(d, 19.0f, 8.72f, 18.0f, 9.3f);
        uo.j(d, 19.0f, 6.0f, 9.31f);
        d.lineTo(5.01f, 8.73f);
        d.curveTo(4.38f, 8.35f, 4.0f, 7.71f, 4.0f, 7.0f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        d.curveTo(20.0f, 7.71f, 19.62f, 8.36f, 19.0f, 8.72f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.71f, 9.29f);
        b.curveTo(12.51f, 9.1f, 12.26f, 9.0f, 12.0f, 9.0f);
        b.reflectiveCurveToRelative(-0.51f, 0.1f, -0.71f, 0.29f);
        b.lineToRelative(-3.0f, 3.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(3.0f, 3.0f);
        b.curveTo(11.49f, 16.9f, 11.74f, 17.0f, 12.0f, 17.0f);
        b.reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f);
        b.lineToRelative(3.0f, -3.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        uo.l(b, 12.71f, 9.29f, 12.0f, 14.58f);
        b.lineTo(10.41f, 13.0f);
        b.lineTo(12.0f, 11.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 13.59f, 13.0f, 12.0f, 14.58f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _breakfastDining = build;
        build.getClass();
        return build;
    }
}

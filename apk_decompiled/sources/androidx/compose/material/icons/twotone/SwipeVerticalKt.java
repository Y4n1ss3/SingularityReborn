package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeVerticalKt {
    private static ImageVector _swipeVertical;

    public static final ImageVector getSwipeVertical(Icons.TwoTone twoTone) {
        ImageVector imageVector = _swipeVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwipeVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.49f, 17.34f, 15.5f, 20.0f);
        i.lineToRelative(-4.92f, -1.96f);
        i.lineToRelative(4.18f, -0.88f);
        i.lineToRelative(-4.3f, -9.7f);
        i.curveToRelative(-0.11f, -0.25f, 0.0f, -0.55f, 0.25f, -0.66f);
        i.curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.25f);
        i.lineToRelative(2.5f, 5.65f);
        i.lineToRelative(1.61f, -0.71f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 20.13f, 12.0f, 21.49f, 17.34f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        uo.j(pathBuilder, 7.0f, 4.5f, 4.09f);
        pathBuilder.curveToRelative(-1.86f, 2.11f, -3.0f, 4.88f, -3.0f, 7.91f);
        pathBuilder.reflectiveCurveToRelative(1.14f, 5.79f, 3.0f, 7.91f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineTo(4.5f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveTo(1.13f, 18.18f, 0.0f, 15.22f, 0.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.13f, -6.18f, 3.02f, -8.5f);
        bv.s(pathBuilder, 1.0f, 2.0f, 20.22f, 10.0f);
        pathBuilder.lineToRelative(-4.15f, 0.01f);
        pathBuilder.curveToRelative(-0.16f, -0.01f, -0.31f, 0.02f, -0.45f, 0.08f);
        pathBuilder.lineToRelative(-0.59f, 0.26f);
        pathBuilder.lineTo(13.2f, 6.25f);
        pathBuilder.curveToRelative(-0.56f, -1.26f, -2.04f, -1.83f, -3.3f, -1.27f);
        pathBuilder.reflectiveCurveToRelative(-1.83f, 2.04f, -1.27f, 3.3f);
        pathBuilder.lineToRelative(3.3f, 7.45f);
        pathBuilder.lineToRelative(-1.87f, 0.39f);
        pathBuilder.curveToRelative(-0.19f, 0.05f, -0.99f, 0.27f, -1.36f, 1.21f);
        pathBuilder.lineTo(8.0f, 19.19f);
        pathBuilder.lineToRelative(6.78f, 2.67f);
        pathBuilder.curveToRelative(0.49f, 0.19f, 1.05f, 0.18f, 1.53f, -0.04f);
        pathBuilder.lineToRelative(5.99f, -2.65f);
        pathBuilder.curveToRelative(0.89f, -0.4f, 1.37f, -1.38f, 1.13f, -2.32f);
        pathBuilder.lineToRelative(-1.36f, -5.34f);
        pathBuilder.curveTo(21.85f, 10.65f, 21.1f, 10.04f, 20.22f, 10.0f);
        k4.r(pathBuilder, 21.49f, 17.34f, 15.5f, 20.0f);
        pathBuilder.lineToRelative(-4.92f, -1.96f);
        pathBuilder.lineToRelative(4.18f, -0.88f);
        pathBuilder.lineToRelative(-4.3f, -9.7f);
        pathBuilder.curveToRelative(-0.11f, -0.25f, 0.0f, -0.55f, 0.25f, -0.66f);
        pathBuilder.curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.25f);
        pathBuilder.lineToRelative(2.5f, 5.65f);
        pathBuilder.lineToRelative(1.61f, -0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(pathBuilder, 20.13f, 12.0f, 21.49f, 17.34f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeVertical = build;
        build.getClass();
        return build;
    }
}

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
public final class TollKt {
    private static ImageVector _toll;

    public static final ImageVector getToll(Icons.Rounded rounded) {
        ImageVector imageVector = _toll;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Toll", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f);
        b.close();
        b.moveTo(15.0f, 18.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        b.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        b.close();
        b.moveTo(3.0f, 12.0f);
        b.curveToRelative(0.0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f);
        b.curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f);
        b.verticalLineToRelative(-0.19f);
        b.curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f);
        b.curveTo(2.92f, 5.99f, 1.0f, 8.77f, 1.0f, 12.0f);
        b.reflectiveCurveToRelative(1.92f, 6.01f, 4.68f, 7.27f);
        b.curveToRelative(0.61f, 0.28f, 1.32f, -0.14f, 1.32f, -0.82f);
        b.verticalLineToRelative(-0.18f);
        b.curveToRelative(0.0f, -0.37f, -0.23f, -0.69f, -0.57f, -0.85f);
        b.curveTo(4.4f, 16.46f, 3.0f, 14.39f, 3.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toll = build;
        build.getClass();
        return build;
    }
}

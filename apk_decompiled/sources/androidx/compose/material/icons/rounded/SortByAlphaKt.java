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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Rounded rounded) {
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SortByAlpha", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.93f, 2.65f);
        b.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        b.lineToRelative(-2.01f, 2.01f);
        uo.w(b, 4.72f, -2.0f, -2.01f);
        b.moveTo(12.23f, 21.35f);
        b.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        b.lineToRelative(1.98f, -1.98f);
        uo.w(b, -4.66f, 1.97f, 1.98f);
        b.moveTo(10.98f, 17.73f);
        b.curveToRelative(0.6f, 0.0f, 1.01f, -0.6f, 0.79f, -1.16f);
        b.lineTo(8.04f, 7.03f);
        b.curveToRelative(-0.18f, -0.46f, -0.63f, -0.76f, -1.12f, -0.76f);
        b.curveToRelative(-0.49f, 0.0f, -0.94f, 0.3f, -1.12f, 0.76f);
        b.lineToRelative(-3.74f, 9.53f);
        b.curveToRelative(-0.22f, 0.56f, 0.19f, 1.16f, 0.79f, 1.16f);
        b.curveToRelative(0.35f, 0.0f, 0.67f, -0.22f, 0.8f, -0.55f);
        b.lineToRelative(0.71f, -1.9f);
        b.horizontalLineToRelative(5.11f);
        b.lineToRelative(0.71f, 1.9f);
        b.curveToRelative(0.13f, 0.34f, 0.45f, 0.56f, 0.8f, 0.56f);
        k4.x(b, 4.97f, 13.64f, 1.94f, -5.18f);
        gy.B(b, 1.94f, 5.18f, 4.97f, 13.64f);
        b.moveTo(21.05f, 16.14f);
        b.horizontalLineToRelative(-5.33f);
        b.lineToRelative(5.72f, -8.29f);
        b.curveToRelative(0.46f, -0.66f, -0.02f, -1.57f, -0.82f, -1.57f);
        b.horizontalLineToRelative(-6.48f);
        b.curveToRelative(-0.44f, 0.0f, -0.79f, 0.36f, -0.79f, 0.8f);
        b.verticalLineToRelative(0.01f);
        b.curveToRelative(0.0f, 0.44f, 0.36f, 0.8f, 0.79f, 0.8f);
        b.horizontalLineToRelative(5.09f);
        b.lineToRelative(-5.73f, 8.28f);
        b.curveToRelative(-0.46f, 0.66f, 0.02f, 1.57f, 0.82f, 1.57f);
        b.horizontalLineToRelative(6.72f);
        b.curveToRelative(0.44f, 0.0f, 0.79f, -0.36f, 0.79f, -0.79f);
        b.curveToRelative(0.02f, -0.45f, -0.34f, -0.81f, -0.78f, -0.81f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = build;
        build.getClass();
        return build;
    }
}

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
import defpackage.er;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _360Kt {
    private static ImageVector __360;

    public static final ImageVector get_360(Icons.Rounded rounded) {
        ImageVector imageVector = __360;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._360", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveTo(6.48f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 2.24f, 2.94f, 4.13f, 7.0f, 4.77f);
        b.verticalLineToRelative(2.02f);
        b.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        b.lineToRelative(2.79f, -2.79f);
        b.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        b.lineToRelative(-2.79f, -2.79f);
        b.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        b.verticalLineToRelative(1.52f);
        b.curveToRelative(-3.15f, -0.56f, -5.0f, -1.9f, -5.0f, -2.73f);
        b.curveToRelative(0.0f, -1.06f, 3.04f, -3.0f, 8.0f, -3.0f);
        b.reflectiveCurveToRelative(8.0f, 1.94f, 8.0f, 3.0f);
        b.curveToRelative(0.0f, 0.66f, -1.2f, 1.68f, -3.32f, 2.34f);
        b.curveToRelative(-0.41f, 0.13f, -0.68f, 0.51f, -0.68f, 0.94f);
        b.curveToRelative(0.0f, 0.67f, 0.65f, 1.16f, 1.28f, 0.96f);
        b.curveTo(20.11f, 15.36f, 22.0f, 13.79f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -2.76f, -4.48f, -5.0f, -10.0f, -5.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __360 = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void get_360$annotations(Icons.Rounded rounded) {
    }
}

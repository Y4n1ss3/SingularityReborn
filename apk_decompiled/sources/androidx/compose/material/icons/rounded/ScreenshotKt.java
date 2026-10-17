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
import defpackage.c21;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenshotKt {
    private static ImageVector _screenshot;

    public static final ImageVector getScreenshot(Icons.Rounded rounded) {
        ImageVector imageVector = _screenshot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Screenshot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 1.01f, 7.0f, 1.0f);
        i.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        i.verticalLineToRelative(18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(3.0f);
        i.curveTo(19.0f, 1.9f, 18.1f, 1.01f, 17.0f, 1.01f);
        c21.d(i, 17.0f, 18.0f, 7.0f, 6.0f);
        uo.r(i, 10.0f, 18.0f, 9.5f, 8.5f);
        i.horizontalLineToRelative(1.75f);
        i.curveTo(11.66f, 8.5f, 12.0f, 8.16f, 12.0f, 7.75f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(12.0f, 7.34f, 11.66f, 7.0f, 11.25f, 7.0f);
        i.horizontalLineToRelative(-2.5f);
        i.curveTo(8.34f, 7.0f, 8.0f, 7.34f, 8.0f, 7.75f);
        i.verticalLineToRelative(2.5f);
        i.curveTo(8.0f, 10.66f, 8.34f, 11.0f, 8.75f, 11.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        k4.D(i, 8.5f, 12.75f, 17.0f, 2.5f);
        i.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        i.verticalLineToRelative(-2.5f);
        i.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        i.verticalLineToRelative(1.75f);
        i.horizontalLineToRelative(-1.75f);
        i.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(12.0f, 16.66f, 12.34f, 17.0f, 12.75f, 17.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenshot = build;
        build.getClass();
        return build;
    }
}

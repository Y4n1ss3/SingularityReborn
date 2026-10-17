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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppShortcutKt {
    private static ImageVector _appShortcut;

    public static final ImageVector getAppShortcut(Icons.Rounded rounded) {
        ImageVector imageVector = _appShortcut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AppShortcut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(17.0f, 18.0f, 7.0f, 6.0f, 10.0f);
        bv.x(f, 1.0f, 2.0f, 3.0f);
        f.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f.horizontalLineTo(7.0f);
        f.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        f.verticalLineToRelative(18.0f);
        f.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.horizontalLineToRelative(10.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(f, -4.0f, -2.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.38f, 9.62f, 0.4f, 0.87f);
        e.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        e.lineToRelative(0.4f, -0.87f);
        e.lineToRelative(0.87f, -0.4f);
        e.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        e.lineToRelative(-0.87f, -0.4f);
        e.lineToRelative(-0.4f, -0.87f);
        e.curveToRelative(-0.09f, -0.2f, -0.37f, -0.2f, -0.46f, 0.0f);
        e.lineToRelative(-0.4f, 0.87f);
        e.lineToRelative(-0.87f, 0.4f);
        e.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 20.38f, 9.62f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(15.54f, 9.0f, -0.79f, 1.75f);
        e2.lineTo(13.0f, 11.54f);
        e2.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        e2.lineToRelative(1.75f, 0.79f);
        e2.lineTo(15.54f, 15.0f);
        e2.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        e2.lineToRelative(0.79f, -1.75f);
        e2.lineTo(19.0f, 12.46f);
        e2.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        e2.lineToRelative(-1.75f, -0.79f);
        e2.lineTo(16.46f, 9.0f);
        e2.curveTo(16.28f, 8.61f, 15.72f, 8.61f, 15.54f, 9.0f);
        e2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e3 = k4.e(20.77f, 13.5f, -0.4f, 0.87f);
        e3.lineToRelative(-0.87f, 0.4f);
        e3.curveToRelative(-0.2f, 0.09f, -0.2f, 0.37f, 0.0f, 0.46f);
        e3.lineToRelative(0.87f, 0.4f);
        e3.lineToRelative(0.4f, 0.87f);
        e3.curveToRelative(0.09f, 0.2f, 0.37f, 0.2f, 0.46f, 0.0f);
        e3.lineToRelative(0.4f, -0.87f);
        e3.lineToRelative(0.87f, -0.4f);
        e3.curveToRelative(0.2f, -0.09f, 0.2f, -0.37f, 0.0f, -0.46f);
        e3.lineToRelative(-0.87f, -0.4f);
        e3.lineToRelative(-0.4f, -0.87f);
        e3.curveTo(21.14f, 13.31f, 20.86f, 13.31f, 20.77f, 13.5f);
        e3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e3.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appShortcut = build;
        build.getClass();
        return build;
    }
}

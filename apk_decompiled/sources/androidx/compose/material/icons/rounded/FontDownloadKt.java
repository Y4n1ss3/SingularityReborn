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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FontDownloadKt {
    private static ImageVector _fontDownload;

    public static final ImageVector getFontDownload(Icons.Rounded rounded) {
        ImageVector imageVector = _fontDownload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FontDownload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(9.93f, 13.5f, 4.14f, 12.0f, 7.98f);
        uo.l(p, 9.93f, 13.5f, 20.0f, 2.0f);
        p.lineTo(4.0f, 2.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(16.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(22.0f, 4.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(p, 15.71f, 17.88f, -0.9f, -2.38f);
        p.lineTo(9.17f, 15.5f);
        p.lineToRelative(-0.89f, 2.37f);
        p.curveToRelative(-0.14f, 0.38f, -0.5f, 0.63f, -0.91f, 0.63f);
        p.curveToRelative(-0.68f, 0.0f, -1.15f, -0.69f, -0.9f, -1.32f);
        p.lineToRelative(4.25f, -10.81f);
        p.curveToRelative(0.22f, -0.53f, 0.72f, -0.87f, 1.28f, -0.87f);
        p.reflectiveCurveToRelative(1.06f, 0.34f, 1.27f, 0.87f);
        p.lineToRelative(4.25f, 10.81f);
        p.curveToRelative(0.25f, 0.63f, -0.22f, 1.32f, -0.9f, 1.32f);
        p.curveToRelative(-0.4f, 0.0f, -0.76f, -0.25f, -0.91f, -0.62f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownload = build;
        build.getClass();
        return build;
    }
}

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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Rounded rounded) {
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LinkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(14.0f, 9.0f, 2.87f);
        a.curveToRelative(1.46f, 0.0f, 2.8f, 0.98f, 3.08f, 2.42f);
        a.curveToRelative(0.31f, 1.64f, -0.74f, 3.11f, -2.22f, 3.48f);
        a.lineToRelative(1.53f, 1.53f);
        a.curveToRelative(1.77f, -0.91f, 2.95f, -2.82f, 2.7f, -5.01f);
        a.curveTo(21.68f, 8.86f, 19.37f, 7.0f, 16.79f, 7.0f);
        a.horizontalLineTo(14.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.curveTo(13.0f, 8.55f, 13.45f, 9.0f, 14.0f, 9.0f);
        a.close();
        a.moveTo(3.51f, 3.51f);
        a.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        a.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        a.lineToRelative(2.64f, 2.64f);
        a.curveToRelative(-1.77f, 0.91f, -2.95f, 2.82f, -2.7f, 5.01f);
        a.curveTo(2.32f, 15.14f, 4.63f, 17.0f, 7.21f, 17.0f);
        a.horizontalLineTo(10.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.horizontalLineTo(7.13f);
        a.curveToRelative(-1.46f, 0.0f, -2.8f, -0.98f, -3.08f, -2.42f);
        a.curveTo(3.74f, 10.94f, 4.8f, 9.47f, 6.27f, 9.1f);
        a.lineToRelative(2.12f, 2.12f);
        a.curveTo(8.16f, 11.41f, 8.0f, 11.68f, 8.0f, 12.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(1.17f);
        a.lineToRelative(8.9f, 8.9f);
        a.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        a.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        uo.l(a, 3.51f, 3.51f, 14.0f, 11.0f);
        a.lineToRelative(1.71f, 1.71f);
        a.curveTo(15.89f, 12.53f, 16.0f, 12.28f, 16.0f, 12.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(a, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = build;
        build.getClass();
        return build;
    }
}

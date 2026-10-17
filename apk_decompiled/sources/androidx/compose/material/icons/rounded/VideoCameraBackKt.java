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
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoCameraBackKt {
    private static ImageVector _videoCameraBack;

    public static final ImageVector getVideoCameraBack(Icons.Rounded rounded) {
        ImageVector imageVector = _videoCameraBack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VideoCameraBack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 10.48f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-4.48f);
        d.lineToRelative(3.15f, 3.13f);
        d.curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f);
        d.verticalLineTo(7.7f);
        d.curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f);
        uo.l(d, 18.0f, 10.48f, 5.6f, 15.2f);
        d.lineToRelative(1.38f, -1.83f);
        d.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        d.lineTo(9.0f, 15.0f);
        d.lineToRelative(2.23f, -2.97f);
        d.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        d.lineToRelative(2.38f, 3.17f);
        d.curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        d.horizontalLineTo(6.0f);
        d.curveTo(5.59f, 16.0f, 5.35f, 15.53f, 5.6f, 15.2f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoCameraBack = build;
        build.getClass();
        return build;
    }
}
